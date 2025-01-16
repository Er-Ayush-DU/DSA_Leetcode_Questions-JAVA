// time Complexity is o(n.m)

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_Bw_twoArray {
  static void Intersection(int[]arr1,int[] arr2){
    ArrayList<Integer> newArr= new ArrayList<>();
    for(int i= 0; i<arr1.length;i++){
      int element = arr1[i];
      for(int j=0; j<arr2.length;j++){
       if(element==arr2[j]){
        newArr.add(element);
        // System.out.println("Common Element is(Intersection): " + newArr);
        arr2[j]=-1;
        break;
       } 
      }
    }
    System.out.println("Common Element is(Intersection): " + newArr);
  }
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6,7,1};
    int[] arr2 = {3,4,1,5,10};

    Intersection(arr1,arr2);
    
  }
  
}

// Two Pointer Approach #(better Aprroach)
// time Complexity is o(n)


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> newArr = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0; int j=0;
        int n=nums1.length; int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                 if (newArr.isEmpty() || newArr.get(newArr.size() - 1) != nums1[i]) {
                    newArr.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
               i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[newArr.size()];
        int k=0;
        for(int num:newArr){
            result[k]=num;
            k++;
        }
        return result;
        
        }
           
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};

        int[] ans= solution.intersection(nums1,nums2);
        System.out.println("Common Element is: " + Arrays.toString(ans));
    }
}
