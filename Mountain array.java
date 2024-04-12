import java.util.Scanner;

interface MountainArray {
    public int get(int index);
    public int length();
}

public class Main {
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        int leftResult = binarySearchLeft(mountainArr, target, peakIndex);
        if (leftResult != -1) {
            return leftResult;
        }
        return binarySearchRight(mountainArr, target, peakIndex);
    }

    private static int findPeakIndex(MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static int binarySearchLeft(MountainArray mountainArr, int target, int peakIndex) {
        int left = 0, right = peakIndex;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearchRight(MountainArray mountainArr, int target, int peakIndex) {
        int left = peakIndex, right = mountainArr.length() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        MountainArray mountainArr = new MountainArray() {
            @Override
            public int get(int index) {
                return arr[index];
            }

            @Override
            public int length() {
                return arr.length;
            }
        };

        int output = findInMountainArray(target, mountainArr);
        System.out.println(output);
    }
}
