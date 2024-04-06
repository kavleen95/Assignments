//WAP to print based on the input whether you are eligible to vote or not.

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Age");
        int age = scanner.nextInt();

        if (age>=18){
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
