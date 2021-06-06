package cz.tul.alg.matpech.oop;

import java.util.Arrays;

public class Calendar {
    private final int[] daysCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] days = {"Pondělí", "Úterý", "Středa", "Čtvrtek", "Pátek", "Sobota", "Neděle"};
    private final String[] months = {"Leden", "Únor", "Březen", "Duben", "Květen", "Červen", "Červenec", "Srpen", "Září", "Říjen", "Listopad", "Prosinec"};
    private String[][] table;

    private int day;
    private int month;
    private int year;

    public Calendar(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getDayString() {
        int h = day + (13 * (month + 1) / 5 + year % 100 + ((year % 100) / 4)) + ((year / 100) / 4) + 5 * (year / 100);
        h = h % 7;
        switch (h) {
            case 0:
                return "Sobota";
            case 1:
                return "Neděle";
            case 2:
                return "Pondělí";
            case 3:
                return "Úterý";
            case 4:
                return "Středa";
            case 5:
                return "Čtvrtek";
            case 6:
                return "Pátek";
        }
        return "0";
    }

    public String getMonthString() {
        return months[month-1];
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static int numberOfDays(int year)
    {
        if(isLeap(year))
        {
            return 366;
        }
        else
        {
            return 365;
        }
    }

    public static boolean isLeap(int year){
        boolean result = false;
        if (year % 400 == 0) {
            result = true;
        }
        else if (year % 100 == 0) {
            result = false;
        }
        else if (year % 4 == 0) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    public void makeTable() {
        int dayTemp = 1;
        int h = dayTemp + (13 * (month + 1) / 5 + year % 100 + ((year % 100) / 4)) + ((year / 100) / 4) + 5 * (year / 100);
        h = h % 7;
        h = h-2;
        if(h == -2)
        {
            h = 5;
            table = new String[][]{
                    {"Po", "Út", "St", "Čt", "Pá", "So", "Ne"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"}
            };
        }
        if(h == -1)
        {
            h = 6;
            table = new String[][]{
                    {"Po", "Út", "St", "Čt", "Pá", "So", "Ne"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"}
            };
        }
        if(h < 5 )
        {
            table = new String[][]{
                    {"Po", "Út", "St", "Čt", "Pá", "So", "Ne"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"},
                    {"--", "--", "--", "--", "--", "--", "--"}};
        }
        table[1][h] = String.format("%02d", dayTemp);
        dayTemp++;
        if (h + 1 < 7) {
            for (int i = h + 1; i < 7; i++) {
                table[1][i] = String.format("%02d", dayTemp);
                dayTemp++;
            }
        }
        for (int i = 2; i < table.length; i++) {
            for (int j = 0; j < 7; j++) {
                table[i][j] = String.format("%02d", dayTemp);
                dayTemp++;
                if (dayTemp >= daysCount[month - 1]+1) {
                    break;
                }
            }
            if (dayTemp >= daysCount[month - 1]+1) {
                break;
            }
        }
    }
    public String toString()
    {
        makeTable();
        String lineSeparator = System.lineSeparator();
        StringBuilder sb = new StringBuilder();

        for (String[] row : table) {
            sb.append(Arrays.toString(row))
                    .append(lineSeparator);
        }
        String result = sb.toString();
        return result;
    }





}
