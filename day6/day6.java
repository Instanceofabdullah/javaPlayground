public class day6
{

    public static void main(String args[])
    {
        // System.out.println("Day 6 - this* keyword, constructor and more");

        // Human h1 = new Human(18, "Zayn");
        // // h1.setName("Ali");
        // System.out.println("Your name is " + h1.getName() + " and you are " + h1.getAge() + " years old.");

        // 1. this* keyword - refers to current object and is used to differentiate instance variable from parameters.

        // 2. Constructor - Special method called when object is created. It should be same as it's class. This method does not return anything.

        // 3. Static - "Belongs to class, not to objects."
        // Static variables are shared across all objects. Only one copy exists and that is shared among all objects.
        // Static methods are methods which can only use static variables and other static methods. These are also shared across all objects.
        // Static block that run once when class loads.
        // Usecase : DB connection, load configuration, etc.

        System.out.println("Day 6 - this, contructor and static keyword");



    }
}

// class Human 
// {
//     private String name;
//     private int age;
//     private static String country;

//     //static - which remians same for all objs created from a class
    

//     // Constructor which runs at the time of obj intiatkization
//     public Human(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public void setName(String name){
//         // this* keyword - keyword which reflects to the called object
//         this.name = name;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getAge(){
//         return age;
//     }
// }