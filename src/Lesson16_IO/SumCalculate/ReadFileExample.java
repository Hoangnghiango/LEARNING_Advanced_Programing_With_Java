package Lesson16_IO.SumCalculate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0 ;
            while (
                    (line = bufferedReader.readLine()) != null
            ){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            //in tong
            System.out.println("Tong: " + sum);

        } catch (Exception e) {
            System.err.println("File khong tim thay hoac file co loi");
        } ;
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readExample = new ReadFileExample();
        readExample.readFileText(path);

    }
}
