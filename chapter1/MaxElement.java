package chapter1;
public class MaxElement {
    public static int max(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int checkSortedorNot(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i] ) {
                return -1;
            }
        }
        return 1;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
      int arr[] = {12, 99, 90, 90, 96};
      System.out.println(max(arr)); 
      System.out.println(checkSortedorNot(arr));
    }
}
