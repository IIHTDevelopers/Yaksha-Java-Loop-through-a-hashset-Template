package com.yaksha.assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOperations {

	public static void main(String[] args) {
		// **Creating a HashSet**
		Set<String> hashSet = new HashSet<>();

		// **Adding items to the HashSet using add()**
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		System.out.println("HashSet after adding items: " + hashSet);

		// **Checking if an item exists using contains()**
		boolean containsTwo = hashSet.contains("Two");
		System.out.println("HashSet contains 'Two': " + containsTwo);

		// **Removing an item using remove()**
		hashSet.remove("Three");
		System.out.println("HashSet after removing item 'Three': " + hashSet);

		// **Finding the size of the HashSet using size()**
		int size = hashSet.size();
		System.out.println("Size of HashSet: " + size);

		// **Looping through the HashSet using an iterator**
		System.out.println("Looping through the HashSet:");
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
