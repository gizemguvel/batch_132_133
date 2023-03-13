package day06stringmanipulationsifstatement;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a given String is empty or not
        //           "Java" ==> false  ""==>true

        String s= "";

        //1.way:
        boolean r1=s.length()==0;
        System.out.println("is the given String empty? " +r1);

        //2.way:
        boolean r2=s.isEmpty();
        System.out.println("is the given String empty? " + r2);


        //Example 2: Type code to check if a given String is containing just space character or not
        //           "      " ==> true    "a    b  "==> false

        String t= "    ";

        //1.way:
        boolean r3=t.replaceAll("[ ]","").length()==0;
        System.out.println("is it containing just space character? " + r3); //true

        //2.way
        boolean r4=t.isBlank();
        System.out.println("r4 = " + r4);

        //Example 3: Type code to join multiple Strings
        //           "Parkland"  -  "Miami"  -  "USA" ==> ParklandMiamiUSA


        String u1="Parkland";
        String u2="Miami";
        String u3="USA";

        //1.way:
        String result1= u1+u2+u3;
        System.out.println("result1 = " + result1);//ParklandMiamiUSA

        //2.way:
        String result2=u1.concat(u2).concat(u3);
        System.out.println("result2 = " + result2);




    }
}
