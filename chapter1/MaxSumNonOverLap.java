package chapter1;
public class MaxSumNonOverLap {
    
        public static int maxSum(int[] arr, int M, int K) {
            int N = arr.length;
            int[][] dp = new int[M + 1][N + 1];
    
            // Calculate prefix sums for efficient subarray sum calculation
            int[] prefixSum = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
            }
    
            // Base case: If M is 0, the maximum sum is 0
            for (int i = 0; i <= N; i++) {
                dp[0][i] = 0;
            }
    
            // Fill the DP table
            for (int m = 1; m <= M; m++) {
                for (int i = K; i <= N; i++) {
                    // Consider the current subarray ending at index i-1
                    int currentSubarraySum = prefixSum[i] - prefixSum[i - K];
    
                    // Two choices: include or exclude the current subarray
                    dp[m][i] = Math.max(dp[m][i - 1], dp[m - 1][i - K] + currentSubarraySum);
                }
            }
    
            return dp[M][N];
        }
 public static void main(String[] args) {
    int[] arr = {2, 10, 7, 18, 5, 33, 0};
            int M = 3, K = 1;
            int result = maxSum(arr, M, K);
            System.out.println(result);
    }
}