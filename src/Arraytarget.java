import java.util.Scanner;


public class Arraytarget{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter the numbers in Array:");
        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target = sc.nextInt();
        int[] pair = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    pair[0] = i;
                    pair[1] = j;
                }
            }
            //System.out.println("Target is at index:"+pair[0]+ "," +pair[1]);
        }
        System.out.println("Target is at index:{"+pair[0]+ "," +pair[1]+"}");
    }
}
