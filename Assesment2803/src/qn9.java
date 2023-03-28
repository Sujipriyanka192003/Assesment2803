import java.util.*;
public class qn9 {
    public static void main(String args[]){

        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1,"one");
        hash_map.put(2,"two");
        hash_map.put(3,"three");
        hash_map.put(4,"four");
        hash_map.put(5,"five");

        // checking collection view of the map
        System.out.println("Collection view is: "+ hash_map.values());
    }
}