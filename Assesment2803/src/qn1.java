import java.util.*;

public class qn1 {
    public static void main(String args[])
    {

        // Get the ArrayList1
        ArrayList<String>
                list1 = new ArrayList<String>();

        // Populate the ArrayList
        list1.add("Add");
        list1.add("and");
        list1.add("Multiply");

        // Print the ArrayList 1
        System.out.println("ArrayList 1: "
                + list1);

        // Get the ArrayList2
        ArrayList<String>
                list2 = new ArrayList<String>();

        list2.add("Addandmultiply");
        list2.add("Addandsubtract");

        // Print the ArrayList 2
        System.out.println("ArrayList 2: "
                + list2);

        // Join the ArrayLists
        // using Collection.addAll() method
        list1.addAll(list2);

        // Print the joined ArrayList
        System.out.println("Joined ArrayLists: "
                + list1);
    }
}