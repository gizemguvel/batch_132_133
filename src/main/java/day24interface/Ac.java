package day24interface;

public interface Ac {

    public abstract void cool();

    void heat();//Even i didn't type public and abstract for the method it is public and abstract.

    //1)by using "default" keyword before "return type" of the method you can create "method with body" in an interface
    //2)when you create "bacteriaKiller default method", "Honda concrete child class" will not complain because
    //  overriding is mandatory for abstract methods
    //3)"default" in bacteriaKiller method is not access modifier, it is a new keyword to create method with body in an interface
     default void bacteriaKiller(){
        System.out.println("Ac's kill the bacteria %99.9...");

    }

    //If you need a "method with body" and access to it just by using the interface name use "static" keyword.
    static void climate(){
        System.out.println("Climate settings are working...");
    }

    void run();

     //variables are "final" in an interface as default, when you create a variable you have to initialize
     //variables are "public" in an interface as default, when you create a variable no need to declare as "public"
     //variables are "static" in an interface as default, when you try to access to a variable no need to create an object,use just interface name
     int price=2000;

     //an interface may have public or default access modifier, you cannot use protected and private access modifiers



}
