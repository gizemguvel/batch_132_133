package practice0902.encapsulation;

import java.text.DecimalFormat;

public class BMI {

    private double weight;
    private double height;
    BMI(double weight,double height){

       this.weight=weight;
        this.height=height;

    }

    public void calculateBMI(){

        double bmi=weight/(height*height);
        DecimalFormat decimalformat= new DecimalFormat(".00");
        System.out.println("BMI:"+decimalformat.format(bmi));

        if (bmi<18.5){
            System.out.println("underweight");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("normal weight");

        } else if (bmi>=25 && bmi<30) {
            System.out.println("overweight");

        } else if (bmi>=30) {
            System.out.println("obese");

        }

    }
}
