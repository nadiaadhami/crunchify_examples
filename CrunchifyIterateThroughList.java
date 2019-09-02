package nadiatests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CrunchifyIterateThroughList {

	public static void main(String[] argv) {

		List<String> crunchifyList = new ArrayList<String>();
		crunchifyList.add("eBay");
		crunchifyList.add("Paypal");
		crunchifyList.add("Google");
		crunchifyList.add("Yahoo");

		// iterate via "for loop"
		System.out.println("==> For Loop Example.");
		for (int i = 0; i < crunchifyList.size(); i++) {
			System.out.println(crunchifyList.get(i));
		}
		// iterate via "New way to loop"
		System.out.println("\n==> Advance For Loop Example..");
		for (String temp : crunchifyList) {
			System.out.println(temp);
		}
		// iterate via "iterator loop"
		System.out.println("\n==> Iterator Example...");
		Iterator<String> iterator = crunchifyList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// iterate via "while loop"
		System.out.println("\n==> While Loop Example....");
		int i = 0;
		while (i < crunchifyList.size()) {
			System.out.println(crunchifyList.get(i));
			i++;
		}
        // Java8
		// collection stream() util: Returns a sequential Stream with this collection as its source
		System.out.println("\n==> collection stream() util....");
		crunchifyList.forEach((temp) -> {
			System.out.println(temp);
		});
	}
}