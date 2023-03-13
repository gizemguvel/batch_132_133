package day19constructorsaccessmodifersstatic;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher();


        //1)If you are in a different package "default" values will be inaccessible
        //2)If you are in a different package and the class you created the object is not the "child class" "protected" variables
        //will be inaccessible
        //3)private things cannot be accessible from outside the class
        //4)public ones will be accessible from entire project

        //teacherName variable is public thats why we can access it from entire project
        System.out.println(myTeacher.teacherName);

        //phone variable is protected thats why we can access it from inside the package
        //phone variable and myTeacher object are in the same class
        System.out.println(myTeacher.phone);

        //salary variable is default thats why we can access it from inside the package
        System.out.println(myTeacher.salary);

        //In Teacher class, there is one more variable which is "ssn" but it is private
        //thats why we cannot access it from TeacherRunner class

        //Note: A class can be "public" or "default", do not use "private" and "protected" for the classes




    }
}
