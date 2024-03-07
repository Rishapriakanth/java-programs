import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedCode = scanner.next();
        String decryptedCode = decryptCode(encryptedCode);
        System.out.println(decryptedCode);
    }

    public static String decryptCode(String encryptedCode) {
        char[] codeArray = encryptedCode.toCharArray();

        for (int i = 0; i < codeArray.length - 1; i += 2) {
            char temp = codeArray[i];
            codeArray[i] = codeArray[i + 1];
            codeArray[i + 1] = temp;
        }

        return new String(codeArray);
    }
}
