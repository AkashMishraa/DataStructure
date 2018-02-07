import java.util.Stack;
import java.util.Arrays;

public class StockSpanProblem
{
  static void calculateSpan(int price[], int n, int s[])
  {
    Stack<Integer> st = new Stack<>();
    st.push(0);
    s[0] = 1;

    for(int i=1; i < n; i++)
    {
      while(!st.empty() && price[st.peek()] <= price[i])
      st.pop();
      s[i] = (st.empty()) ? (i+1) : (i-st.peek());
      st.push(i);
    }
  }

  static void printArray(int arr[]){
    System.out.print(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    int price[] = {10,20,4,6,90,120,80};
    int n = price.length;
    int s[] = new int[n];

    calculateSpan(price, n, s);

    printArray(s);
  }

}
