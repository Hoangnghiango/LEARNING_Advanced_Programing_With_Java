package Lesson17_BinaryFile_Serialization.APJ_CopyFile.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Product> products){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> productList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("STANDARD", "BMW", 12000000, "China", "BMW has red color"));
        products.add(new Product("LUXURY", "MAYBACH", 340000000, "France", "It's expensive"));
        products.add(new Product("STANDARD", "MAZDA", 120000, "China", "BMW has red color"));
        products.add(new Product("VIP", "ROLROYE", 400000, "China", "BMW has red color"));
        products.add(new Product("STANDARD", "VINFAST", 500000, "China", "BMW has red color"));
        writeDataToFile("product.txt", products);
        List<Product> productDataFromFile = readDataFromFile("product.txt");
        for (Product product: productDataFromFile) {
            System.out.println(product);
        }
    }
}
