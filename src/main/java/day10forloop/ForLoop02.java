package day10forloop;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1: Type code to find the sum of the unique digits in an integer
        //           123214==> 3+4=7

        Scanner input= new Scanner(System.in);
        System.out.println("enter an integer");
        String num= input.next().replaceAll("[^0-9]", "");

        int sumOfUniques=0;

        for (int i=0; i<num.length();i++){

            String ch= num.substring(i,i+1);

            if (num.indexOf(ch)==num.lastIndexOf(ch)){

                sumOfUniques=sumOfUniques + Integer.valueOf(ch);//if you use "non digit" characters in valueOf() it gives error
            }
        }
        System.out.println(sumOfUniques);














    }
}
