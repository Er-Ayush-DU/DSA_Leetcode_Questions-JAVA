import java.util.Arrays;

public class SwapElement {

 static void SwapAlternate(int [] nums){
  for (int i=0; i<nums.length-1; i+=2){
    int temp=nums[i];
    nums[i]=nums[i+1];
    nums[i+1]=temp;
  }
 }
  public static void main(String[] args) {
    int[] nums ={11,22,33,44,55};
    System.out.println("Original Array: " + Arrays.toString(nums));
    SwapAlternate(nums);
    System.out.println("Array after Swaping " +Arrays.toString(nums));
  }
  
}
