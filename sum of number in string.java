import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int sum=0;
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(s);

    while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

    System.out.println(sum);
  }
}