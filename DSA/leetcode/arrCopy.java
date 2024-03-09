import java.util.ArrayList;
import java.util.Arrays;

public class arrCopy{
    public static void main(String[] args
    ){
        int[] arr = {2,4,32,2};
        Arrays.sort(arr);
        int len = arr.length;
        int[] arr2 = Arrays.copyOf(arr,len);
        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        int key = arr[2];
        int index = Arrays.binarySearch(arr,key);
        System.out.println(index);

        boolean val = Arrays.equals(arr,arr2);
        System.out.println(val);
        // ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3,4,6,3,4));
        ArrayList arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(44);
        arr1.set(2,9);
        System.out.println(arr1);
        System.out.println(arr1.get(3));
        String str = "Hello";
        char ch = str.charAt(1); // Indexing starts from 0
        System.out.println(ch);
        

    }
}