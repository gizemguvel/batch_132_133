package ssgasciitablememoryusage;

public class AsciiValue01 {
    public static void main(String[] args) {

        char ch ='A';
        System.out.println(ch);

        // there 2 ways to see the value of char.
        int ch1 ='A';
        System.out.println(ch1);//65

        System.out.println(ch1+0);// 65+0= 65


        System.out.println('a' + 'b');
        System.out.println("a" +('a' + 'b'));//

        ////question=1:  write a program to print  all the ascii value  from  A to  Z.

        for(char i='A'; i<='Z';   i++) {

            System.out.print(i + " ");

        }

        System.out.println("--------");


        for(char i='a'; i<='z';   i++) {

            System.out.print(i + " ");

        }
        System.out.println();

        /// A : 65
        for(int i='A'; i<='Z';   i++) {

            System.out.println("The ASCII Value : "+ (char)i + " " +i);

        }

        System.out.println("----------------");

        for(int i='a'; i<='z';   i++) {

            System.out.println("The ASCII Value : "+ (char)i + " " +i);

        }

        // write the program to calculate the sum  all ascii value lowercase a to z

        int sum=0;
        for(int i='a'; i<='z' ;i++ ){

            sum=sum+i;

        }System.out.println(sum);


        // a b c d e f
        // a b c d e f
        // a b c d e f
        // a b c d e f
        // a b c d e f

        for (int i = 0; i < 5; i++) {
            for (int j = 'a'; j <= 'f'; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }

        char input ='f';

        for (char i = 'a'; i <input; i++) {

            for (char j = 'a'; j <= input; j++) {
                System.out.print(j+ " ");
            }
            System.out.println("");

        }

        

    }
}
