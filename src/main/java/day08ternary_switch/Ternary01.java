package day08ternary_switch;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Type code to select the minimum one of two integers
        int a= 12;
        int b= 5;

       int r1= a<b ? a : b;
       System.out.println("min value is: " + r1);

       //Example 2: Type code to calculate absolute value of an integer

        int c= 0;

        int r2= c<0 ? -1*c : c;
        System.out.println("Absolute value is: " + r2);

        //Example 3: If two integers are positive return the multiplication
        //           otherwise, give a message "I do not know how to multiply"

        int d= -3;
        int e= 4;

        Object r3= d>0 && e>0 ? d*e : "I do not know how to multiply";
        System.out.println("r3 = " + r3);







    }
}
