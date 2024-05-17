
class printNumbers
{
    int i = 1;
  public void printNos(int N)
    {
        //Your code here
        
        System.out.print(i+" ");
        if(i == N){
            return;
        }
                i++;

        printNos(N);
    }
}
// in reverse order
// class Solution {
//     int i = 0;
//     void printNos(int N) {
//         // code here
//         if(N == i){
//             return;
//         }
//         System.out.print(N+" ");
//         N--;
//         printNos(N);
        
//     }
// }

