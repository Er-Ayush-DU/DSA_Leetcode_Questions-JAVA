public class InsertionSort {
  public static int insertionSort(int[] arr) {
      for (int i = 1; i < arr.length; i++) {
          int key = arr[i];
          System.out.print(key + " ");
      }

  return arr.length;
  }
  public static void main(String[] args) {
      int[] arr = { 3, 5, 6, 4, 7, 1 };
      for(int i=0; i<arr.length-1; i++) {
          int mini = i;
          for(int j=i+1; j<arr.length; j++) {
              if(arr[mini] > arr[j]) {
                  mini=j;
              }
          }
          int temp = arr[mini];
          arr[mini] = arr[i];
          arr[i] = temp;
      }
      System.out.print("Sorted array is: ");
      insertionSort(arr);
  }
}
