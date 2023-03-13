package mentoringgrouppractice;

public class Q04 {
    public static void main(String[] args) {

        //Example 1: Get the initial of a name which contains first name and last name
        //         Tom Hanks ==> TH

        String str = "Tom Hanks";


        char FirstInıtial = str.charAt(0);

        char SecondInitial = str.split(" ")[1].charAt(0);

        System.out.println("" + FirstInıtial + SecondInitial  );
    }
}
