import java.util.Arrays;

public class BubbleSort {
    static void BS(int[] arr){
        for(int i= 0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,2,3,1,4};
        BS(arr);
        System.out.println("Sorted Array is: " + Arrays.toString(arr));

    }
}