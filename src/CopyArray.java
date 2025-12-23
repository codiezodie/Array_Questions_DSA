import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of both the array:");
        int size = sc.nextInt();
        int A[] = new int[size];
        int B[] = new int[size];

        System.out.println("Enter the numbers in Array A:");
        for (int i = 0; i < A.length; i++) {

            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {

            B[i] = A[i];
        }
        System.out.print("elements in Array B are:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
