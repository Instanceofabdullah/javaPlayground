
// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Deque;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;
// import java.util.Queue;
// import java.util.Set;
// import java.util.TreeSet;

public class Day14
{
    public static void main(String args[])
    {
        // System.out.println("Day 14 - More on Collections: Sets... ");

        // // Lists (Ordered, allows duplicates)
        // List<String> users = new ArrayList<>();
        // users.add("Aman");
        // users.add("Rohit");
        // users.add("Aman");

        // System.out.println("Lists : ");
        // System.out.println(users);
        // System.out.println(users.get(0));


        // // Sets (No duplicates)
        // Set<String> roles = new HashSet<>();
        // roles.add("ADMIN");
        // roles.add("USER");
        // roles.add("ADMIN");

        // System.out.println("\nSet: ");
        // System.out.println(roles);


        // // Map (Key-Value)
        // Map<String, String> respo = new HashMap<>();
        // respo.put("status ", " success");
        // respo.put("message ", " User created");

        // System.out.println("\nMap: ");
        // System.out.println(respo);
        // System.out.println(respo.get("status"));


        // // Queue (FIFO)
        // Queue<String> tasks = new LinkedList<>();
        // tasks.add("task1");
        // tasks.add("task2");

        // System.out.println("\nQueue: ");
        // System.out.println(tasks);
        // System.out.println("Removed: " + tasks.poll());


        // // Deque (Double-ended queue)
        // Deque<String> deque = new ArrayDeque<>();
        // deque.addFirst("first");
        // deque.addLast("last");

        // System.out.println("\nDeque: ");
        // System.out.println(deque);


        // // Stream (filter + transform)
        // List<String> names = List.of("Aman", "Rohit", "Ankit");

        // List<String> filtered = names.stream()
        //     .filter(name -> name.startsWith("A"))
        //     .toList();
        
        // System.out.println("\nStream: ");
        // System.out.println(filtered);




        // Set - A collection that contains no duplicate value.
        // HashSet - Set with no Sequence
        // Set<Integer> nums = new HashSet<>();
        // nums.add(28);
        // nums.add(31);
        // nums.add(18);
        // nums.add(234);

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }

        // TreeSet - Set with sorted items
        // Set<Integer> nums1 = new TreeSet<>();
        // nums1.add(24);
        // nums1.add(87);
        // nums1.add(20);
        // nums1.add(19);
        // nums1.add(85);

        // for(int n : nums1)
        // {
        //     System.out.println(n);
        // }


    }
}