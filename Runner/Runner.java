package cz.tul.alg.matpech.oop;

public class Runner {
    private int time;
    private String firstname;
    private String surname;
    private int number;

    public Runner(int time, String firstname, String surname, int number)
    {
        this.time = time;
        this.firstname = firstname;
        this.surname = surname;
        this.number = number;
    }

    public int getTime() {return time;}
    public String getFirstname() {return firstname;}
    public String getSurname() {return surname;}
    public int getNumber() {return number;}

    /*
    public void setTime(int time) {
        this.time = time;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    */

    public void timeToMins()
    {
    }

    public String toString()
    {
        return "Běžec " + firstname + " " + surname + " s číslem " + number + " má čas " + time;
    }
}
