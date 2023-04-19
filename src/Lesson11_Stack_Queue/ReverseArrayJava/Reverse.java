package Lesson11_Stack_Queue.ReverseArrayJava;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] array = {1,3,5,67,7,54,2};
        // đưa từng phần tử trong mảng vào stack
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));

        Stack<String> stack1 = new Stack<String>();
        String str = "Hello Cac Ban Minh La Nghia";

        for (int i = 0; i < str.length(); i++) {
            stack1.push(String.valueOf(str.charAt(i)));
        }
        System.out.println(stack1);
        String output = "";
        while ((!stack1.isEmpty())){
            output += stack1.pop();
        }
        System.out.println(output);


    }
}
