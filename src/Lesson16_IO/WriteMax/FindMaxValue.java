package Lesson16_IO.WriteMax;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for(int i = 0; i<numbers.size(); i++){
            if( max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max ;
    }

    public static void main(String[] args) throws IOException {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("Text.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile( "output.txt", maxValue);
        System.out.println("Gia tri lon nhat  duong dan la: " + maxValue);
    }
}
