// class Car
// {
//     int model;
//     String name;
//     String brand;
// }

public class day5
{

    public static void main(String args[])
    {
        // System.out.println("Day 5 - More on Arrays");

        // Working with classes and arrays
        // Car car1 = new Car();
        // car1.model = 2019;
        // car1.name = "Swift Dzire";
        // car1.brand = "Maruti";

        // Car car2 = new Car();
        // car2.model = 2026;
        // car2.name = "Nexon";
        // car2.brand = "Tata";

        // Car car3 = new Car();
        // car3.model = 2023;
        // car3.name = "Thar";
        // car3.brand = "Mahindra";

        // Car car4 = new Car();
        // car4.model = 2018;
        // car4.name = "Polo";
        // car4.brand = "Volkswagen";

        // Car cars[] = new Car[4];

        // cars[0] = car1;
        // cars[1] = car2;
        // cars[2] = car3;
        // cars[3] = car4;

        // for(Car car : cars){
        //     System.out.println(car.brand + " " + car.name + " " + car.model);
        // }


        // Strings (Objects)

        // String name = "Abdullah";
        // int hashBefore = name.hashCode();
        // name = name + " The Programmer";
        // int hashAfter = name.hashCode();
        // System.out.println(name);
        // here, it looks like name has been updated but inside
        // heap memory another instane is created and reference value
        // is assigned to name.
        // System.out.println(hashBefore == hashAfter);  // false
        // false because both are different and resides at different locations.
        // Older string goes to garbage collection

        // String s1 = "Java";
        // String s2 = "Java";

        // System.out.println(s1.hashCode() == s2.hashCode());
        // prints true! as s1 and s2 are just reference variable to
        // "Java" String which is inside heap memory.

        // So, Strings are just objects which resides in heap memory.

        // If two string are same than only 1 String object is 
        // created in heap.
        // No matter how much variable has same string, those
        // variable will only has reference value of that 1 string.

        // In java, there are 2 types of String : 
        // 1. Immutable 
        // 2. Mutable

        // We know that strings are immutable in Java, but there is way to create
        // mutable strings.

        // Mutable strings can be created by : 
        // 1. String buffer
        // 2. String builder
    

        // 1. String Buffer

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());  // when empty, 16 bytes
        // sb.append("This text is 16 bytes long");
        // System.out.println(sb);
        // System.out.println(sb.capacity());  // when empty, 16 bytes
        // System.out.println(sb.length());

        // Both string buffer and builder allow mutation of string with many methods
        // String builder is similar to string buffer with only one big difference
        // String buffer is thread safe while String builder is not



        // OOPS (Object-Oriented Programming)
        // Learned about Class, Objects now Encapuslation!

        // Encapsulation
        // Setting up private variable in classes which can only be used and interacted 
        // by using it's own methods and can't be used directly.

        // Human h1 = new Human();
        // h1.setName("Ali");
        // h1.setAge(17);

        // Human h2 = new Human();
        // h2.setName("Abdullah");
        // h2.setAge(21);

        // int age1 = h1.getAge();
        // String name1 = h1.getName();

        // int age2 = h2.getAge();
        // String name2 = h2.getName();

        // System.out.println(name1 + " is " + age1 + " years old.");
        // System.out.println(name2 + " is " + age2 + " years old.");



        // Practice Questions

        // 1. Student class with getters setter 
        // Student s1 = new Student();
        // s1.setName("Abhinav");
        // s1.setMarks(89);
        
        // Student s2 = new Student();
        // s2.setName("Aaron");
        // s2.setMarks(86);

        // Student s3 = new Student();
        // s3.setName("Abbas");
        // s3.setMarks(92);

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for(Student s : students){
        //     System.out.println(s.getName() + " : " + s.getMarks());
        // }


        // 2. class Book, prints only if book price > 500
        // Book b1 = new Book();
        // b1.setPrice(599);
        // b1.setTitle("Kale and Kate");
        // b1.setAuthor("K. Dustin");

        // Book b2 = new Book();
        // b2.setPrice(299);
        // b2.setTitle("Life of a Lion");
        // b2.setAuthor("Dr. Hamilton");

        // Book b3 = new Book();
        // b3.setPrice(399);
        // b3.setTitle("Tale of Havards");
        // b3.setAuthor("Prof. Joe");

        // Book b4 = new Book();
        // b4.setPrice(899);
        // b4.setTitle("Java and Backend");
        // b4.setAuthor("Mark Rust");

        // Book books[] = new Book[4];
        // books[0] = b1;
        // books[1] = b2;
        // books[2] = b3;
        // books[3] = b4;

        // for(Book b : books){
        //     if(b.getPrice() > 500){
        //         System.out.println(b.getTitle() + " by " + b.getAuthor());
        //     }
        // }


        // 3. String with StringBuilder, appending and reversing it.
        // StringBuilder s = new StringBuilder("A white cat");
        // // Appending
        // s.append(", sat on a mat.");
        // System.out.println(s);

        // // Reversing
        // s.reverse();
        // System.out.println(s);

        




    }
}

// PQ 2nd
// class Book 
// {
//     private String title;
//     private String author;
//     private int price;

//     public void setTitle(String t){
//         title = t;
//     }

//     public void setAuthor(String a){
//         author = a;
//     }

//     public void setPrice(int p){
//         price = p;
//     }

//     public String getTitle(){
//         return title;
//     }

//     public String getAuthor(){
//         return author;
//     }

//     public int getPrice(){
//         return price;
//     }


// }


// Practice question 1st 
// class Student 
// {
//     private int marks;
//     private String name;

//     public void setMarks(int m){
//         marks = m;
//     }

//     public void setName(String n){
//         name = n;
//     }

//     public int getMarks(){
//         return marks;
//     }

//     public String getName(){
//         return name;
//     }
    
// }

// class Human 
// {
//     // Here 2 variables are set private.
//     // Now, these can only be interacted by methods of that instance only.
//     private int age;
//     private String name;


//     // Methods are created to interact with private variables
//     // This way we are binding out data with methods.
//     public int getAge(){
//         return age;
//     }

//     public void setAge(int a){
//         age = a;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setName(String nm){
//         name = nm;
//     }
// }