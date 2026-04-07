
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Day12 {

    public static void main(String[] args) {

        // System.out.println("Day 12 - Lambda Expressions, exception handling, input");


        // Lambda Expression (Adding ->)  - Only works with SAM
        // A obj = () -> System.out.println("Inside Lambda expression");
        // obj.show();
        // B obj1 = i -> System.out.println("Here is the number " + i);
        // obj1.show1(5);



        // Exceptions & Errors
        // 1. Compile time error
        // 2. Runtime Error -> Exception handling
        // 3. Logical Error


        // Exception handling
        // int i = 5;
        // try {
        //     i = i/0;
        //     System.err.println(i);
        // } catch (Exception j) {
        //     System.out.println("Something went wrong!");
        // }
        // // System.err.println(i/0);
        // System.err.println("Complete");
        // throw* keyword
        // int i = 0;
        // try {
        //     i = 15/i;
        //     if(i == 0){
        //         throw new ArithmeticException();
        //     }
        // } catch (Exception j) {
        //     System.out.println("Something went wrong!");
        //     System.out.println(j);
        // }



        // Custom Exception Handling
        // int j = 0;
        // int i = 0;
        // try {
        //     if(j == 0){
        //         throw new AliException("Kya kr rhe ho bhai, zero se divide kon krta h ");
        //     }
        //     i = 20/j;
        // } catch (AliException e) {
        //     System.err.println(e);
        // }


        // Getting input from user
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // try {
        //     int num = Integer.parseInt(bf.readLine());
        //     System.out.println(num);
        //     bf.close();
        // } catch (IOException e) {
        //     System.err.println(e);
        // }

        System.out.println("Day 12 - Lambda Expressions, exception handling, input");

    }
}

// class AliException extends Exception {

//     public AliException(String s) {
//         super(s);
//     }
// }

// @FunctionalInterface
// interface A {
//     void show();
// }
// @FunctionalInterface
// interface B {
//     void show1(int i);
// }
