import java.util.ArrayList;

class solution{
    public static void result(int[] arr){
   ArrayList<Integer> array = new ArrayList<>();
   int n = arr.length;
   int max = arr[n-1];
   array.add(max);
   for(int i=n-2;i>-1;i--){
    if(arr[i]> max){
        array.add(arr[i]);
        max = arr[i];
    }
   }
   System.out.print(array);
    }
    public static void main(String[] args){
        int[] arr = {10, 22, 12, 3, 0, 6};
        result(arr);
    }   
}