package com.trialgit;
import java.util.ArrayList;

public class gitdemo2 {
	

	
	    public static void main(String[] args) {
	        // Declare and initialize an ArrayList of Integers
	        ArrayList<Integer> integerList = new ArrayList<>();

	        // Adding elements to the ArrayList
	        integerList.add(5);
	        integerList.add(10);
	        integerList.add(15);
	        integerList.add(20);

	        // Display the elements of the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (int number : integerList) {
	            System.out.println(number);
	        }
	    }
	}

}
