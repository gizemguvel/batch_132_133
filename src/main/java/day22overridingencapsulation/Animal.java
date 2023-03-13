package day22overridingencapsulation;

public class Animal {

    /*
        1)Sometimes using method directly from parent class may not be enough for us.
          We may need the method to specify.
          When we need the method to specify, we change the method body.
          This is called "Method Overriding"
         2)We cannot touch method signature in "Method Overriding"
           Do not touch Method Name and Method Parameters in Method Overriding
         3)The method in child class(Overriding Method) can use "same" or "wider" access modifier than the method in parent class(Overridden Method)
         4)When you change the return type in method overriding, from child to parent you must have "IS-A" relationship.
         5)Return type of the overridden method can be the "top return type" of the overriding method
         6)If there is "IS-A" relationship between return types, those called "Covariant Return Types"
         7)Between the wrapper classes there is no parent-child relationship thats why you cannot have "IS-A" relationship
           If you do not have "IS-A" relationship you cannot change return types in method overriding
         8)Between the primitive data types there is no parent-child relationship thats why you cannot have "IS-A" relationship
           If you do not have "IS-A" relationship you cannot change return types in method overriding
         9)If the return type is void you cannot change it in method overriding
         10)Private methods in parent class cannot be overridden
         11)Static methods cannot be overridden

          "final" keyword in Java:
          1)can be used for variables
            If you use final keyword for variables i)You have to initialize the variable  ii)After assigning a value you cannot update it
          2)can be used for classes
            If you use final keyword for a class, the class cannot have child class
          3)can be used for methods
            If you use final keyword for methods, the method cannot be overridden
            The body of a "final method" cannot be updated, so it cannot be overridden because in overriding we update the method body

         12)Polymorphism= Method Overloading + Method Overriding
         What is the difference between "Method Overloading" and "Method Overriding"?
           i)"Method Overriding" needs "inheritance" but "Method Overloading" occurs in a single class we do not need "inheritance".
           ii)"private" methods cannot be overridden, but can be overloaded
           iii)we do not touch "method signature" in "Method Overriding" but we change parameters in "Method Overloading"
           iv)We cannot override static methods, but we can overload them
           v)other name of "Method Overloading" is "Static Polymorphism"
             other name of "Method Overriding" is "Dynamic Polymorphism"
           vi)other name of "Method Overloading" is "Compile Time Polymorphism"
             other name of "Method Overriding" is "Run Time Polymorphism"



      */

    public void eat(){ //Overridden method
        System.out.println("Animals eat...");
    }

    public Animal create(){
       return new Animal();
    }

    public Integer number(){
        return 123;
    }

    public int num(){
        return 12;
    }


}
