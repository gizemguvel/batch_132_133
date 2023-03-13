package day08ternary_switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //Example 1: Create a simple calculator which does addition, subtraction, multiplication,
        //division, percentage calculation

        Scanner input= new Scanner(System.in);
        System.out.println("enter first number");
        double num1=input.nextDouble();

        System.out.println("enter second number");
        double num2=input.nextDouble();

        System.out.println("enter operation symbol: +, -, *, /, %");

        char operationSign= input.next().charAt(0);

        switch (operationSign){
            case '+':
                System.out.println("the sum is: " + (num1+num2));
                break;
            case '-':
                System.out.println("the difference is: "+(num1-num2));
                break;
            case '*':
                System.out.println("the multiplication is: "+(num1*num2));
                break;
            case '/':
                System.out.println("the division is: "+(num1/num2));
                break;
            case '%':
                System.out.println("the percentage is: " + (num1*num2)/100);
                break;
            default:
                System.out.println("this operation was not defined");
        }

















    }
}
