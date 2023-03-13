package practice1002.abstraction;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q05_NestedForLoop_Triangle {

    /*
        Take the number of rows from user and print on console the shape based on rows.
                 *
                * *
               * * *
              * * * *
             * * * * *
    */
    public static void main(String[] args)  {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter row number");
        int row= scanner.nextInt();

        for (int i=0; i<5 ;i++){

            for(int space=row-i; space>1;space--){

                System.out.print(" ");

            }
            for (int j=0; j<=i;j++){

                System.out.print("* ");

            }
            System.out.println();
        }



    }
}
