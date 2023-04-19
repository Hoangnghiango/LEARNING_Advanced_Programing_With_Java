package Lesson14_Sorting_Algorithms.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {34,45,22,12,45,67,32,47,89,16,79,00};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");

        }


    }
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length ; i++) {
            int currentElement = list[i];
            int j;
            for ( j = i-1;j >= 0 && list[j] > currentElement ; j--) {
                list[j+1] = list[j];

            }

            list[j+1] = currentElement;

        }

    }
}

