package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	/**
	 * List:is an ordered collection,allows the duplicate values
	 * syn:interface <generic type> listname=new imp.class<generic>();
	 */
		List<String> Learners=new ArrayList<String>();
		List<String> Trainer=new ArrayList<String>();
		Trainer.add("Saranya");
		System.out.println(Trainer);
		//add the items in the list
		Learners.add("Gayathri");//index 0
		Learners.add("sundari");
		Learners.add("Arunkumar");
		Learners.add("Dilipkumar");
		System.out.println(Learners);
		Learners.add(2,"Ganesh");
		System.out.println(Learners);
		for (int i = 0; i < Learners.size(); i++) {
			System.out.println(Learners.get(i));
			
		}
		//find the size of the list
		int size = Learners.size();
		System.out.println(size);//size starts from 1
		System.out.println(Learners.get(size-1));
		//remove an item from list
		Learners.remove(2);
		System.out.println(Learners);
		boolean remove = Learners.remove("Arunkumar");
		System.out.println(remove);
		//clear the list
		/*
		 * Learners.clear(); System.out.println(Learners);
		 */
		//add all--->all the items into another list
		Trainer.addAll(Learners);
		System.out.println(Trainer);

	}

}
