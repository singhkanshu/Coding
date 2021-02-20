package Coding;

public class Replacestring {
    public static void main(String[] args)
    {
      String str="456789876556789876556";

      String str1=str.replace("56","");
      str1=str1.replace("7","");
      System.out.print(str1);
    }
}
