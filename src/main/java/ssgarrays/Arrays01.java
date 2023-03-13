package ssgarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: Create an integer array  with 5 elements and print elements  console.
        int arr[]=new int[5];
        arr[0]= 5;
        arr[1]= 7;
        arr[2]= 51;
        arr[3]= 10;
        arr[4]= 2;
        System.out.println(Arrays.toString(arr));


        for (Integer w:arr) {

            if(w<=7){
                System.out.print(w);
            }

        }

        //Example 3: Type code to check if a specific element exists in the array or not

    }
}
