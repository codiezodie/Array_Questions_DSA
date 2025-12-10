import java.util.Scanner;

public class findNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {nums[i] = sc.nextInt();
        }

        int ans = 0;
        for (int a : nums) {
            if (String.valueOf(a).length() % 2 == 0) ans++;
        }
        System.out.println("Numbers of even digits are:" + ans);;

    }
}
