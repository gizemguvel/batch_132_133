package day04Scanner;

public class InterviewQuestion01 {

    public static void main(String[] args) {

        //Example1: Type code to swap two integers.
        //          a=12 and b=5  ==> a=5 and b=12

        int a= 12;
        int b= 5;

        System.out.println(a+ " " +b);
        //1.Way:By using a third variable.

        int temp=0;
        //1.Step:
        temp=a;

        //2.Step;
        a=b;

        //3.Step:
        b=temp;

        System.out.println(a+ " " +b);

        //2.Way: do not create a 3rd variable.

        int x=12;
        int y=5;
        System.out.println("Before swapping " + x +" "+y);

        x=x+y;

        y=x-y;

        x=x-y;

        System.out.println("After swapping " + x +" "+y);





















    }
}
