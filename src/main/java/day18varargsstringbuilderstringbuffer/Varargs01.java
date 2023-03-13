package day18varargsstringbuilderstringbuffer;

public class Varargs01 {

    /*
        1)If you want to create a method works with any number of parameters remember to use "Varargs"
        2)"Varargs" is a data structure uses arrays behind, thats why when you use varargs you may think you are using Arrays
        3)Question: Can I use more than one "Varargs" in a method?
                    No. Varargs cannot be made full, thats why Java cannot jump to the second parameter so second parameter will be "unreachable",
                    if you type unreachable code in anywhere Java will give you error.
        4)Question: Can I use another parameter after "Varargs" in a method?
                    No. Varargs cannot be made full, thats why Java cannot jump to the second parameter so second parameter will be "unreachable",
                    if you type unreachable code in anywhere Java will give you error.
        5)Question: Can I use a parameter before "varargs" in a method?
                    Yes. Using parameters before varargs is possible.
        6)"Varargs" can be declared like "int... v" or "int ...v"

                    Note: Varargs must be the last parameter in a method. There is no any other usage


     */
    public static void main(String[] args) {

       int r1= add(3);
       System.out.println(r1);

        int r2= add(3,5);
        System.out.println(r2);

        int r3= add(1,2,10,3,5);
        System.out.println(r3);
    }

    //Create a method to add two integers
    public static int addTwoInt(int a, int b){
       return a+b;
    }

    //Create a method to add three integers
    public static int addThreeInt(int a, int b, int c){
        return a+b+c;
    }

    //Create a method to add four integers
    public static int addFourInt(int a, int b, int c, int d){
        return a+b+c+d;
    }

    //Create a method to add any number of integers
    public static int add(int... v){

        int sum=0;

        for(int w: v){

            sum=sum+ w;

        }
        return sum;
    }

    //Create a method uses two Varargs as parameter
    public static void test(boolean b, int... a){

    }




}
