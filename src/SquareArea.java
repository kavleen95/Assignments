//WAP to find the area of a square.

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side of a square");
        double length = scanner.nextDouble();
        double area = length*length;
        System.out.println("The area of the square " + area);
    }
}
