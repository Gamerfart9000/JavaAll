package homewrk;

import java.util.ArrayList;

public class Hw10 {

	public static ArrayList<String> swapFirstLast(ArrayList<String> list) {
		String first = list.get(0);
		String last = list.get(list.size() - 1);

		list.set(0, last);
		list.set(list.size() - 1, first);

		return list;
	}

	public static void main(String[] args) {

	        ArrayList<String> list = new ArrayList<>();

	        list.add("hello");
	        list.add("world");

	        System.out.println("Before: " + list);

	        swapFirstLast(list);

	        System.out.println("After:  " + list);
	    }
}
