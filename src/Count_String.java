//WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;

public class Count_String
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any String =");
        String Strng = scanner.next();

        int Count = Strng.length() - Strng.replace(("a"),"").length();

        System.out.println("Number of a = " +Count);




    }

}
