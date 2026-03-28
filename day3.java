// Creating class
// class Calculator
// {
//     int var = 5;

//     public int add(int a, int b)
//     {
//         System.out.println(var);
//         int r = a + b;
//         return r;
//     }

// }

// class Market
// {
//     int mangoPrice = 10;

//     public String giveMeMango(int money)
//     {
//         System.out.println("Price of 1kg mango is $" + mangoPrice);
//         System.out.println("You gave $" + money);

//         if(money == 10){
//             return "Here is your 1kg Mango. Visit again!";
//         } else if (money > 10){
//             return ("Here is your mango and your change $" + (money - 10));
//         } else {
//             return ("Insufficient money! you are $" + (10 - money) + " short. 1kg mango is $10");
//         }
//     }
// }

// class MethodOverloading
// {

//     public int add(int a, int b){
//         return a + b;
//     }
//     public int add(int a, int b, int c){
//         return a + b + c;
//     }
//     public int add(int a, int b, int c, int d){
//         return a + b + c + d;
//     }
// }



public class day3
{

    public static void main(String args[])
    {
        // System.out.println("Day 3 - Loops");


        // while loop
        // int i = 1;
        // while(i < 6)
        // {            
        //     System.out.println("Hello " + i);
        //     i++;
        // }


        // do-while
        // int i = 0;
        // System.out.println("Value of i before do-while execution : " + i);
        // do { 
        //     System.out.println("Executed sucessfully!");
        //     i++;
        // } while (i > 5);

        // System.out.println("Value of i after do-while execution : " + i);


        // for loop
        // for(int i = 1; i < 6; i++){
        //     System.out.println("Hello " + i);
        // }


        // Objects

        // int a = 10; int b = 20;
        // // using class
        // Calculator calc = new Calculator();
        // int result = calc.add(a, b);
        // System.out.println(result);


        // Market fruitMart = new Market();
        // int money = 5;
        // String shopping = fruitMart.giveMeMango(money);
        // System.out.println(shopping);

        // Method overloading
        // MethodOverloading obj = new MethodOverloading();
        // int ans = obj.add(1, 2);
        // System.out.println(ans);


        // What happens when java codes executes ?
        // Talking in terms of memory

        // Stack - A kind of storage with LIFO (Last in, First out)
        // Heap - Also a kind of storage but with open space 
        // All objects are stored in heap memory with their reference variable stored in stack memory.
        // Heap, stack etc are created inside a computer's ram when program executes

    }
}