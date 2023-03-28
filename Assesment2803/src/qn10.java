import java.util.*;
public class qn10 {
    public static void main(String args[]){

        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();

        hash_map.put(1,"one");
        hash_map.put(2,"two");
        hash_map.put(3,"three");
        hash_map.put(4,"four");
        hash_map.put(5,"five");

        // get keyset value from map
        Set keyset = hash_map.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);
    }
}
