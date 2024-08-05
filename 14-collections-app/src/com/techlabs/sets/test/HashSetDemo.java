package com.techlabs.sets.test;

import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

        TreeSet<String> set=new TreeSet<String>();
        set.add("Kaivalya");
        set.add("Mrunalini");
        set.add("Shivam");
        set.add("Chirag");
        set.add("Chirag");
        
        System.out.println(set);

	}

}
