package day18varargsstringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*
            1)String Builder is a class in Java and it is used to create Strings.
            2)Question: We have String class to create Strings, why did Java create String Builder Class to create strings?
                        String Class is "immutable" we sometimes need mutable Strings, thats why Java created String Builder Class.

            3)String Builder is not "thread-safe" and is not "synchronized"
            "Thread-safe" means being able to do multiple threads(task) at the same time
            "Synchronized" means being able to select appropriate order for multi-thread
            4)If you need a String to use in "multi-thread" use "String Buffer"
            "String Buffer" is a class in java, and it is used to create strings.
            It is "thread-safe" and it is "synchronized"

            "String Buffer" was created before "String Builder", it was created in Java 5

            To create String we have 3 options;
            i)String class: If you need "immutable string"
            ii)StringBuilder Class: If you need "mutable string" and do not need "multi-thread" and "synchronization"
            iii)StringBuffer Class: If you need "mutable string" and "multi-thread" and "synchronization"

            Note: StringBuilder is faster than StringBuffer
         */

        String s="Java";
        //String class is immutable, that's why when you do any update on "s", Java does not change the value in "s" container.
        //Java creates a new container for the updated value and puts the updated value in the new container
        String t= s.concat("!");

        s=s.concat("Wooow");
        System.out.println(s);//JavaWooow

        //Let us create a mutable string
        StringBuilder sb1= new StringBuilder("Java");
        System.out.println(sb1);

        //When I use any method to update a String Builder, original value will be updated
        sb1.append("!").append("...");
        System.out.println(sb1);


        sb1.insert(4, " is love");
        System.out.println(sb1);//Java is love!...

        sb1.insert(2, "Money",1,4);
        System.out.println(sb1);//Jaoneva is love!...

        sb1.replace(2,5,"1");
        System.out.println(sb1);//Ja1va is love!...

        sb1.deleteCharAt(2);
        System.out.println(sb1);//Java is love!...

        sb1.delete(8,12);
        System.out.println(sb1);//Java is !...

        //if "reverse a string" question is asked to you in an interview, dont forget to mention baout the reverse method
        //in String Builder class
        sb1.reverse();
        System.out.println(sb1);//...! si avaJ

        //toString() is for converting String Builder to string, but toString() does not change the structure of original
        //String Builder
        String newS=sb1.toString();
        System.out.println(newS);

        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Gava");

        //sb2.compareTo() compares sb2 with sb3 lexicographically.
        //If sb2 is before sb3 the result will be negative, if sb2 is after sb3 the result will be positive
        //the int value method returns displays the difference between the ASCII values
        int r=sb2.compareTo(sb3);
        System.out.println(r);//0





    }
}
