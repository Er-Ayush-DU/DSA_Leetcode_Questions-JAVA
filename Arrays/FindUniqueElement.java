public class FindUniqueElement {
  static void UniqueElement(int [] nums){
      int res = 0;
      for(int i=0; i<nums.length; i++){
          res ^= nums[i];
      }
      System.out.println("Unique Element in the array is: " + res);
  }

  public static void main(String[] args) {
      int [] nums = {1,2,0,1,2};
      UniqueElement(nums);

  }
}
