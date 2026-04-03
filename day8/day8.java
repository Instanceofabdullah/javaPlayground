public class day8
{

    public static void main(String args[])
    {

        System.out.println("Day 8 - Access Modifiers, Polymorphism, final keyword and object class");

        // Access Modifiers
        // 1. private - same class
        // 2. public - anywhere
        // 3. default - same package (folder)
        // 4. protected - same package + subclass (including diff package)


        // Polymorphism - many behavior, it is the different ways an object, method or interface can behave depending on the context
        // It has two types : 
        // 1. Compile time (Early binding) :
        // Ex - Method overloading
        // 2. Run time (Late binding)
        // Ex - Method overriding

        // Dynamic method Dispatch (compile time polymorphism)

        // A obj = new A();
        // obj.show();

        // obj = new B();
        // obj.show();

        // obj = new C();
        // obj.show();

        // object creation from class happens at compile time, hence a part of polymorphism
        // but method overriding comes under runtime polymorphism?


        // final keyword - variable, method, class
        // It is used to make the values constant meaning, those values will never change

        // final variable :
        // final int n = 6;
        // n = 5;   // gives error

        // final class
        // stops inheritence completely

        // final method
        // stops method overriding

        // Wrapper classes

        // Abstract classes



    }
}

// class Abc
// {

//     public final void show(){
//         System.out.println("by Abdullah");
//     }
// }

// class Def extends Abc
// {

//     public void show(){     // gives error as super class method show() is final method
//         System.out.println("By John");
//     }
// }

// final class
// final class X
// {

//     public void show(){
//         System.out.println("In X");
//     }
// }

// class Y extends X   // gives error as inheritence is stopped because of final class
// {

// }

// class A
// {
//     public void show(){
//         System.out.println("In A");
//     }
// }

// class B extends A
// {
//     public void show(){
//         System.out.println("In B");
//     }
// }

// class C extends B
// {
//     public void show(){
//         System.out.println("In C");
//     }
// }