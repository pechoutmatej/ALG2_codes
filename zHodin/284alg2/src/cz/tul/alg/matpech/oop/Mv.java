package cz.tul.alg.matpech.oop;

import java.io.File;

public class Mv {
    public static boolean Execute(File oldFile, File newFile)
    {
        return oldFile.renameTo(newFile);
    }
}
