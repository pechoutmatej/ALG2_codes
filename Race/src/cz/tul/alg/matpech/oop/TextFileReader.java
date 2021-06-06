package cz.tul.alg.matpech.oop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {
   public List<String[]> readFile(File file, String separator, boolean header) throws FileNotFoundException {
       List<String[]> data = new ArrayList<>();
       try (BufferedReader br = new BufferedReader(new FileReader(file)))
       {
           String line;
           if(header){
               br.readLine();
           }
           while((line = br.readLine()) != null)
           {
               String[] parts = line.split(separator);
               data.add(parts);
           }
       }
       catch (IOException e) {
           e.printStackTrace();
       }
       return data;
   }
}
