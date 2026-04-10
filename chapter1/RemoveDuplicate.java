package chapter1;
public class RemoveDuplicate {
  public static int removeduplicate(int arr[], int n){
   int temp[] = new int[n-1];
   temp[0] = arr[0];
   int res = 1;
   for (int i = 1; i < n; i++) {
     if (temp[res-1] != arr[i]) {
        temp[res] = arr[i];
        res++;
     }
   }

   for (int i = 0; i < res; i++) {
       arr[i] = temp[i];
   }

   return res;

  }

  // efficient time O(n), space O(1)
  public static int removeduplicate2(int arr[]){
    int res = 1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[res-1] != arr[i]) {
            arr[res] = arr[i];
            res++;
        }
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 4, 7, 7};
    int n = 6;
   //n = removeduplicate(arr, n);

   n = removeduplicate2(arr);

    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }

    
  }  
}
