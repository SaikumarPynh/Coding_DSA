public class insertion_sort {
    public static int[] sorting(int[] arr, int len){
        for(int i = 0;i<len;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8,3,5,8,3,7};
        int len = arr.length;
        arr =  sorting(arr,len);
        for(int a:arr){
            System.out.println(a+" ");
        }
    }
}
