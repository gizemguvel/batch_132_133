package questions;


import java.util.Arrays;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        
        int arr[][] = {{5, 12}, {3, 8, 4}, {6, 3}};
        System.out.println(Arrays.toString(arr[0]));

        StringBuilder strBld = new StringBuilder("LearnJava");
        System.out.println(strBld.substring(3));

        strBld.insert(0,"You");
        System.out.println(strBld);

        StringBuilder sb = new StringBuilder("animals");
        String sub1 = sb.substring( 3 );
        System.out.println(sb);

        for (int i = 0; i <6 ; i++) {
            if(i==3){
                continue;
            }System.out.println("merhaba"+i);
        }


        LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.removeAll(c1);
        System.out.println(c1);
    }





}



