package chapter1;
public class SecondLarg {
    // max element
    public static int max(int arr[]){
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = i;
            }
        }

        return max;
    }

    // // second large
    // public static int secondElement(int arr[]){
    //    int second = arr[0];
    //    int first = max(arr);
    //    for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] == arr[first]) {
    //             continue;
    //         }
           
    //         if (arr[i] > second) {
    //             second = arr[i];
    //         }

    //    }
    //   // System.out.println(second+" ");
    //    return second;

    // }
    public static Integer secondElement2(int arr[]) {
        if (arr == null || arr.length < 2) {
            return null; // No second largest element exists
        }
    
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
    
        for(int i=0; i<arr.length; i++){
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
    
        if (second == Integer.MIN_VALUE) {
            return -1; // No distinct second largest element found
        }
    
        return second;
    }

    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 5};
      //  System.out.println(secondElement(arr));
      System.out.println(secondElement2(arr));
    }
}
