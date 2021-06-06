package bank;

public class Company extends Client{
    public Company(String name){
        this.name = name;
    }

    @Override
    public String clientName() {
        return ("firma" + name);
    }
}
