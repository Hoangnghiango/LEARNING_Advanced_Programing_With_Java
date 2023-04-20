package Lesson18_Threading.RacingCars;

import java.util.Random;


public class Car implements  Runnable{
    public static int DISTANCE = 100;

    public static int STEP = 2;
    private String name ;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // khoi tao diem start
        int runDistance = 0 ;
        // khoi tao time bat dau cuoc dua
        long startTime = System.currentTimeMillis();

        // kiem tra chung nao xe chua ket thuc
        //quang duong du thi xe van tiep tuc chay
        while(runDistance < DISTANCE){
            try{
                //RANDOM toc do KM/H
                int speed = ( new Random().nextInt(20));
                // tinh toan khoang cach da di duoc
                runDistance += speed;
                //ve duong da di cua xe
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if(percentTravel >= i + STEP){
                        log += "=";
                    }else if(percentTravel >= i && percentTravel < i + STEP){
                        log += "o";
                    }else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name+ ": " + log+ " " + Math.min(DISTANCE, runDistance));
                Thread.sleep(1000);


            } catch (InterruptedException e) {
                System.out.println("Car " + this.name+ " broken...");
                break;
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + "Finish in " + (endTime - startTime)/ 1000 + "s");
    }

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
