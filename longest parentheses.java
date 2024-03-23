
import java.util.*;
class Main
{
  public static int longestParentheses(String str)
  {
    Scanner sc=new Scanner(System.in);
    Stack<Integer> s=new Stack<>();
    s.push(-1);
    int result =0;
    for(int i=0;i< str.length();i++)
    {
      char c=str.charAt(i);
      if(c=='(')
        s.push(i);
      else
      {
        if(!s.empty())
          s.pop();
        if(!s.empty()){
          result =Math.max(result,i-s.peek());
        }
        else
          s.push(i);
        
      }
    }
    return result;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(longestParentheses(str));
  }
}