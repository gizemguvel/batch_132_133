package day07ifstatementternarystatement;

public class IfStatement01 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a given character is upper case or lower case or others

        char ch = 'm';

        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }else{
            System.out.println("others");
        }

        //Example 2: If a number is less than 300 or greater than 3000
        //           print "perfect number" on the console, otherwise
        //           print "regular number"

        int num = 1200;
         if(num<300 || num>3000){
             System.out.println("perfect number");
         }else{
             System.out.println("regular number");
         }

         //Example 3: Type code to check if a number is "Even" or "Odd"
        int n= 8;

         if (n%2==0){
             System.out.println("even");
         }else{
             System.out.println("odd");
         }

         //Example 4: Type code to print the number of month for the given month name
         //
        String monthName= "may";

         if(monthName.equals("January")){
             System.out.println(1);
         }else if (monthName.equalsIgnoreCase("February")){
             System.out.println(2);
         }else if (monthName.equalsIgnoreCase("March")){
             System.out.println(3);
         }else if (monthName.equalsIgnoreCase("April")){
             System.out.println(4);
         }else if (monthName.equalsIgnoreCase("May")){
             System.out.println(5);
         }else if (monthName.equalsIgnoreCase("June")){
             System.out.println(6);
         }else if (monthName.equalsIgnoreCase("July")){
             System.out.println(7);
         }else if (monthName.equalsIgnoreCase("August")){
             System.out.println(8);
         }else if (monthName.equalsIgnoreCase("September")){
             System.out.println(9);
         }else if (monthName.equalsIgnoreCase("October")){
             System.out.println(10);
         }else if (monthName.equalsIgnoreCase("November")){
             System.out.println(11);
         }else if (monthName.equalsIgnoreCase("December")){
             System.out.println(12);
         }else{
             System.out.println("invalid month name");
         }






    }
}
