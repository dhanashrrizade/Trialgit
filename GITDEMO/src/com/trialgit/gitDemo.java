package com.trialgit;
import java.util.ArrayList;

public class gitDemo {

	    public static void main(String[] args) {
	        // Declare and initialize an ArrayList of Strings
	        ArrayList<String> stringList = new ArrayList<>();

	        // Adding elements to the ArrayList
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Orange");
	        stringList.add("Grapes");

	        // Display the elements of the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (String fruit : stringList) {
	            System.out.println(fruit);
	        }
	    }
	}


