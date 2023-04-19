package Lesson03_Array_Method;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[][] array ={
                {1,2,3,4,5},
                {4,5,6,7,7,8},
                {2,4,6,7,8,44}
        };
        int max = maxValue(array);
        System.out.println(max);
    }
    public static int maxValue(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }

            }

        }
        return max;
    }
}
