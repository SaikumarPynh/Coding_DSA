
public class printNamesUsingRecursion {
    int i = 0;
    void printGfg(int N) {
        // code here
        System.out.print("GFG"+" ");
        if(i == N){
            return;
        }
        i++;
        printGfg(N);
    }
}