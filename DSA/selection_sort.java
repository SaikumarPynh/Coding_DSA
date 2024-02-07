//we find minimum index in each iteration and replace the corresponding value with that ith value;

public class selection_sort{
    public static int[] sort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1, 46, 24, 52, 20, 9};
        System.out.println("array before sorting is:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("array after sorting is:");
        int[] res =sort(arr);
        for(int i:res){
        System.out.print(i+" ");
        }

        
    }
}