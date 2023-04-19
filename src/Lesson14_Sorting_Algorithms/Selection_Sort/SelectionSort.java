package Lesson14_Sorting_Algorithms.Selection_Sort;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1.3,4.5,23.5,23,56,20.5};
        selection(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");

        }
    }
    public static void selection(double[] list){
        for (int i = 0; i < list.length -1 ; i++) {
            // find the min of the list
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i+1; j < list.length; j++) {
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //swap list[i] with list[currentminInDEX] If necessary
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }

    }

}
