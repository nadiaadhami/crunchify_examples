package nadiatests;

import java.util.LinkedList;
import java.util.List;

public class CrunchifyFindMiddleInLinkedList {
	/**
	 * @author Crunchify.com
	 */
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 110; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Middle Element of Linked List with size "+list.size()+" is: " + FindMiddle1(list));
	}

	private static String FindMiddle1(List<String> list) {
		int size = list.size();
		int middle = (size / 2);
		return list.get(middle).toString();
	}
}