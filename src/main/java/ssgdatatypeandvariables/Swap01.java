package ssgdatatypeandvariables;

public class Swap01 {
    public static void main(String[] args) {

        /*
        1- Changing the value of given number1 and number2 variables (SWAP)
        write a program
        Example: number1=10 and number2=20;
        after running the code
        number1=20 and number2=10

         */
        int num1=10;
        int num2=20;
        int temp=0;

        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);

        int n1=20;
        int n2=15;
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1 +"-" +n2 );
    }
}
