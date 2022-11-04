package com.cybage.insurance;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Nayan", "Rushi", "Ajay", "Poonam", "Sejal");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
