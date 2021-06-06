package cz.tul.alg.matpech.oop;

import java.io.File;

public class Cd{

    public static boolean Execute(String directory){

        try {
            System.setProperty("user.dir", directory);
            return true;
        }
        catch (NullPointerException ex) {
            return false;
        }
        //logic.setPwd(directory.getAbsolutePath());
    }
}
