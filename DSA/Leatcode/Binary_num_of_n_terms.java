
import java.util.ArrayDeque;
import java.util.Queue;
class Solution{
    Queue<String> q = new ArrayDeque<>();
    public void BinaryGenerator(int n){
        q.add("1");
        int i = 0;
        while(i < n){
            q.add(q.peek()  + "0");
            q.add(q.peek()+ "1");
            i++;
            System.out.println(q.poll()+ ' ');

        }
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int n = 16;
        s.BinaryGenerator(n);
    }
}