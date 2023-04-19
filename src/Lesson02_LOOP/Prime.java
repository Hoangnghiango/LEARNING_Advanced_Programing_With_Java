package Lesson02_LOOP;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
            int number = sc.nextInt();
            if(number<2){
                System.out.println("Not a prime");
            }else if(number==2){
                System.out.println("Is a prime");
            }else{
                int i=2;
                boolean check =true;
                while(i<Math.sqrt(number)){
                    if(number % i ==0){
                        check = false;
                        break;
                    }
                    i++;
                }
                if(check){
                    System.out.println("prime");
                }else {
                    System.out.println("not a prime");
                }
            }
    }
}
