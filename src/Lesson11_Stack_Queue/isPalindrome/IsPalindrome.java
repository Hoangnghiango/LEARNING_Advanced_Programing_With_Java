package Lesson11_Stack_Queue.isPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsPalindrome {
    public static boolean isPalindrome(String inputString) {
        // Chuyển chuỗi thành chuỗi ký tự và loại bỏ các ký tự không phải chữ cái và số
        String cleanString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Tạo một queue và một stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Thêm ký tự từ chuỗi vào queue và stack
        for (int i = 0; i < cleanString.length(); i++) {
            queue.add(cleanString.charAt(i));
            stack.push(cleanString.charAt(i));
        }

        // So sánh từng phần tử ở đầu queue và stack
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        // Nếu mọi phần tử giống nhau thì đó là chuỗi Palindrome
        return true;
    }
    public static void main(String[] args) {
        String inputString = "A man, a plan, a canal, Panama!";
        if (isPalindrome(inputString)) {
            System.out.println("Chuỗi " + inputString + " là một chuỗi Palindrome.");
        } else {
            System.out.println("Chuỗi " + inputString + " không phải là một chuỗi Palindrome.");
        }
    }
}
