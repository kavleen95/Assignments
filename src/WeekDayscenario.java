import java.util.Scanner;

public class WeekDayscenario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        String day = scanner.next();

        switch (day){
            case "Monday":
                System.out.println("It is a Weekday");
                break;
            case "Tuesday":
                System.out.println("It is a Weekday");
                break;
            case "Wednesday":
                System.out.println("It is a Weekday");
                break;
            case "Thursday":
                System.out.println("It is a Weekday");
                break;
            case "Friday":
                System.out.println("It is a Weekday");
                break;
            default:
                System.out.println("Wohooo , finally weekend is here");
                break;
        }
    }
}
