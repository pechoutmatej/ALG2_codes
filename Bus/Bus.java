package cz.tul.alg.matpech.oop;

public class Bus {
    public static void main(String[] args)
    {
        Bus a = new Bus();
        System.out.println(a);
    }
    private int seats;
    private int lineNumber;
    private int occupiedSeats;
    private String companyName;
    //region constructors
    public Bus()
    {
        seats = 40;
        companyName = "";
    }

    public Bus(int seats, int lineNumber, String companyName)
    {
        this.seats = seats;
        this.lineNumber = lineNumber;
        this.companyName = companyName;
    }
    //endregion
    //region getters
    public String getCompanyName()
    {
        return companyName;
    }

    public int getLineNumber()
    {
        return lineNumber;
    }

    public int getSeats()
    {
        return seats;
    }

    public int getOccupiedSeats()
    {
        return occupiedSeats;
    }
    //endregion
    //region setters
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    public void setLineNumber(int lineNumber)
    {
        this.lineNumber = lineNumber;
    }
    //endregion
    //region methods
    public String toString()
    {
        return "Autobus číslo " + lineNumber + " společnosti " + companyName + " s počtem sedadel " + seats + " veze " + occupiedSeats + " cestujících";
    }

    public int exit(int amount)
    {
        if(amount > occupiedSeats)
        {
            int temp = amount - occupiedSeats;
            //System.out.println("Vystoupit mohlo jenom " + occupiedSeats);
            occupiedSeats = 0;
            return temp;
        }
        else
        {
            occupiedSeats = occupiedSeats - amount;
            return 0;
        }
    }

    public int boarding(int amount)
    {
        if(occupiedSeats + amount > seats)
        {
            int temp = ((occupiedSeats + amount) - seats);
            //System.out.println("Nastoupit mohlo jenom " + (seats-occupiedSeats));
            occupiedSeats = seats;
            return temp;
        }
        else
        {
            occupiedSeats = occupiedSeats + amount;
            return 0;
        }
    }

    public void exitAll()
    {
        occupiedSeats = 0;
    }
    //endregion
}
