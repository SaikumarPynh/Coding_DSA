public class Insertion_sort{
    public static int[] sort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1, 46, 24, 52, 20};
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