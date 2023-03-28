import java.util.*;
public class qn5 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("one");
        h_set.add("two");
        h_set.add("three");
        h_set.add("four");

        HashSet<String>h_set2 = new HashSet<String>();
        h_set2.add("one");
        h_set2.add("two");
        h_set2.add("four");
        h_set2.add("five");
        //comparison output in hash set
        HashSet<String>result_set = new HashSet<String>();
        for (String element : h_set){
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }
    }
}