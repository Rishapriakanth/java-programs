import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String result = isAnagram(str1, str2) ? "Anagram" : "Not Anagram";

        System.out.println(result);
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!charCount.containsKey(ch) || charCount.get(ch) == 0) {
                return false;
            }
            charCount.put(ch, charCount.get(ch) - 1);
        }

        return true;
    }
}

