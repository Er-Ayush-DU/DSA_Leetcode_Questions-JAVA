public class FindOneDuplicate {
  static void findOneDuplicate(int[] nums) {
      int ans = 0;
      for (int i = 0; i < nums.length; i++) {
          ans ^= nums[i];
      }
      for (int i = 1; i < nums.length; i++) {
          ans ^= i;
      }
      System.out.println("Duplicate value in the array is: " + ans);
  }


  public static void main(String[] args) {
      int[] nums = {1,2,3,4,2};
      findOneDuplicate(nums);
  }
}
