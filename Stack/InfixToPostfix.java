import java.util.Stack;

class InfixToPostfix
{

  static int Precidence(char c)
  {
    switch(c){
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
  }
    return -1;
}

  static String infixToPostfix(String exp)
  {
    String result = new String(" ");
    Stack<Character> stack = new Stack<>();

    for(int i = 0; i < exp.length(); i++)
    {
      char c = exp.charAt(i);

      if(Character.isLetterOrDigit(c))
        result += c;

      else if (c == '(')
        stack.push(c);

      else if (c == ')') {
        while(!stack.isEmpty() && Precidence(c) <= Precidence(stack.peek()))
          result += stack.pop();
        stack.push(c);
      }
    }
    while(!stack.isEmpty())
      result += stack.pop();

    return result;
  }
  public static void main(String[] args) {
    String exp = "a+b*(c^d-e)^(f+g*h)-i";
    System.out.println(infixToPostfix(exp));
  }
}
