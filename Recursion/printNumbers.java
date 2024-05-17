
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

