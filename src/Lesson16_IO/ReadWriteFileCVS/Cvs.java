package Lesson16_IO.ReadWriteFileCVS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cvs {
    public static void main(String[] args) {
        String source = "country.cvs";
        String line = "";
        String cvsSplitBy = ",";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
            while((line = bufferedReader.readLine()) != null){
                String[] country = line.split(cvsSplitBy);
                System.out.println("CountryId:" + country[0] + " CountryCode: " + country[1] + " CountryName: "+ country[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
