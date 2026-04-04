public class Day9
{

    public static void main(String args[])
    {

        // System.out.println("Day 9 - Inner class");

        // 1. Inner class - Basically a class inside a class. Here is how to access that

        // Outer obj = new Outer();
        // obj.show();

        // Outer.Inner obj1 = obj.new Inner();
        // obj1.show();

        // If static
        // Outer.Inner obj1 = new Outer.Inner();
        // obj1.show();




        // 2. Anonymous Inner class - Inner class with no name or specially written code inside class but during obj creation

        // Just a Normal obj from class
        // Anonymous obj1 = new Anonymous();
        // obj1.show();     // Inside Anonymous 

        // // Method overrided using Anonymous IC
        // Anonymous obj = new Anonymous(){

        //     // This is Anonymous Inner Class
        //     @Override
        //     public void show(){
        //         System.out.println("Inside obj");
        //     }
        // };

        // obj.show();     // Inside obj




        // 3. Abstract Class - Class which cannot be instantiated directly and must be extended (Inherited) by other classes. 
        // Used to provide a common base with shared behavior

        // Animal obj = new Dog();
        // obj.speak();
        // obj.sleep();




        // 4. Interfaces - These are basically like Schemas. Whenever a class implements a interface, it must use all methods of that interface or else it will give errors

        // A obj = new B();
        // obj.show();
        // obj.config();

        System.out.println("Day 9 - Types of classes & interface");

    }
}

// Interface
// interface A
// {
//     void show();
//     void config();
// }

// class B implements  A
// {
//     public void show(){
//         System.out.println("Inside B with Interface A");
//     }

//     public void config(){
//         System.out.println("Config file...");
//     }
// }


// Abstract class
// abstract class Animal
// {
//     abstract void speak();  // abstract method (Method without body which is to be declared later)

//     void sleep(){
//         System.out.println("Sleeping....");
//     }
// }

// class Dog extends Animal
// {
//     void speak(){
//         System.out.println("Dog is barking....");
//     }
// }


// class Anonymous
// {

//     public void show(){
//         System.out.println("Inside Anonymous");
//     }
// }

// class Outer
// {
//     public void show(){
//         System.out.println("Inside Outer");
//     }

//     class Inner
//     {
//         public void show(){
//             System.out.println("Inside Inner");
//         }
//     }
// }