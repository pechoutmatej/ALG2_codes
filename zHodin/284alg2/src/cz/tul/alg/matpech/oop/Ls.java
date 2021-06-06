package cz.tul.alg.matpech.oop;

import java.io.File;
import java.io.IOException;


public class Ls {
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static String Execute(File directory) throws IOException {
        File f = directory;
        String result = "";
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                result = result + (BLUE);
            } /*else {
                //result = result;
            }*/
            result = result + (file.getName()) + " " + WHITE;
        }
        return result;
    }
}
