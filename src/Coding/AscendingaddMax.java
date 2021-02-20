package Coding;

import java.util.*;

public class AscendingaddMax {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int values[]={2, 33, 41, 22, 31, 16};
        int arr[]=new int[30];


        for(int i=0,j=0;i<values.length-1;i++)
        {
            if(values[i]<values[i+1])
            {
                arr[j]=arr[j]+values[i];
            }
            else{
                arr[j]=arr[j]+values[i];
                j++;
            }
        }

        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];

            }

        }
         System.out.print(max);

    }
}
