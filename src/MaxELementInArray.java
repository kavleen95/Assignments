//Input - number[] = 10,30,43,54,23,543,43,32
//Output = 543

public class MaxELementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (max< arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        }
    }
