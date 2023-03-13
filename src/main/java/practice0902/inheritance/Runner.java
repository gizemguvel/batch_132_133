package practice0902.inheritance;

public class Runner {

    public static void main(String[] args) {

        //Create a method that calculates the area of the circle (use inheritance for math operations)

        areaOfCircle(3);

    }

    public static void areaOfCircle(int radius) {
        Circle circle = new Circle();
        /*circle.numberOfPi;
        circle.findSquare(radius);
        circle.multiply(circle.numberOfPi,circle.findSquare(radius));*/
        System.out.println(circle.multiply(circle.numberOfPi, circle.findSquare(radius)));

    }

}
