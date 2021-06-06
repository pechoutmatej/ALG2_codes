package cz.tul.alg.matpech.oop;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Race {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
    static DateTimeFormatter dtftime = DateTimeFormatter.ofPattern("HH:mm:ss");
    private List<Competitor> runners;

    public Race() {
        runners = new ArrayList<>();
    }

    public void loadReg(String registrationFile) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(new File(registrationFile))))
        {
            String line;
            Competitor r;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int number = Integer.parseInt(parts[0]);
                String[] fullName = parts[1].split(" ");
                String surName = fullName[0];
                String firstName = fullName[1];
                String sex = parts[2];
                LocalDate birthDate = LocalDate.parse(parts[3], dtf);
                String club = parts[4];
                String nationality = parts[5];
                r = new Competitor(firstName, surName, number, sex, birthDate, nationality, club);
                runners.add(r);

            }
        }
    }

    public String printRunners(){
        StringBuilder sb = new StringBuilder();
        for (Competitor competitor : runners)
        {
            sb.append(competitor).append("\n");
        }
        return sb.toString();
    }

    public String getResults(){
        Collections.sort(runners);
        return printRunners();
    }

    public void loadStart(String startFile){
        int number;
        LocalTime startTime;
        Competitor c;
        try(Scanner sc = new Scanner(startFile))
        {
            sc.useDelimiter(",");
            while(sc.hasNext()){
                number = sc.nextInt();
                startTime = LocalTime.parse(sc.next(), dtftime);
                c = findCompetitor(number);
                c.setStartTime(startTime);
            }
        }
    }

    public void loadFinishNew(String finishFile, String separator, boolean header)
    {

    }

    public void finishDateToCompetitors(List<String[]> data)
    {
        int number;
        LocalTime raceTime;
        Competitor c;
        for(String[] parts : data)
        {
            number = Integer.parseInt(parts[0]);
            raceTime = LocalTime.parse(parts[1],dtftime);
            c = findCompetitor(number);
            c.setRaceTime(raceTime);
        }
    }

    public void loadFinish(String finishFile){
        int number;
        LocalTime finishTime;
        LocalTime startTime;
        LocalTime raceTime;
        Competitor c;
        try(Scanner sc = new Scanner(finishFile))
        {
            sc.useDelimiter(",");
            while(sc.hasNext()){
                number = sc.nextInt();
                finishTime = LocalTime.parse(sc.next(), dtftime);
                c = findCompetitor(number);
                c.setFinishTime(finishTime);
                startTime = c.getStartTime();
                raceTime = finishTime.minusHours(startTime.getHour()).minusMinutes(startTime.getMinute()).minusSeconds(startTime.getSecond());
                c.setRaceTime(raceTime);
            }
        }
    }

    public Competitor findCompetitor(int number)
    {
        for (Competitor competitor : runners)
        {
            if(competitor.getNumber() == number)
            {
                return competitor;
            }
        }
        return null;
    }

    public void saveResults(String resultFile) throws IOException {
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(resultFile)))))
        {
            pw.println("Výsledková listina");
            getResults();
            String s;
            for (Competitor competitor : runners) {
                s = String.format("%d %s %s", competitor.getNumber(), competitor.getFirstName(), competitor.getSurName());
                pw.println(s);
            }
        }

    }

    public void saveToBinaryFile(File resultFile)
    {
        try(DataOutputStream)
    }
}
