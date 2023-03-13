package day14multidimensionalarraysarraylists;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Example 1: convert 2 dimensional array to 1 dimensional array
        //          [ [5,3], [9,8,7] ] ==>  [5,3,9,8,7]

        int a[][]= { {5,3}, {9,8,7}};


        //1.step: find the number of elements in the multidimensional array
        int sum=0;

        for(int[] w: a){
            sum=sum+w.length;
        }
        System.out.println(sum);//5


        //2.step: create new one dimensional array whose length is the same
        //          with the number of elements in the multidimensional array
        int b[]= new int[sum];

        //3.step: transfer the elements from the multidimensional array to 1 dimensional array

        int idx=0;
                    //[ [5,3], [9,8,7] ]
        for(int[] w:a){

           for(int k: w){

               b[idx]=k;

               idx++;
           }
       }
        System.out.println(Arrays.toString(b));//[5, 3, 9, 8, 7]

















    }
}
