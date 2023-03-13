package practices.practice01;

public class Q01_Concatination {

    public static void main(String[] args) {
        //Initialize variable
        int age= 41;
        int ageCustomer=34;
        int weight= 85;

        //Print variables with label

        System.out.println("ageCustomer = " + ageCustomer);
        System.out.println("age = " + age);
        System.out.println("weight = " + weight);

        //Copy the variable's value

        int myAge= age;
        System.out.println("myAge = " + myAge);

        //Declare multiple variables in the same line
        int year= 2022, month= 12, day= 30;
        System.out.println("year = " + year);

        //Update a variable
        year=2023;
        System.out.println("year = " + year);

        //Declare a variable: x
        int x;

        //Initialize another variable:y
        int y=12;
        System.out.println("y= " + y);

        //Initialize variable z;
        int z= 10;

        //Initialize x by using z;
        x=z;

        //Update the variables
        y=20;
        System.out.println("y = " + y);


    }




}

