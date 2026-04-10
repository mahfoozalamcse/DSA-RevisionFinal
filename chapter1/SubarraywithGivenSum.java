package chapter1;
public class SubarraywithGivenSum {
    // complete code
    
    public static void subarraygivensum(int arr[], int target){
       // int temp[] = new int[arr.length];
        int count = 0;
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            sum = arr[count] + arr[i];
            count++;
            if (sum == target) {
               
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] =  { 15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        subarraygivensum(arr, target);
      // System.out.println(subarraygivensum(arr, target));
    }
}
