

import java.util.HashMap;
import java.util.Scanner;

public class AnagramStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String:");
        String str1 = sc.nextLine();
        System.out.print("Enter your Second  String:");
        String str2 = sc.nextLine();
        HashMap<Character, Integer> hm1 = anagramCheck(str1);
        HashMap<Character, Integer> hm2 = anagramCheck(str2);

        System.out.println(hm1);
        System.out.println(hm2);

        if(hm1.equals(hm2)){
            System.out.println("They are Anagrams.");
        }else{
            System.out.println("They are not Anagrams.");
        }

    }

        public static HashMap<Character, Integer> anagramCheck(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (hm.containsKey(ch)) {
                int val = hm.get(ch);
                hm.put(ch, val + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        return hm;
    }
}
