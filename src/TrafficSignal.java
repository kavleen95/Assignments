//WAP to simulates the Traffic light , user can input a color and based on that the msg will output.

import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice of color");
        String color = scanner.next();

        switch (color){
            case "Red" :
                System.out.println("STOP");
                break;
            case "Yellow":
                System.out.println("PREPARE TO STOP");
                break;
            case "Green":
                System.out.println("GOOO");
                break;
            default:
                System.out.println("NO ACTION CAN BE PERFORMED");
                break;
        }
        System.out.println("Thanks for following the Traffic rules");
    }
}
