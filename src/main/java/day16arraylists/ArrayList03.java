package day16arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Example 1: Convert an Array to a List
        String a[] = new String[5];
        a[0]="Tom";
        a[1]="Ajda";
        a[2]="Cuneyt";
        a[3]="Angelina";
        a[4]="Brad";

        System.out.println(Arrays.toString(a));

        List<String> myList=  Arrays.asList(a);

 //       System.out.println(myList);
 //       myList.remove("Ajda");//UnsupportedOperationException

        myList.add("Rambo");
        System.out.println(myList);//UnsupportedOperationException

        /*
            When you need to convert an array object to a list, if you use asList() it is used to create a list object
            from an Array object.
            Arrays are fixed in length, when you create a list from an Array, the list will be fixed like an Array in
            length as well. Arrays gene/structure will be transferred to the list.

            So, if you are sure that you will not need to change the size of the list you created from an array, you can use asList()
            otherwise do not use it.
         */

        //Arrays.asList() method is used to create a List from an Array.
        //Arrays are fixed in length, when you create a List from an Array the List will be fixed in length as well.
        //Arrays gene will be transferred to the List.







    }
}
