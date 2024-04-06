//WAP to find the area of the circle.

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();
        double area = pi * radius* radius;
        System.out.println("The area of the circle is " + area);
    }
}
