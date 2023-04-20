package Lesson16_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Hello.txt");
        writer.write("Moeoeoeoeow");
        writer.close();

        FileReader reader = new FileReader("Hello.txt");
        BufferedReader buffReader = new BufferedReader(reader);
        String line;
        String str = "Ngo, Thi, Hoang, Nghia";
        String[] results = str.split(",");
        for (String item: results) {
            System.out.println(item);

        }

        while((line = buffReader.readLine()) != null){
            System.out.println(line);

        }
        reader.close();

    }
}
