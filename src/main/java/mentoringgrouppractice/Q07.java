package mentoringgrouppractice;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        //Example 1: Check the password if it has given rules.
        //           i)It should start with "J"
        //           ii)It should have at least 8 characters
        //           iii)Last 3 characters should be "AVA"


        String pwd= "JmannmdmAVA";

       boolean first= pwd.startsWith("J");

        System.out.println(first);

        boolean numOfChar=pwd.length()>7;

        System.out.println(numOfChar);

        boolean last= pwd.substring(pwd.length()-3).equals("AVA");

        System.out.println(last);




        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a new password");
        String pssw = input.next();

        if(pssw.startsWith("J") && (pssw.length()>7) && pssw.endsWith("AVA")){
            System.out.println("Password done!");
        } else {
            System.out.println("please enter valid password");
        }







    }



}
