//WAP to check if the given string is palindrome or not . I/p String = madam
// String with same strig as i/p or o/p when read returns the same string.
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {

        String test = "Hello";
        StringBuilder  test1 = new StringBuilder(test);
        test1.reverse();

        if (test.equals(test1.toString())){
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The given string is not Palindrome");
        }
    }
}
