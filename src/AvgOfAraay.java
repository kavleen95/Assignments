//WAP to find the average of the array : arr[] = {10,30,43,54,23,543,43,32}
//Output = 778/8 = 97.25

public class AvgOfAraay {

    public static int Average(){
        int average = 0 ;
        int sum=0;
        int [] a = {10,30,43,54,23,543,43,32};
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
            average = sum / a.length;
        }
        return average;
    }
    public static void main(String[] args) {
        System.out.println("The average of the array is : " + Average());

    }
}
