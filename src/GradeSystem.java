//WAP to check student's grade based on the score

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Result Day");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Score");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade<=100){
            System.out.println("You passed with A grade");
        }
        else if (grade>=80 && grade<=89) {
            System.out.println("You passed with B grade");
        }
        else if  (grade>=70 && grade<=79) {
            System.out.println("You passed with C grade");
        }
        else if (grade >= 60 && grade <= 69) {
            System.out.println("You passed with D grade");
        }
        else if (grade >= 0 && grade <= 59) {
            System.out.println("FAIL , you will have to reappear");
        }
        else {
            System.out.println("Please enter the valid score");
        }
    }
}
