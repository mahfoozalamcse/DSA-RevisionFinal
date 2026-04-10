package chapter1;
public class OperationArray {
    // insert opration
    public static void insert(int arr[], int x){
      arr[arr.length-1] = x; 
    }

    // insert at given position
    public static void insertPos(int arr[], int x, int pos, int currSize, int capcity){
        if (currSize > capcity) {
            return;
        }
        if (pos > capcity) {
            return;
        }
        int idx = pos -1;

        for (int i=currSize-1; i >=idx; i--) {
            arr[i+1] = arr[i];
        }

        arr[idx] = x;

    }

    // serch in array
    public static void serch(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print(arr[i]+" ");
                return;
            }
        }
    }

    // delete element in the array
    // due to inplace deletion we return from second last not change last element
    // array passed by value not effect original element

    public static int delete(int arr[], int x){
    int n = arr.length;
        int i;

        // Find the index of the first occurrence of x
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }

        // If x is not found, return the original length
        if (i == n) {
            return n;
        }

        // Shift elements to the left to overwrite x
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        // The last element is now a duplicate
        // The "effective" size of the array is reduced by 1
        return n - 1;
    }

    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
      int arr[] = new int[5];
      arr[0] = 12;
      arr[1] = 34;
      arr[2] = 24;
      arr[3] = 45;
      arr[4] = 89;

    //   int currSize = 4;
    //   int capcity = 5;
    //   int x = 34;
    //   int pos = 2;
    //   //insert(arr, x);
    //   //printArray(arr);
    //   insertPos(arr, x, pos, currSize, capcity);
    //   printArray(arr);

    //   serch(arr, 34);

    System.out.println(delete(arr,12));
    printArray(arr);
    }
}