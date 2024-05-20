    import java.util.ArrayList;
    import java.util.Scanner;

    class Solution{

        public static  void mergeSort(int[] arr, int low , int high){
            if(low >= high){
                return;
            }
            int mid = (low + high) / 2 ;
            mergeSort(arr,low,mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
        public static void merge(int[] arr, int low, int mid, int high){
            int left = low;
            int right = mid + 1;
            final ArrayList<Integer> narr = new ArrayList<>();

            while(left <= mid && right <= high){
                if(arr[left] < arr[right]){
                    narr.add(arr[left]);
                    left++;
                }else{
                    narr.add(arr[right]);
                    right++;
                }
            }
            while(left <= mid){
                narr.add(arr[left]);
                left++;
            }
            while(right <= high){
                narr.add(arr[right]);
                right++;
            }
            int index = low;
            for (int value : narr) {
                arr[index++] = value;
            }
            
        }
    
    }

    public class MergeSort {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = 7;
            int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
            System.out.println("Before sorting array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            Solution.mergeSort(arr, 0, n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }