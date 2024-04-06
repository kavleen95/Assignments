//WAP to find the factorial of a given number using While loop
//number = 5! = 5*4*3*2*1 = 120

public class FactorialofNumber {
    public static void main(String[] args) {
        System.out.println("Let print the factorial of a number");
        int number=5;
        int fact = 1;
        int i = 1;

        while (i<=number){
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial of num is " + fact);
    }
}
