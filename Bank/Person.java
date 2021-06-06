package bank;

import java.util.ArrayList;
import java.util.List;

public class Person extends Client{
    public Person(String name){
        this.name = name;
    }

    @Override
    public String clientName() {
        if(name.endsWith("ova")){
            return ("paní " + name);
        } else{
            return ("pan " + name);
        }
    }
}
