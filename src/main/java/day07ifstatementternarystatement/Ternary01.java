package day07ifstatementternarystatement;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a number is even or not by using ternary
        int num=8;

        //1.way: use if-else
        if (num%2==0){System.out.println("Even");}else{System.out.println("Odd");}

        //2.way: use ternary
        String result= num%2==0 ? "Even" : "Odd";
        System.out.println("result = " + result);

        //Example 2: Type code to check if a number has 3 digits or not

        int number=-100;

        number= Math.abs(number);

        String result2=number>99 && number<1000 ? "It has 3 digits" : "No 3 digits";
        System.out.println("result2 = " + result2);



    }
}
