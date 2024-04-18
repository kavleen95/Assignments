//Input - number[] = 10,30,43,54,23,543,43,32
//Output sum = 778

public class SumOfArray {

        public static int Sum () {
            int Sum = 0;
            int[] a = {10, 30, 43, 54, 23, 543, 43, 32};
            for (int i = 0; i < a.length; i++) {
                Sum = a[i] + Sum;
            }
            return Sum;
        }
    public static void main(String[] args) {

        System.out.println("Sum of the given array is : " + Sum());
    }
}
