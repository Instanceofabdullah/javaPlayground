public class Day10
{

    public static void main(String args[])
    {
        // System.out.println("Day 10 - More on interfaces, Enumeration..");

        // 1. More on Interfaces 
        // An interface is a blueprint of a class. It contains Abstract methods & Constants. Just like what a class is for object, interface is just like that but for class. 
        // It supports multiple inheritence and abstraction

        // A obj = new Test();
        // obj.show();

        // B obj1 = new Test();
        // obj1.display();



        // Enum - Special data type used to define a fixed set of named constants

        // Code c1 = Code.Running;
        // System.out.println(c1);


        // Remember, All constants inside enum are objects
        // Laptops l1 = Laptops.LenovoLegion;
        // System.out.println("My personal favorite Laptop is " + l1 + " series");

        // // For printing all constants with loop
        // for(Laptops l : Laptops.values()){
        //     System.out.println(l + " : " + l.getPrice());
        // }


        

        System.out.println("Day 10 - More on interfaces, Enumeration..");




    }
}




// enum Laptops
// {
//     MacBook(2000), LenovoLegion(1500), AsusTuf(1000), XPS(1800);

//     private int price;

//     private Laptops(int price){
//         this.price = price;
//     }

//     public int getPrice(){
//         return price;
//     }
// }


// enum Sytntax
// enum Code 
// {
//     Running, Error, Compiling, Debugging
// }

// interface A {
//     void show();
// }

// interface B {
//     void display();
// }

// // Multiple Inheritence
// class Test implements A, B {

//     public void show(){
//         System.out.println("Show");
//     }

//     public void display(){
//         System.out.println("Display");
//     }

// }