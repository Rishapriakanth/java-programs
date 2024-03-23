import java.util.*;

public class Main {
    public static int postfixEvaluation(String exp) {
        Stack<Integer> s = new Stack<>();
        char c;
        if (exp.equals(" ")) {
            System.out.println("0");
        }
        for (int i = 0; i < exp.length(); i++) {
            c = exp.charAt(i);
            if (c == ' ') {
                continue;
            } else if (c >= '0' && c <= '9') {
                s.push(c - '0');
            } else {
                int x = s.peek();
                s.pop();
                int y = s.peek();
                s.pop();
                if (c == '+') {
                    s.push(y + x);
                } else if (c == '-') {
                    s.push(y - x);
                } else if (c == '*') {
                    s.push(y * x);
                } else if (c == '/') {
                    s.push(y / x);
                }
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String exp = sc.nextLine();
            System.out.println(postfixEvaluation(exp));
        }
    }
}
