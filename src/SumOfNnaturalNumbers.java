//WAP to find the sum of n - natural numbers
//n = 15 , 1+2+3+4+5+-----+15

public class SumOfNnaturalNumbers {
    public static void main(String[] args) {
        int i;
        int n = 15;
        int sum=0;
        System.out.println("The sum of 'n' natural number is");

        for(i=1; i<=n;i++){
            sum = i + sum;
        }
        System.out.println(sum);

    }
}
