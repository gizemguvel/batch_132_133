package mentoringgrouppractice;

public class Q10 {
    public static void main(String[] args) {


        //Example 1: Delete all "y"s from a given String
        String s= "Everything is easy if you study";

       String newS=s.replace("y","");
        System.out.println(newS);//Everthing is eas if ou stud

        //Example 2: Delete all digits(0,1,2,3,4,5,6,7,8,9) from a given String
        // [0-9] ==>regular expression in java

        String t = "Tom is 13  years old, and his GPA is 3.98";

        String newT=t.replaceAll("[0-9]","");
        System.out.println(newT);//Tom is   years old, and his GPA is .

        String updatedT=t.replaceAll("[^0-9]","");
        System.out.println(updatedT);//13398

        //Example 3: Count how many letters are there in a String

        int countLetter=t.replaceAll("[^a-zA-Z]","").length();
        System.out.println(countLetter);

        //Example 4: Count how many digits are there in a String
        int countDigits=t.replaceAll("[^0-9]","").length();
        System.out.println("countDigits = " + countDigits);


    }
}
