import java.util.Arrays;
import java.util.Scanner;

//import static sun.swing.MenuItemLayoutHelper.max;

public class BuySellStock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size = sc.nextInt();

        int prices[] = new int[size];
        System.out.println("Enter the prices of Stock:");
        for (int i = 0; i < prices.length; i++) {

            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        int maxprice=0;
        for(int i=0;i<prices.length;i++){
            for(int j=1;j<prices.length;j++){
              maxprice=prices[i]-prices[j];
            }
            //System.out.print(maxprice);
        }
        System.out.print(maxprice);
    }
}
