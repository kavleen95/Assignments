//Input - number[] = 10,30,43,54,23,543,43,32
//Output = 10

public class MinElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
