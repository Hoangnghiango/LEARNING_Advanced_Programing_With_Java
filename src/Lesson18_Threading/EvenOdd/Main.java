package Lesson18_Threading.EvenOdd;

public class Main {
    public static void main(String[] args) {
        Thread odd = new Odd();
        Thread even = new Even();

        odd.start();
        even.start();

        try{
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n Done");
    }
}
