import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String result = removeCommonCharacters(str1, str2);
        System.out.println(result);
    }
    public static String removeCommonCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str1.indexOf(c) == -1) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
