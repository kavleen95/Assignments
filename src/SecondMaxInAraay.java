public class SecondMaxInAraay {
    public static int SecondMax(int [] a , int total ){
        int temp;

        for (int i = 0; i< total; i++) {
            for (int j = i+1; j <total ; j++) {
                if(a[i]>a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args) {
            int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        System.out.println("Second Largest : " +  SecondMax(arr, 8));
        }
    }

