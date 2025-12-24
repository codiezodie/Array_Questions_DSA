
import java.util.Scanner;
//creating an array,taking input in an array, printing an array
public class Creating_Array {
    public static void main(String[] args) {
        // creating an Array
        // 1st way
        int A[] = new int[5];

        // 2nd way
        int B[] = { 1, 2, 3, 4, 5 };

        // 3rd way
        int C[];
        C = new int[5];

        // 4th way
        int[] D = new int[5];

        // taking input and printing output of the array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int E[] = new int[size];

        // taking input
        for (int i = 0; i < size; i++) {
            E[i] = sc.nextInt();
        }

        // printing output
        for (int i = 0; i < size; i++) {
            System.out.println(E[i]);
        }

    }
}