package day27enumsexceptions;

public class E02 {
    public static void main(String[] args) {

        String[] a = {"Tom", "Mark", "Ajda", "Cuneyt"};
        System.out.println(getElement(a, 2));
        System.out.println(getElement(a, 5));//ArrayIndexOutOfBoundsException
                                                 //When you use non-existing index in an array, Java throws exception

        String s= "Java is love";
        System.out.println(getCharFromString(s,2));
        System.out.println(getCharFromString(s,12));//StringIndexOutOfBoundsException ==>String index out of range: 12
                                                        //If you use non-existing index in a String Java throws exception

    }

    //Example 1: Create a method to get any element from a String array
    public static String getElement(String[] a, int idx) {
        try {
            return a[idx];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not use values less than 0 or greater than the length-1");
            return "";
        }

    }

    //Example 2: create a method to get a character from a String
    public static char getCharFromString(String s, int idx){
        try {
            return s.charAt(idx);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Do not use values less than 0 or greater than the length()-1");
            return ' ';
        }
    }



}
