
public class Selection_Sort {
    
    public static  int[] selectionSort(int[] arr, int len){
        for(int i = 0;i<len-1;i++){
            int min = i;
            for(int j = i+1;j<len;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7,4,3,1,6};
        int count = 0;
        for(int a:arr){
            count++;
        }
        arr = selectionSort(arr,count);
        for(int a:arr){
        System.out.println(a+" ");
        }
    }
}
