package chapter1;
public class MaxSumSubarraysRecursive {
    
        public static int maxSum(int[] arr, int M, int K, int index) {
            // Base case: If we've reached the end of the array or M is 0, return 0
            if (index >= arr.length || M == 0) {
                return 0;
            }
    
            // Calculate the sum of the current subarray of size K
            int subarraySum = 0;
            for (int i = index; i < Math.min(index + K, arr.length); i++) {
                subarraySum += arr[i];
            }
    
            // Two choices: include or exclude the current subarray
    
            // Include the current subarray
            int include = subarraySum + maxSum(arr, M - 1, K, index + K);
    
            // Exclude the current subarray
            int exclude = maxSum(arr, M, K, index + 1);
    
            // Return the maximum of the two choices
            return Math.max(include, exclude);
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 10, 7, 18, 5, 33, 0};
            int M = 3, K = 1;
            int result = maxSum(arr, M, K, 0);
            System.out.println(result);
        }
    
}
