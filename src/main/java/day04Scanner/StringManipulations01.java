package day04Scanner;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Get the full name of the user and make all characters in uppercase.
        //

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name and last name");

        String fullName= input.nextLine().toUpperCase();
        //toUpperCase() method converts all characters to uppercase.
        System.out.println(fullName);

        /*Example 2:Get the full name of the user, make all characters in uppercases and remove spaces
        from the beginning and from the end.*/

        System.out.println("Enter your first name and last name");
        String name= input.nextLine().toUpperCase().trim();//method chain
        System.out.println(name);

        //trim() method removes the "space" characters from the beginning and from the end.
        //trim() method does not touch spaces in the middle

        //Example 3: Get a String from the user, then count the number of the characters in the String.
        System.out.println("Enter a String..");

        String s= input.nextLine();
        int numOfChars= s.length();//length() gives you the number of characters in a String

        System.out.println(numOfChars);











    }
}
