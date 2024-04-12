import java.util.*;
class Main{
public static String shortestPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (j >= 0) {
        if (s.charAt(i) == s.charAt(j)) {
            i++;
        }
        j--;
    }
    if (i == s.length()) {
        return s;
    }
    String suffix = s.substring(i);
    String prefix = new StringBuilder(suffix).reverse().toString();
    String mid = shortestPalindrome(s.substring(0, i));
    return prefix + mid + suffix;
}

public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    String input = sc.nextLine();
    String output = shortestPalindrome(input);
    System.out.println(output);  
}
}
