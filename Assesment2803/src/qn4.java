import java.util.*;
public class qn4 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("one");
        h_set.add("two");
        h_set.add("three");
        h_set.add("four");
        System.out.println("Original hash set contains: " + h_set);
        //  clear() method removes all the elements from a hash set
        // and the set becomes empty.
        h_set.clear();

        // Display original hash set content again
        System.out.println("HashSet content: " + h_set);
    }
}
