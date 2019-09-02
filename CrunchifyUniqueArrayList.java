package nadiatests;

import java.lang.reflect.Array;
import java.util.*;

 //select unique values in ascending order

public class CrunchifyUniqueArrayList {

    public static void main(String[] args) {
        List<String> initialList = Arrays.asList("eBay", "paypal", "google", "eBay", "google", "paypal", "Amazon");
        System.out.printf("\nInitial list: %s", initialList);
        sortList(initialList);
    }

    public static void sortList (List<String> myList){
        //1 - get unique values
        Set<String> set = new HashSet<String>(myList);
        System.out.printf("\n1 - Unique values using HashSet - not sorted: %s%n", set);
        // GOOD
        //2 - tree removes duplicates and sorts the values
        System.out.printf("\nmyList: %s", myList);
        Set<String> treeSet = new TreeSet<String>(myList);  //GOOD
        System.out.printf("\n2 - Unique values using TreeSet - Sorted: %s\n", treeSet);
        //convert set to array
        List<String> myArray = new ArrayList<String>(treeSet); //GOOD
        System.out.println("3 - sorted treeSet converted to ArrayList: "+myArray);
    }
}


