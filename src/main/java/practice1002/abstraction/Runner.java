package practice1002.abstraction;

public class Runner {

    //Type code to calculate area of rectangle and triangle.(Use abstraction)

    public static void main(String[] args) {

        Triangle triangle=new Triangle();
        triangle.calculateArea(5,4);
        System.out.println(triangle.calculateArea(5,4));

       // System.out.println(new Rectangle().calculateArea(5,6));//not recommended

        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.calculateArea(10,5));





    }






}
