package Lesson16_IO.CopyFileText;

import java.io.*;

public class CopyFile {
    public static void main(String[] args)  {
        String sourcePath = "source.txt";
        String targetPath = "target.txt";
        try{
            FileReader fileReader = new FileReader(sourcePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(targetPath);
            int characterCount = 0;
            int character;
            while(
                    //bufferedReader.read() tra ve so luong unicode ke cả xuống dòng và phím cách
                    (character = bufferedReader.read()) != -1
            ){
                fileWriter.write(character);
                characterCount++;
            }
            bufferedReader.close();
            fileWriter.close();
            System.out.println("Sao chep tep thanh cong !!!!.So luong ki tu la: " + characterCount);

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay tep nguon");
        } catch (IOException e) {
            System.out.println("Loi khi sao chep tep");
        }


    }
}
