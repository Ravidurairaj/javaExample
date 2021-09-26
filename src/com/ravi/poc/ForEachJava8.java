package com.ravi.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author ravidurairaj
 * This class is for understanding the ForEach function
 */
public class ForEachJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		forEachExample();
	}
	
	/**
	 * method to explore the ForEach function of collection
	 */
	private static void forEachExample() {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0;i<=10;i++) myList.add(i);
		
		
		myList.forEach(s -> System.out.println(s));
		
		myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("inside ananymous "+t);
			}
			
		});
			
	}

}
