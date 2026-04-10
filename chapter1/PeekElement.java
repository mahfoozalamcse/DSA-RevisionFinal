package chapter1;
public class PeekElement {
    public static int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        if(arr[0] >= arr[1]){
            return 0;
        }
        if(arr[n-1] >= arr[n-2]){
            return n-1;
        }
        
        // iterate over array to check 
        
        for(int i=1; i<n-1; i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
       int arr[]= {5, 10, 20, 15};
       System.out.println(peakElement(arr));
    }
}