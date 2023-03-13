package practices.practice03;

public class Q01 {
    public static void main(String[] args) {

        //Example 1: Type code to select the minimum one of two integers

        int a=35;
        int b=5;

        //1.way:
        if (a<b){
            System.out.println("a is minimum");
        }else{
            System.out.println("b is minimum");
        }

        //2.way
         int r1= a < b ? a : b;
        System.out.println("min value is: " +r1);


        //Example 2: Type code to calculate absolute value of an integer

        int c=-5;

        int r2=c<0 ? -1*c : c;
        System.out.println("absolute value is: " + r2);

        //Example 3: If two integers are positive return the multiplication
        //           Otherwise, give a message like "I do not how to multiply"

        int d=3;
        int e=4;

        Object r3=d>0 && e>0 ? d*e : "I do not know how to multiply";
        System.out.println("r3 = " + r3);

        //Example 4: Type a code to check if a number is positive or not

        int x=34;

        if (x>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }

        String r4= x>0 ? "positive" :"negative";
        System.out.println(r4);


        //Example: Type code to check if an integer has 3 digits or not

        int y= 988;

        int absY= Math.abs(y);

        String r5= absY>99 && absY<1000? "3 digits":"not 3 digits";
        System.out.println(r5);


    }
}
