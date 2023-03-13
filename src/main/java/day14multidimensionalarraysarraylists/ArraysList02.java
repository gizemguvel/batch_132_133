package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArraysList02 {
    public static void main(String[] args) {

        /*
            When you talk about "Arrays" use length
            When you talk about "Lists" use size
         */

        //Example 1:Type code to print the elements of a list if the element is greater than the number of elements
        //          [5, 9, 3, 4, 6]==> 9-6

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(4);
        nums.add(6);

        //1.step: Find the number of list elements
        int numOfEl= nums.size();

        //2.step: Check if an element is greater than the number of list elements then print it
        for(Integer w: nums){

            if(w>numOfEl){
                System.out.print(w+ " ");
            }

        }

        char ch = 'm';
        System.out.println(ch>='a' && ch<='z' ? "Bad" : "Good");

        int a = 7; if(a>10) {
            System.out.println("Good"); }else {
            System.out.println("Bad"); }

    }
}
