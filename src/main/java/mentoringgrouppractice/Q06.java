package mentoringgrouppractice;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {



        //Example 1: Get the full name of the user and make all characters in upper case.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name please");
        String fullName=input.nextLine().toUpperCase();
        System.out.println(fullName);

        //Example 2: Get the full name of the user, make all characters in upper cases and remove spaces
        // from the beginning and from the end


        System.out.println("Enter your full name please");
        String fullName1=input.nextLine().toUpperCase().trim();
        System.out.println(fullName1);


        //Example 3: Get a String from the user , then count the number of the characters in the String

        System.out.println("Enter a string please");
        String str=input.nextLine();
        int numOfChar=str.length();
        System.out.println(numOfChar);

    }
}
