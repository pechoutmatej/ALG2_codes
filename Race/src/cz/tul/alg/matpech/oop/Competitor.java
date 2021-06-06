package cz.tul.alg.matpech.oop;

import java.time.LocalDate;
import java.time.LocalTime;

public class Competitor implements Comparable<Competitor>{
    private String firstName;
    private String surName;
    private int number;
    private String sex;
    private LocalDate birthDate;

    public LocalTime getStartTime() {
        return startTime;
    }

    private String nationality;
    private String club;
    private LocalTime startTime;
    private LocalTime finishTime;
    private LocalTime raceTime;

    public Competitor(String firstName, String surName, int number, String sex, LocalDate birthDate, String nationality, String club) {
        this.firstName = firstName;
        this.surName = surName;
        this.number = number;
        this.sex = sex;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.club = club;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumber() {
        return number;
    }

    public String getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public String getClub() {
        return club;
    }

    public int compareTo(Competitor o)
    {
        return this.raceTime.compareTo(o.raceTime);
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(LocalTime finishTime) {
        this.finishTime = finishTime;
    }

    public void setRaceTime(LocalTime raceTime) {
        this.raceTime = raceTime;
    }
}
