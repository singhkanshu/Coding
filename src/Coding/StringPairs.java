//Problem Statement: Given an array arr[] consisting of N ( 1 ≤ N ≤ 100 ) integers, the task is to convert each array element ( 1 ≤ arr[i] ≤ 100 ) into their respective textual representations and print the lowercase representation of the count of all possible pairs from the array whose sum is equal to the total count of vowels present in their textual representation. If the count exceeds 100 print “greater 100”.

package Coding;

import java.util.*;
public class StringPairs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int inputsize=sc.nextInt();
        int[] input=new int[inputsize];

        for (int i=0;i<input.length;i++)
        {
            input[i]=sc.nextInt();

        }
        HashMap<Integer, String> Map=new HashMap<Integer, String>();

        Map.put(0,"Zero");
        Map.put(1,"One");
        Map.put(2,"Two");
        Map.put(3,"Three");
        Map.put(4,"Four");
        Map.put(5,"Five");
        Map.put(6,"Six");
        StringPairs obj=new StringPairs();
        for (int i=0;i<input.length;i++)
        {
            if(Map.containsKey(input[i]))
            {
                total+=	obj.countVowels(Map.get(input[i]));
            }
        }
        int counter=0;
        for (int i=0;i<input.length-1;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                if (input[i]+input[j]==total)
                {
                    counter++;
                }
            }
        }
        System.out.print(counter);




    }

    public int countVowels(String input)
    {
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            if (input.charAt(i)=='A' || input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='E' || input.charAt(i)=='I' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='O' || input.charAt(i)=='U' || input.charAt(i)=='u')
            {
                count++;
            }
        }

        return count;
    }

}

