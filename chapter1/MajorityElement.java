package chapter1;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int majorityElement(int arr[]) {
        // your code here
        
        // approch 3 time O(n)
        int n = arr.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // traverse hashmap each element count element
        
        for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            // check count is exceed or not 
            if(countMap.get(num) > n/2){
                return num;
            }
        }
        
        
        // no majority element fount 
        return -1;
        
        
        
        
        // effiecient solution time complexity O(n)
        
        // int n = arr.length;
        // if(n == 1) return arr[0];
        // int count = 1;
        
        // Arrays.sort(arr);
        // for(int i=1; i<n; i++){
        //     if(arr[i-1] == arr[i]){
        //         count++;
        //     }else{
        //         if(count > n/2){
        //             return arr[i-1];
        //         }
        //         count = 1;
        //     }
        // }
        // // check the last element
        // if(count > n/2){
        //     return arr[n-1];
        // }
        
        // return -1;
        
        
      //  approch 1 => time complexity O(n^2)
      
    //     int n = arr.length;
    //     for(int i=0; i<n; i++){
    //         int count  = 0;
    //         for(int j=0; j<n; j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }
        
    //     if(count > n / 2){
    //         return arr[i];
    //       }
    //     }
    //   return -1;
    }
    public static void main(String[] args) {
      int arr[] = {3, 1, 3, 3, 2};  
      System.out.println(majorityElement(arr));
    }
}
