package day18varargsstringbuilderstringbuffer;

public class StringBuilder02 {
    public static void main(String[] args) {

        //Another way to create a String Builder
        StringBuilder sb1=new StringBuilder();
        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxx");
        sb1.append("mmmmmmmmmmmmmmmmmm");

        //length() gives ypu the number of characters
        int length= sb1.length();
        System.out.println(length);//35


        int capacity=sb1.capacity();
        System.out.println(capacity);//34 <== 16*2+2

        //Another way to create a String Builder
        StringBuilder sb2=new StringBuilder(2);
        sb2.append("FL").append("!");

        int l= sb2.length();
        System.out.println(l);//3

        int c=sb2.capacity();
        System.out.println(c);//6

        sb2.append("!");

        int l2=sb2.length();
        System.out.println(l2);//3

        int c2=sb2.capacity();
        System.out.println(c2);//6

        //Create a String by using StringBuffer Class

        StringBuffer sbf =new StringBuffer();
        sbf.append("Wooow!");

        int l3= sbf.length();
        System.out.println(l3);//6

        int c3=sbf.capacity();
        System.out.println(c3);//16
    }
}
