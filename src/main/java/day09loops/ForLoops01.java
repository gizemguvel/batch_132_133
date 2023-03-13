package day09_loops;

public class ForLoops01 {

    public static void main(String[] args) {

        /*
        When we need to do "repeated actions" in Java we use loops
         */

        //Example 1: Type "Hi" for 5 times on the console
        //1.way:
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.way: Loops==> There are 4 types of loops in Java=> i)for-loop  ii) while-loop   iii) do-while loop iv) for each
        //  Starting value     Condition/Stop point value      Increment/Decrement

        for( int i=1  ;    i<6 ;      i= i+ 1){
            System.out.println("Hi!");
        }

        //Example 2: Type all integers from 11 to 44 "in the same line" with a space between consecutive integers
        //           11 12 13.... 44

        for (int i=11 ; i<45 ; i=i+1){
            System.out.print( i +" ");
        }

        System.out.println();
        //Example 3: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for (int i=11 ; i<45 ; i=i+1){

            if (i%2==0){

                System.out.print(i+ " ");
            }
        }

        /*
                                ***** Increment *****
                  --increasing by addition operation
                  int i=12;
                  int i=i+3;  ==>  i+=3;
                  int i=15;

                  i++; ==> i=i+1

                  --increasing by multiplication operation
                  int j=4;
                  int j= j*3;  ==> j*=3;
                  int j=12;

                                ***** Decrement *****
                   --decreasing by subtraction operation
                  int k=10;
                  int k=k-2;  ==>  k-=2;
                  int k=8;

                  k--; ==> k=k-1


                  --decreasing by division operation
                  int m=24;
                  int m= m/6;  ==> m/=6;
                  int m=4;
     */
        System.out.println();
        //Example 4: Type "odd integers" from 68 to 13 in the same line with a space between consecutive integers

        for (int i=68; i>12; i--){
            if (i%2!=0){
                System.out.print( i+" ");
            }
        }

        //Example 5: Type code to print the letters from 'c' to 'u'
        System.out.println();
        for (char i='c'; i<'v' ;i+=1){
            System.out.print(i+ " ");
        }
        System.out.println();
        //Example 6: Type code to print integers from 0 to 100 without using any number
        for (int i= 'a'-'a'; i<'e'; i=i+1){
            System.out.print(i+ " ");
        }

        /*
            We can use "int" as data type for char data
            If you use "char" as data type for "char"s Java gives you the character
            If you use "int" as data type for "char"s Java gives you the ASCII value of the char
         */
        System.out.println();
        char ch='m';
        System.out.println("ch = " + ch);

        int dh='m';
        System.out.println("dh = " + dh);


    }









}