// Time Complexity of this method is O(n^2)

public class FindAllDuplicate {
  static void Duplicate(int[] arr){
    for(int i=0; i<arr.length-1; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i]==arr[j]){
          System.out.print(arr[i] + " ");
        }
      }
    }   
  }       
public static void main(String[] args) {
  int[] arr = {2,3,1,2,3,5,1};
  Duplicate(arr);
  // System.out.println(Arrays.toString(Duplicate(arr)));
}
  
}
