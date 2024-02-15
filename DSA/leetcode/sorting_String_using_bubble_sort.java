class solution{
    public static String result(String str){
        char[] arr = str.toCharArray();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1])
                {
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new String(arr);
    }
    public static void main(String[]  args){
        String s = "saikumar";
        String cur = s;
        System.out.print("String before sorting is "+cur+" String after sorted is "+result(s));
    }
}