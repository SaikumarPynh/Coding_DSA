
// import java.util.* ;
// import java.io.*; 
// public class QuickSort {
//     // public static List<Integer> quickSort(List<Integer> arr){
//     //     // Write your code here.
//     //     int low = 0;
//     //     int high = arr.size() - 1;
//     //     qs(low,high,arr);
//     //     return arr;
//     // }
//     public static List<Integer> quickSort(List<Integer> arr){
//         int low = 0;
//         int high = arr.size() - 1;
//         qs(low, high, arr);
//         return arr;
//     }
    
//     public static void qs(int low,int high, List<Integer> arr){
//         if(low < high){
//             int pivotIndex = quickPivot(low, high, arr);
//             qs(low, pivotIndex-1, arr);
//             qs(pivotIndex+1,high,arr );
//         }
//     }
//     public static int  quickPivot(int low, int high, List<Integer> arr){
//         int pivot = arr.get(low);
//         int pi = low;
//         while(low < high){
//             while(low <= high && arr.get(low) <= pivot){
//                 low++;
//             }
//             while(low <= high &&  arr.get(high) >= pivot){
//                 high--;
//             }
//             if(low < high){
//             int temp = arr.get(low);
//             arr.set(low, arr.get(high));
//             arr.set(high,temp);
//             }
//         }
//         int t = arr.get(low);
//         arr.set(low,arr.get(pi));
//         arr.set(pi,t);
//         pi = low;
//         return pi;
//     }
//     public static void main(String[] args) {
//         List<Integer> myList = new ArrayList<>();
//         // Add elements to the list
//         myList.add(5);
//         myList.add(20);
//         myList.add(10);
//         myList.add(80);
//         myList.add(2);
//         myList.add(3);
//         List<Integer> lis = quickSort(myList);
//         System.out.println(lis);
//     }

// }
import java.util.*;

public class QuickSort {

    public static List<Integer> quickSort(List<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        qs(low, high, arr);
        return arr;
    }

    public static void qs(int low, int high, List<Integer> arr) {
        if (low < high) {
            int pivotIndex = quickPivot(low, high, arr);
            qs(low, pivotIndex - 1, arr);
            qs(pivotIndex + 1, high, arr);
        }
    }

    public static int quickPivot(int low, int high, List<Integer> arr) {
        int pivot = arr.get(low);
        int pi = low;
        while (low < high) {
            while (low <= high && arr.get(low) <= pivot) {
                low++;
            }
            while (low <= high && arr.get(high) >= pivot) {
                high--;
            }
            if (low < high) {
                Collections.swap(arr, low, high);
            }
        }
        Collections.swap(arr, pi, high);
        return high;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        // Add elements to the list
        myList.add(5);
        myList.add(20);
        myList.add(10);
        myList.add(80);
        myList.add(2);
        myList.add(3);
        List<Integer> lis = quickSort(myList);
        System.out.println(lis);
    }
}
