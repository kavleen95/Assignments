//WAP to find the sum of first 10 natural numbers
//1+2+3+4+5+6+7+8+9+10

public class SumOfTenNaturalNumbers {
    public static void main(String[] args) {

        int i;
        int sum = 0;
        System.out.println("The sum of first 10 natural numbers");

        for(i=1;i<=10;i++){
            sum = i + sum;
        }
        System.out.println(sum);
    }
}
