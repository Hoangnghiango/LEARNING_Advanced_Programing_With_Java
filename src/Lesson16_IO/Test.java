package Lesson16_IO;

import java.io.*;
import java.util.Scanner;

public class Test {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        File file = new File("Text.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\n" + sc.nextLine());
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int value = 0;

        // reads to the end of the stream
        while((value = bufferedReader.read()) != -1) {

            // converts int to character
            char c = (char)value;

            // prints character
            System.out.println(c);
        }
        String line;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);

        }

    }

}
