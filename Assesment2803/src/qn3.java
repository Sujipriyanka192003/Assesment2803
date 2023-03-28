import java.util.*;
public class qn3 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> c1 = new LinkedList <String> ();
        c1.add("one");
        c1.add("two");
        c1.add("three");
        c1.add("four");
        c1.add("five");
        System.out.println("Original linked list: " + c1);

        // Checks whether the color "Green" exists or not.
        if (c1.contains("Green")) {
            System.out.println("number one is present in the linked list.");
        } else {
            System.out.println("number two is not present in the linked list.");
        }

        // Checks whether the color "Orange" exists or not.
        if (c1.contains("Orange")) {
            System.out.println("Color eleven is present in the linked list.");
        } else {
            System.out.println("Color eleven is not present in the linked list.");
        }

    }
}