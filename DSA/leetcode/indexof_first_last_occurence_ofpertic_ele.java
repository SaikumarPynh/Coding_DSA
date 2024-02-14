import java.util.Stack;

class solution{
    public static int[] result(int[] arr,int target){
        Stack<Integer> stack = new Stack<>();
        int firstIndex = -1;
        int secondIndex = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] ==  target && firstIndex == -1){
                firstIndex = i;
            }
            stack.push(i);
        }
        while(secondIndex == -1){   //while(!stack.isEmpty())
            int cindex = stack.pop();
            if(arr[cindex] == target){
                secondIndex = cindex;
            }
        } return new int[]{firstIndex,secondIndex};
    }
    public static void main(String[] args) {
        int[] arr = {2, 4,8, 11, 13};
        int target = 8;
        
        int[] res = result(arr, target);
        System.out.println("Result: " + res[0] + " " + res[1]);
    }
}
// public class FirstLastOccurrence {
//     public static int[] findFirstLastIndices(int[] arr, int target) {
//         int firstOccurrence = -1;
//         int lastOccurrence = -1;
        
//         // Find the first occurrence
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 firstOccurrence = i;
//                 break; // Stop once the first occurrence is found
//             }
//         }
        
//         // Find the last occurrence
//         for (int i = arr.length - 1; i >= 0; i--) {
//             if (arr[i] == target) {
//                 lastOccurrence = i;
//                 break; // Stop once the last occurrence is found
//             }
//         }

//         return new int[]{firstOccurrence, lastOccurrence};
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
//         int target = 8;
        
//         int[] result = findFirstLastIndices(arr, target);
//         System.out.println("Result: " + result[0] + " " + result[1]);
//     }
// }
