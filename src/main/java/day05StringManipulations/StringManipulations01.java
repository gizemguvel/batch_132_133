package day05StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Type code to check if the seventh character of a given String is "a"
        String s= "Sheis a girl";
        boolean r1=s.charAt(6)=='a';
        System.out.println("r1 = " + r1);


        //1.way:
        boolean result1= s.charAt(6)=='a';
        System.out.println("result1: "+result1);

        //2.way
        boolean result2=s.startsWith("a",6);
        System.out.println(result2);

        //Example 2: Type code to check if a String is ending with "money" or not.

        String t="Learn Java earn money";

        //1.way; substring()
        boolean result3 =t.substring(t.length()-5).equals("money");
        System.out.println(result3);

        //2.way; endswith()

        boolean result4 =t.endsWith("money");
        System.out.println("result4 = " + result4);

        //Example 3: Type code to convert "money" to "dollar".

        String newT = t.replace("money","dollar");
        System.out.println("newT = " + newT);

        //Example 4: Type code to convert "a" to "*".
        String t2=t.replace("a","*");
        System.out.println("t2 = " + t2);//Le*rn J*v* e*rn money

        //Example 5: Type code to convert "earn" to "win".
        String t3= t.replace("earn","win");
        System.out.println("t3 = " + t3);//Lwin Java win money






    }

}
