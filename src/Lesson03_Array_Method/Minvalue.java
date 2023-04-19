package Lesson03_Array_Method;

public class Minvalue {
    public static void main(String[] args) {
        int[] numberArr = {1,4,5,8,0,-1,-4};
        int min = minValue(numberArr);
        System.out.println(min);

    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(min>arr[i]){
                min=arr[i];
            }

        }
        return min;

    }
}
