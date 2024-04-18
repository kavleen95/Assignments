//        WAP to add two 3x3 arrays
//int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}}
// int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}}

import java.util.Scanner;

public class AddThreeByThreeArray {
    public static void main(String[] args) {

        int[][] arr1 = {{54, 12, 4}, {2, 36, 40}, {6, 4, 5}};
        int[][] arr2 = {{2, 9, 40}, {5, 3, 6}, {3, 5, 12}};
        int[][] sum = new int[3][3];

        System.out.println("Enter the elements of first array");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(sum[i][j] +"");
            }
            System.out.println();
        }
    }
}
