package chapter1;
public class MoveZeroEnd {
    
    // efficient solution
    public static void moveZero(int arr[]){
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] != 0) {
            arr[count] = arr[i];
            count++;
         }
      }
      for (int i = count; i < arr.length; i++) {
          arr[count] = 0;
          count++;
      }
    }

    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
    }
  public static void main(String[] args) {
    int arr[] = {12, 78, 0, 79, 0, 80};
    moveZero(arr);
    printArray(arr);
  }  
}
