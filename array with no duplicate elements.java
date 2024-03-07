//array with no duplicate elements
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    	Scanner sc=new Scanner(System.in);
    	int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int num : set) {
            System.out.println(num);
        }
  }
}