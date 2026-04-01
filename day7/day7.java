// import calc.*;

public class day7
{

    public static void main(String args[])
    {
        System.out.println("Day 7 - Inheritence");
        
        // Inheritence is a concept of getting methods and properties from one class to another, known as super class and sub class repectively.

        // Calc calc = new Calc();
        // int r1 = calc.add(5, 5);
        // int r2 = calc.sub(10, 2);

        // System.out.println(r1 + " " + r2);  // 10 8

        // AdvCalc has methods of Calc along with it's own
        // AdvCalc advCalc = new AdvCalc();
        // int sub = advCalc.sub(5, 3);
        // int add = advCalc.add(5, 7);
        // int mul = advCalc.multi(2, 5);
        // int div = advCalc.div(10, 2);

        // System.out.println(add + " " + sub + " " + mul + " " + div);

        // This is inheritence in Java. 
        // When a class is extended and gets methods and properties of another class is known as inheritence as the class inherites from super class becoming a sub class.
        // To inherit, a keyowrd is used - "extends"

        //In java multi-level inheritence is allowed but multi-class inheritence is not allowed becuase of ambiguity.

        // When running java code which has inheritence used. Constructor of both super and sub class will be executed because in constructor method super() method always executes implicitely.
        // If paramiterized constructor needs to executed, we need to explicitely mention the super() along with arguments. like super(5);
        // this() methods executes constructor of the same class

        // AdvCalc advCalc = new AdvCalc();



        // Method overriding
        // In Java, using inheritence a sub class will always prefer it's own method if two methods are same in parent and child.
        // @override notation can be added after specifying access (public/private) of method

        // AnotherObj obj = new AnotherObj();
        // obj.show();  // In AnotherObj


        // Packages - A package is a namespace that organizes a set of related classes and interfaces. Concept of package is used to avoid name conflicts and to control access of classes, interfaces, etc. It also makes searching/locating and usage of classes, interfaces, etc easier.
        // Just like modules and import/export.

        // Sub sub1 = new Sub();
        // Add add1 = new Add();
        // Multi mul1 = new Multi();
        // Div div1 = new Div();

        // int sub = sub1.sub(7, 4);
        // int add = add1.add(4, 5);
        // int mul = mul1.multi(5, 5);
        // int div = div1.div(8, 4);

        // System.out.println(sub);
        // System.out.println(add);
        // System.out.println(mul);
        // System.out.println(div);

        // Packages are just used as import/export in moduler programming.


    }
}

// class AnObj
// {
//     public void show(){
//         System.out.println("In AnObj show");
//     }
// }

// class AnotherObj extends AnObj
// {
//     public void show(){
//         System.out.println("In AnotherObj");
//     }
// }

// A class with 2 methods : add and sub
// class Calc
// {

//     public Calc(){
//         super();
//         System.out.println("In Calc");
//     }

//     public Calc(int a){
//         super();
//         System.out.println("In Calc with " + a);
//     }

//     public int add(int a, int b)
//     {
//         return a + b;
//     }

//     public int sub(int a, int b)
//     {
//         return a - b;
//     }
// }


// // Derived class from Calc which has 4 methods, 2 from Calc class and 2 of it's own
// class AdvCalc extends Calc  // extend keyword adds another class properties and methods to current class
// {

//     public AdvCalc(){
//         this(5);
//         System.out.println("In AdvCalc");
//     }

//     public AdvCalc(int a){
//         super(a);
//         System.out.println("In AdvCalc with " + a);
//     }

//     public int multi(int a, int b)
//     {
//         return a * b;
//     }

//     public int div(int a, int b)
//     {
//         return a/b;
//     }
// }