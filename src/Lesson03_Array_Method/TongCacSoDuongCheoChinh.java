package Lesson03_Array_Method;

public class TongCacSoDuongCheoChinh {
    //Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {5,5,5},
                {4,3,2}
        };
        int total = countNumber(arr);
        System.out.println(total);

    }
    public static int countNumber(int[][] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j){
                    total += arr[i][j];
                }

            }

        }
        return total;
    }


}

