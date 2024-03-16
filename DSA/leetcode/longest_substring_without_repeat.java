    //import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.Scanner;
    class long_substring{
        int max = 0;
        int left = 0;
        public int result(String str){
        //ineficient brute force method O(n^2) using arrayList 
        //     if (s.equals(" ")) {
        //     return 1;
        // }
        //     for(int i = 0;i<str.length();i++){
        //         int count = 0;
        //         ArrayList<Character> arr = new ArrayList<>();
        //         for(int j = i;j<str.length();j++){
        //             if(arr.contains(str.charAt(j))){
        //                 break;
        //             }else{
        //                 arr.add(str.charAt(j));
        //                 count++;
        //                 max = Math.max(max,count);

        //             }
        //         }
        //     }

        //efficient using sliding window method using hashmaps

        
            return max;
        }
        public static void main(String[] args){
            long_substring obj = new long_substring();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");
            String str = sc.next();
            System.out.println(obj.result(str));

        }
    }