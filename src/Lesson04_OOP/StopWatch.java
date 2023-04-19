package Lesson04_OOP;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }


    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        //đo thời gian thực thi của thuật toán sắp xếp chọn
        // (selection sort) cho 100,000 số.
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch sw = new StopWatch();
        selectSort(arr);
        sw.stop();

        System.out.println("Elapsed time: " + sw.getElapsedTime()+"milliseconds");


    }
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex =j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
