package Coding;

public class Multiplybothdigit {
    public static void main(String[] args)
    {
        String str="465789";
        long value=1;
        for(int i=0;i<str.length();i++)
        {
           value =value * (str.charAt(i) - '0');
        }

       System.out.print(value);

    }
}
