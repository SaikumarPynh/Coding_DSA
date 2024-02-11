import java.util.Arrays;
class solution{
    public static void result(int[] arr){
        if(arr.length == 0){
         return;
        }
        int max = 1;
        int count = 1;
        int lastElement = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]-1 == lastElement){
                count++;
                lastElement = arr[i];
                max = Math.max(max,count);
            }else{
                lastElement = arr[i];
                count = 1;
            }
        }
        System.out.print("maximum length of the consecutive sequence is:"+max);
                
    }
    public static void main(String[] args){
        int[] arr = {4,100, 200, 1, 2, 3};
        result(arr);
    }   
}