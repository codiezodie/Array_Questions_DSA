import java.util.Scanner;
public class MaxConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int count = 0;
        int maxvalue = 0;

        for (int i = 0; i < n; i++) {
            if (num[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            maxvalue = Math.max(maxvalue, count);
        }

        System.out.println("Max consecutive ones = " + maxvalue);
    }
}

