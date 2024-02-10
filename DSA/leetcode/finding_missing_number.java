// import java.util.*;

 class tUf {
    public static boolean  missingNumber(int []a, int N) {

        // int hash[] = new int[N + 1]; //hash array

        // // storing the frequencies:
        // for (int i = 0; i < N - 1; i++)
        //     hash[a[i]]++;

        // //checking the freqencies for numbers 1 to N:
        // for (int i = 1; i <= N; i++) {
        //     // if (hash[i] == 0) {
        //     //     return i;
        //     // }
        //     System.out.print(hash[i]);
        // }

        // // The following line will never execute.
        // // It is just to avoid warnings.
        // // return -1;
        for(int i = 1;i <= N;i++){
            if(a[i-1] != i){
                System.out.println("missng a number:"+i);
                return false;
            }
        }            return true;

    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        boolean ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}