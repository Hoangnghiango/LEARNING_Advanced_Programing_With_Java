package Lesson19_String_RegularExpression.ValidateEmail;

public class Main {

    private static EmailExample emailExample;
    private static final String[] validEmail = new String[] { "a@gmail.com", "abc@gmail.com", "abcde@gmail.com"};
    private static final String[] invalidEmail = new String[] { "@gmail.com", "gamil.com" ,"gmail"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email: validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " .Is valid: " + isValid);
        }
        for (String email: invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " .Is valid: " + isValid );
        }
    }


}
