//WAP to sort an array in the ascending order.
//number[] = {10,30,43,54,23,543,43,32}

import java.util.Arrays;
import java.util.Collection;

public class SortArray {


    public static void main(String[] args) {

        int[] number = {10,30,43,54,23,543,43,32};
        Arrays.sort(number);
        //To sort it in the descending order this function is used.
        //Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Print the array in the ascending order.");
        for (int i = 0; (i <number.length); i++) {
            System.out.println(number[i]);
        }
    }
}
