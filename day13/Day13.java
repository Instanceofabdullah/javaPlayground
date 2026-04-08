
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day13
{

    public static void main(String[] args) {
        
        // System.out.println("Day 13 - Newer way of taking input.");

        // BufferReader method was old, newer and better way of taking input from the user is using Scanner

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // try {
        //     int num = Integer.parseInt(bf.readLine());
        //     System.out.println("You entered : " + num);
        // } catch (IOException e) {
        //    System.err.println(e);
        // }    

        // // This was old and harder


        // // Scanner sc = new Scanner(System.in);
        // Scanner sc1 = new Scanner(System.in);
        // Scanner sc2 = new Scanner(System.in);

        // // integer values
        // System.out.print("Enter a number : ");
        // int num = sc1.nextInt();
        // System.out.println("You entered : " + num);

        // // String values
        // System.out.print("Enter some string: ");
        // String str = sc2.nextLine();
        // System.out.println("You wrote : " + str);


        // Basically object from Scanner class must be different for every input call

        // Collection is a framework that provides a set of class and interfaces to store and manipulate groups of objects efficiently, and is a part of Java collections Framework (JCF)

        // Collection represents a group of object(elements) treated as a single unit.
        // 1. It is an interface (java.util.Collection)
        // 2. It is the root interface of most collection classes

        // Collection (interface)
        // 1. List (interface)
        //    a. ArrayList
        //    b. LinkedList
        //    c. Vector
        //
        // 2. Set (interface)
        //    a. HashSet
        //    b. LinkedHashSet
        //    c. TreeSet
        // 3. Queue (interface)
        //    a. PriorityQueue
        //    b. Deque (ArrayDeque)

        // 1. List 
        // Ordered collection
        // Allows duplicates
        // Example : ArrayList

        // List<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Apple");   // Duplicates allowed

        // System.out.println(list);          // Get all
        // System.out.println(list.get(0));   // Get with index num

        System.out.println("Day 13 - Scanner class & inputs, Intro to collections ");
    }
}