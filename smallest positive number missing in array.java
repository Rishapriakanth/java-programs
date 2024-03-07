import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }
        Collections.sort(positiveNumbers);
        int missingNumber = 1;
        for (int num : positiveNumbers) {
            if (num == missingNumber) {
                missingNumber++;
            } else if (num > missingNumber) {
                break;
            }
        }
        System.out.println(missingNumber);
    }
}
