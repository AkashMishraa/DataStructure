class StackUsingArray{
  static final int max = Integer.MAX_VALUE;
  int top;
  int[] arr = new int[max];

  boolean isEmpty(){
    return top(top < 0)
  }

  StackUsingArray(){
    top = -1;
  }

  boolean push(int x){
    if(top >= max){
      System.out.println("Stack is Overflow");
      return false;
    }
    else
    {
      arr[++top] = x;
      return true;
    }
  }
  int pop(){
    if(top < 0){
      System.out.println("Stack in Underflow");
      return 0;
    }else
    {
      int x = arr[top--];
      return x;
    }
  }
}

class main
{
 public static void main(String[] args) {
  StackUsingArray s = new StackUsingArray();
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);

  System.out.println(s.pop() + " Popped from Stack ");

  }
}
