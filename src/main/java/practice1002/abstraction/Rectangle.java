package practice1002.abstraction;

public class Rectangle extends Area {


    @Override
    double calculateArea(double height, double length) {
        return height*length;
    }
}
