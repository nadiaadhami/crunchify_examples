package nadiatests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** http://crunchify.com/how-to-generate-random-number-in-java-with-some-variations/
 *  1  - generate random numbers
 *  2 - pick a number from a list at random */

public class CrunchifyRandomNumber {

	// Simple test which prints random number between min and max number (Number Range Example)
	public void RandomTest1() throws InterruptedException {
        int i = 0;
		while (i++<5) {
			int min = 5;
			int max = 15;

			float randomNumber = (min + (float) (Math.random() * ((max - min))));
			System.out.println("Test1: " + randomNumber);
			Thread.sleep(400);
		}
	}

	// Simple test which prints random entry from list below
	public void RandomTest2() throws InterruptedException {
		List<String> list = new ArrayList<String>();
		list.add("eBay");
		list.add("Paypal");
		list.add("Google");
        list.add("Amazon");

		Random randomNumber = new Random();
		String randomEle;
		int listSize = list.size();
        int i=0;
		while (i++<5) {
			randomEle = list.get(randomNumber.nextInt(listSize));    //listSize is the same as max-min
			System.out.println("Test2: " + randomEle);
			Thread.sleep(800);
		}
	}

	static public void main(String[] args) {

		// Let's run both Test1 and Test2 methods in parallel..
		Thread thread1 = new Thread() {
			public void run() {
				CrunchifyRandomNumber cr = new CrunchifyRandomNumber();
				try {
					cr.RandomTest1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				CrunchifyRandomNumber cr = new CrunchifyRandomNumber();
				try {
					cr.RandomTest2();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		thread1.start();
		thread2.start();
	}
}