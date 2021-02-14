//optimized SuperASCII2

package Coding;

import java.util.*;
public class SuperASCII2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter[] = new int[26];
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 97 + 1;

            counter[index - 1]++;
        }
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 97 + 1;

            if(counter[index-1]!=index)
            {
                System.out.print("NO");
                return ;
             }

        }
        System.out.print("Yes");
    }
}