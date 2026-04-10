package chapter1;
import java.util.*;
public class ArraywaveForm{
    // wave form which simple sort arrray into wave form
    // up down manner

    public static void waveFormArray(int arr[]){  // Expected Approach – O(n) Time and O(1) Space
    //    Neive approch 
    //   step1 sort Array
    //   swap next element and move further
    
    Arrays.sort(arr);
    for (int i = 0; i < arr.length-1; i+=2) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
         
      }
    }
    public static void swap(int arr[], int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }

    // second method

    // Traverse all even positioned elements of the input array, and do the following. 
    //      If the current element is smaller than the previous odd element, swap the previous and current. 
    //      If the current element is smaller than the next odd element, swap next and current.

    public static void waveform(int arr[]){
      //  for (int i = 0; i < arr.length; i += 2) {
      //     if(i > 0 && arr[i-1] > arr[i]){
      //       swap(arr, i, i-1);
      //     }
      //     if(i < arr.length-1 && arr[i+1] < arr[i]){
      //       swap(arr, i, i+1);
      //     }
      //  }
        // Traverse all even elements
        for(int i = 0; i < arr.length; i+=2){
         //swap odd and even positions
         if(i > 0 && arr[i - 1] > arr[i])
           swap(arr, i, i-1);
           if(i < arr.length-1 && arr[i + 1] > arr[i])
           swap(arr, i, i+1);
         }
    }

    public static void printArray(int arr[]){
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
    }
    public static void main(String[] args) {
       int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
      // waveFormArray(arr);
      waveform(arr);
      printArray(arr);

    }
}