package Lesson11_Stack_Queue.Trien_Khai_Stack;

public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        stack.push("Six");
        stack.push("Seven");
        System.out.println("1. Size of stack after push operation " + stack.size());
        System.out.printf("1.2 Pop element from stack");
        while( !stack.isEmpty()){
            System.out.printf(" %s" , stack.pop());
        }
        System.out.println("\n Size of stack after pop operations " + stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("1. Size of stack after push operation" + stack.size());
        System.out.printf("1.2 Pop element from stack");
        while( !stack.isEmpty()){
            System.out.printf(" %d" , stack.pop());
        }
        System.out.println("\n Size of stack after pop operations " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Stack of integer: ");
        stackOfIntegers();
        System.out.println("2.Stack of String");
        stackOfIStrings();
    }
}
