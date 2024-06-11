import java.util.ArrayList; 
class solition{
   static  ArrayList<Integer> listp = new ArrayList<>();
    static ArrayList<Integer> listn = new ArrayList<>();
    public static void result(int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < 0){
                listp.add(arr[i]);
            }else{
                listn.add(arr[i]);
            }
        }
    for(int i=0;i<arr.length/2;i++){
        arr[2*i] = listp.get(i);
        arr[2*i+1] = listn.get(i);
    }
       for(int i = 0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args){
        int[] arr = {1,2,-4,-5};
        result(arr);
    }
}
