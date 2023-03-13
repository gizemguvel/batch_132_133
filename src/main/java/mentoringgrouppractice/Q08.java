package mentoringgrouppractice;

public class Q08 {
    public static void main(String[] args) {

        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print false on the console
        //            'Ali' should print true on the console

        String s ="   Husnu   ";
        System.out.println(s);


        String trimmedS = s.trim();
        System.out.println(trimmedS);//"Husnu"
        boolean checkTrimmed = trimmedS.equals(s);
        System.out.println(checkTrimmed);

        boolean checkTrimmedTrue = trimmedS.equals(trimmedS);
        System.out.println(checkTrimmedTrue);




    }
}
