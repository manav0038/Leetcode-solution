import java.util.Stack;
public class nser {
    public static void main(String[] args) {
        
        int[] arr= {1,5,6,2,4,6,7,12};
        nextSmallerElements(arr);
        
    }
     public int[] nextSmallerElements(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i])
                A[stack.pop()] -= A[i];
            stack.push(i);
        }
        return A;
    }    }
