package com.techlabs.lists.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.lists.model.Student;
import com.techlabs.lists.model.StudentComprator;


public class StudentTest {

	public static void main(String[] args) {

            List<Student> students=new ArrayList<Student>();
            
            students.add(new Student(2,"Namrata", 80));
            students.add(new Student(4,"Neha", 75));
            students.add(new Student(1,"Sayali", 85));
            students.add(new Student(5,"Aagya", 90));
            
            System.out.println("Students Not Sorted:");
            for(Student student:students)
            	System.out.println(student);
            
            Collections.sort(students,new StudentComprator.StudentRollNumberComparator());
            
            System.out.println("Students Sorted Roll Number Wise:");
            for(Student student:students)
            	System.out.println(student);
            
 Collections.sort(students,new StudentComprator.StudentNameComparator());
            
            System.out.println("Students Sorted Name Wise:");
            for(Student student:students)
            	System.out.println(student);

	}

}
