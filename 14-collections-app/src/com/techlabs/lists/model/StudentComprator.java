package com.techlabs.lists.model;

import java.util.Comparator;

public class StudentComprator {
	
	public static class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getName().compareTo(student2.getName());
		}

	}
	
	public static class StudentRollNumberComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {

	       return student1.getRollNumber()-student2.getRollNumber();
		}

	}

}
