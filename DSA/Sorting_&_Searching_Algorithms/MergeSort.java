import java.util.ArrayList;
import java.util.Scanner;

class Solution{

    public static void mergeSort(int low, int high, int[] arr){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(low, mid, arr);
        mergeSort(mid+1, high, arr);
        merge(low,mid,high,arr);
    }

    public static void merge(int low, int mid, int high, int[] arr){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while( left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        int count = low;
        for(int ele:temp){
            arr[count++] = ele;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int low = 0;
        int high = size-1;
        for(int i = 0;i<size;i++){
            System.out.println("enter the element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array is:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        mergeSort(low,high,arr);

        System.out.println("Sorted array is:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }   
}