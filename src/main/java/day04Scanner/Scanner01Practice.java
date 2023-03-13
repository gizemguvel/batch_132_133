package day04Scanner;

import java.util.Scanner;

public class Scanner01Practice {
    public static void main(String[] args) {

        //Example 1: Get the initial of a name which contains first name and last name.
        //          Tom Hanks ==> TH

        Scanner input= new Scanner(System.in);
        System.out.println("enter first and last name");

        String name=input.nextLine();
        char firstName =name.charAt(0);
        char lastName=name.split(" ")[1].charAt(0);
        System.out.println(firstName+" "+lastName);

    }
}
