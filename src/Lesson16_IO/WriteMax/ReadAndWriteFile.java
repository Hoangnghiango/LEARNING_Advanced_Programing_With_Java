package Lesson16_IO.WriteMax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while(
                    (line = bufferedReader.readLine()) != null
            ){
                numbers.add(Integer.parseInt(line));

            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File khong  ton tai hoac noi dung co loi ");
        }
        return numbers;
    }
    //Bước 2: Tạo phương thức writeFile trong lớp ReadAndWriteFile để ghi giá trị lớn nhất
    // cần tìm vào trong File
    public void writeFile(String filePath, int max) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\n"+ "Gia tri lon nhat la: " + max);
        bufferedWriter.close();
    }

}
