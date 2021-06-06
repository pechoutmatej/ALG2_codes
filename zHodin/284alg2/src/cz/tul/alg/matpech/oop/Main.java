package cz.tul.alg.matpech.oop;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        System.out.println("--------------");
        System.out.println(Ls.Execute(new File(".")));
        System.out.println("--------------");
        System.out.println(Cd.Execute("C:\\Users\\pecho\\."));
        System.out.println("--------------");
        System.out.println(new File(".").getAbsoluteFile());
        System.out.println("--------------");
    }
}
