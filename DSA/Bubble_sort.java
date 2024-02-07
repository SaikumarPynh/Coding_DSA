public class Bubble_sort{
    public static int[] sort(int[] arr){
        for(int i = arr.length -1;i > 0;i--){
            for(int j = 0;j < i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
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