import java.util.*;

public class qn2 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> c1 = new LinkedList <String> ();
        c1.add("one");
        c1.add("two");
        c1.add("three");
        c1.add("four");
        c1.add("five");
        System.out.println("Original linked list: " + c1);
        // Retrieve but does not remove, the first element of a linked list
        String x = c1.peekFirst();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + c1);
    }
}