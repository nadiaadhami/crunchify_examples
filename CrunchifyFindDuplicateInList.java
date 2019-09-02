package nadiatests;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* find duplicates in a linked list */

public class CrunchifyFindDuplicateInList {
    static Set<String> set1 = new HashSet<String>();

    public static void main(String[] args) {
        // build our test data
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println("My List : " + list);
        System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
        System.out.println("\nHere are the unique elements from list : " + set1);

    }

    public static Set<String> findDuplicates(List<String> listContainingDuplicates) {

        final Set<String> duplicateSet = new HashSet<String>();

        // set.add() returns true if it does not exist, false if it already exists
        for (String yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                duplicateSet.add(yourInt);
            }
        }
        return duplicateSet;
    }
}