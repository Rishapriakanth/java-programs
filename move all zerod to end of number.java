import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < T; i++) {
            
            String numStr = scanner.nextLine();
            System.out.println(moveZeroesToEnd(numStr));
        }

        scanner.close();
    }
    public static String moveZeroesToEnd(String numStr) {
        StringBuilder sb = new StringBuilder();

        for (char c : numStr.toCharArray()) {
            if (c != '0') {
                sb.append(c);
            }
        }

        for (char c : numStr.toCharArray()) {
            if (c == '0') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
