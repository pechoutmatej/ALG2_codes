package cz.tul.alg.matpech.oop;

import java.io.File;
import java.io.IOException;

public class Touch {
    public static boolean Execute(File file) throws IOException {
        if (file.createNewFile()){
            return true;
        }
        else {
            return false;
        }
    }
}
