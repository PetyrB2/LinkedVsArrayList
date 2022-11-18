package nkedVsArrayLinkedvsArrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class LvsA {

	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println("Title: ArrayList vs LinkedList");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:\n\tHow do we use them and Why.");
		System.out.println("========================\n");
		System.out.println("");

		// LinkedList creation
		LinkedList<String> namesLinkedList = new LinkedList<>();

		ArrayList<String> namesArrayList = new ArrayList<>();

		// Add to LinkedList
		namesLinkedList.add("Isa");
		namesLinkedList.add("Bob");
		namesLinkedList.add("Bert");
		namesLinkedList.add("Chris");
		namesLinkedList.add("Peter");

		// Print LinkedList
		System.out.println("");
		System.out.println("LinkedList");
		System.out.println("-----------");
		System.out.println(namesLinkedList);

		// Print index 2 from LinkedList
		System.out.println("");
		System.out.println("We can print elements from the LinkedList");
		System.out.println("The 2nd item in the LinkedList is: " + (namesLinkedList.get(1)));
		System.out.println("");

		// Add to ArrayList
		System.out.println("");
		System.out.println("ArrayList");
		System.out.println("-----------");
		namesArrayList.add("Tsa");
		namesArrayList.add("Bob");
		namesArrayList.add("Bert");
		namesArrayList.add("Chris");
		namesArrayList.add("Peter");

		System.out.println(namesArrayList);

		// Print index 2 from LinkedList
		System.out.println("");
		System.out.println("We can print elements from the ArrayList the same way");
		System.out.println("The 2nd item in the LinkedList is: " + (namesArrayList.get(1)));


		System.out.println("");
		System.out.println("Adding to LinkedList");
		System.out.println("--------------------");

		// Add Jerry to the LinkedList
		System.out.println("Adding Jerry to LinkedList (this is faster)");
		System.out.println("");
		namesLinkedList.add(1, "Jerry");
		System.out.println(namesLinkedList);

		System.out.println("");
		System.out.println("Adding to ArrayList");
		System.out.println("-------------------");
		
		// Add Jerry to the ArrayList
		System.out.println("Adding Jerry to ArrayList (this is slower)");
		System.out.println("");
		namesArrayList.add(1, "Jerry");
		System.out.println(namesArrayList);
		System.out.println("");

		// Print index 2 from LinkedList
		System.out.println("");
		System.out.println("Printing from LinkedList");
		System.out.println("------------------------");
		System.out.println("");
		System.out.println("We can print elements from the LinkedList again");
		System.out.println("The 2nd item in the LinkedList is now: " + (namesArrayList.get(1)));
		System.out.println("");

		// Print index 2 from ArrayList
		System.out.println("");
		System.out.println("Printing from ArrayList");
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("And for the ArrayList the same...");
		System.out.println("The 2nd item in the ArrayList is now: " + (namesArrayList.get(1)));
		System.out.println("");
		System.out.println("==============================================");
		System.out.println("");
		// Conclusion
		System.out.println("In Conclusion:");
		System.out.println("--------------");
		System.out.println("ArrayLists are faster at reading");

		System.out.println("LInkedLists are faster at adding and deleting");

	}

}
