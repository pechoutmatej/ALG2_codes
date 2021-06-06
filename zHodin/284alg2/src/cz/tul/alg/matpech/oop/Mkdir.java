package cz.tul.alg.matpech.oop;

import java.io.File;

public class Mkdir{

    public static boolean Execute(File file)
    {
        if (file.mkdir()) {

            return true;
        }
        else {
            return false;
        }
    }
}
