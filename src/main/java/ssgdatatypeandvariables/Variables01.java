package ssgdatatypeandvariables;

public class Variables01 {



    public String name="Esra";//class variable

    public static int x=12;//static variable


    public static void main(String[] args) {
        //Create 3 different variables data types and print them.


        String schoolName="Start School";//local variable
        System.out.println(schoolName);

        Variables01 obj=new Variables01();
        System.out.println(obj.name);

        System.out.println(Variables01.x);

        // Create two variables for name and surname and print  them int console?
        // your name : Muhmmad
        // your last name: Frotan
        // print as

        String name="Gizem";
        String lastName="Guvel";
        System.out.println(name +" "+lastName);

        //Create 2 variables in two different integer data types and print their sum

        int a=20;
        int b=30;
        int sum=a+b;
        System.out.println("Sum is "+sum);


        //Create an integer and a char variable and print their sum.

        int x=12;
        char y='a';
        System.out.println(x+y);




    }
}




