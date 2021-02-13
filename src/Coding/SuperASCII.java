//In the Byteland country, a string S is said to super ASCII string if and only if the count of each character in the string is equal to its ASCII value. In the Byteland country ASCII code of ‘a’ is 1, ‘b’ is 2, …, ‘z’ is 26. The task is to find out whether the given string is a super ASCII string or not. If true, then print “Yes” otherwise print “No”
package Coding;
import java.util.*;
public class SuperASCII {
    public static void main(String[] args)
    {
        boolean flag=false;
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        int c=0;
        int counter=0;
        int base=0;
        HashMap<Character, Integer> Map=new HashMap<Character, Integer>();

        for(int i=0;i<input.length();i++) {
            if (!Map.containsKey(input.charAt(i))) {
                Map.put(input.charAt(i), base + 1);
                c = input.charAt(i) - 97 + 1;

                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(i) == input.charAt(j)) {
                        counter++;
                    }

                }
                if (counter != c) {
                    flag = true;
                }
                counter = 0;
            }
        }
            if (flag) {
                System.out.print("Not SuperASCII");
            } else {
                System.out.print("SuperASCII");
            }


    }
}
