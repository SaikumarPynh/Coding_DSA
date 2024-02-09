
import java.util.Stack;
public class Rotate_Array_by_n{
   private static  Stack<Integer> stack = new Stack<>();
static void solve(int arr[], int n) {
     int[] newArray = new int[arr.length];

for(int i = 0;i< n;i++){
    stack.push(arr[i]);
}
int j = 0;
for(int i = n;i < arr.length;i++){
newArray[j] = arr[i];
j++;
}
while(!stack.isEmpty()){
    int i = n;
    newArray[j] = stack.pop();
    j++;
}
for(int i:newArray){
    System.out.print(i+" ");
}

  
}
public static void main(String args[]) {
  int n=2;
  
  int arr[]= {1,2,3,4,5};
  solve(arr, n);
}
}