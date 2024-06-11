// Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.

// Examples
// Example 1:
// Input:
//  arr = [4, 7, 1, 0]
// Output:
//  7 1 0
// Explanation:
//  Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

// Example 2:
// Input:
//  arr = [10, 22, 12, 3, 0, 6]
// Output:
//  22 12 6
// Explanation:
//  6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
class solution {
    public static void result(int [] arr){
        int[] sol =  new int[arr.length];
        int s = 0;
        for(int i = 0;i<arr.length - 1;i++){
            int count = 1;
            for(int j= i+1;j<arr.length;j++){
                if (arr[i] < arr[j]){
                    count = 0;
                }
            }
            if(count == 1){
                sol[s] = arr[i];
                s++;
            }
            sol[s] = arr[arr.length-1];
        }
        for(int i = 0;i<sol.length;i++){
            System.out.print(sol[i]+ " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {10, 22, 12, 3, 0, 6};
        result(arr);
    }
}
