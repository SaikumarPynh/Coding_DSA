public class find_second_min_max{
    static  int firstMax = Integer.MIN_VALUE;
    static int secondMax = Integer.MIN_VALUE;
    static int secondMin = Integer.MAX_VALUE;
    static int firstMin = Integer.MAX_VALUE;

    public static int[] sol(int[] arr){

     minval(arr);
      maxval(arr);
     return new int[] {secondMin,secondMax};

    }

    public static void minval(int[] arr){
        for(int i = 0;i< arr.length;i++){
        if(arr[i] < firstMin){
            secondMin = firstMin;
            firstMin = arr[i];
        }else if(arr[i] < secondMin){
            secondMin = arr[i];
        }
    }
    }
    public static void  maxval(int[] arr){
        for(int i = 0;i< arr.length;i++){
        if(arr[i] > firstMax){
            secondMax = firstMax;
            firstMax = arr[i];
        }else if(arr[i] > secondMax){
            secondMax = arr[i];
        }
    }
    }

public static void main(String[] args){
        int[] arr = {1, 46, 24, 52, 20};
        System.out.println("second min and max are:");
        int[] res =sol(arr);
        for(int i:res){
        System.out.print(i+" ");
        }

        
    }
}