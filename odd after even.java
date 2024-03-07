import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
        System.out.println("Array after Segregation");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
