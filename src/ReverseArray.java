//number[] = 10,30,43,54,23,543,43,32 ,
// Reversed array [] = 32,43,543,23,54,43,30,10


public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {10,30,43,54,23,543,43,32 };
        System.out.println("Reverse the elements of an array");
        arrayReverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static  void arrayReverse(int [] arr){

        int start=0;
        int end = arr.length-1;
        int temp;

        while (start<end){
            temp = arr[end];   // arr[6] --- temp = 70
            arr[end] = arr[start];  //arr[0] , arr[end]= 10
            arr[start] = temp;

            start++;
            end--;
        }
    }
}
