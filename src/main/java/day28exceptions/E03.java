package day28exceptions;

public class E03 {

    /*
        1)"finally block" is used to execute some codes under every condition
        2)"finally block" can be used with "try-catch" or just with "try"
        3)"try block" cannot be used alone
          "try block" can be used with i)a single catch ii)multiple catches iii)a single catch and finally
                                       iv)multiple catches and finally  v)just a finally
        4)"finally block" can be used just once

        Interview Question: Can you explain "final", "finally", and "finalized" keywords?
                            "finalize" is a process Java does before throwing unused things from memory to trash
     */
    public static void main(String[] args) {

        System.out.println(divide(6,2));

        System.out.println(divide(6,0));



    }

    //Example 1: create a method to do division
    //           the method should print "The mission is completed" even exception thrown or not

    public static int divide(int a, int b){
        int result=0;

        try{
            result=a/b;

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The mission is completed");
        }
        return result;
    }
}
