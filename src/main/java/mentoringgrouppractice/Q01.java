package mentoringgrouppractice;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        //Type code to print first name, last name, age, height and weight then print them on console in this way:
        /*
        First Name: ...
        Last Name: ...
        Age: ...
        Height: ...
        Weight: ...
        Note: Use containers for each element and only one "System.out.println();"

         */

        Scanner input=new Scanner (System.in);
        System.out.println("please enter first name");
        String fNAme=input.next();

        System.out.println("please enter last name");
        String lNAme=input.next();

        System.out.println("please enter age");
        byte age=input.nextByte();

        System.out.println("please enter height");
        double height=input.nextDouble();

        System.out.println("please enter weight");
        double weight=input.nextDouble();

        System.out.println("First Name: "+ fNAme +"\nLast Name: " +lNAme +"\nAge: " + age+"\nHeight: "+ height +"\nWeight: "+weight);




















    }

}

