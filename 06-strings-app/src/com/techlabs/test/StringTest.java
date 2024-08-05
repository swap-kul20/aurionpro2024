package com.techlabs.test;

public class StringTest {

	public static void main(String[] args) {

//               String name1="Devan";
//               String name2="Devan";
//               
//               System.out.println(name1.hashCode());
//               System.out.println(name2.hashCode());
//               
//               System.out.println(name1==name2);
//               
//               String name3=new String("Vinayak");
//               String name4=new String("Vinayak2");
//               
//               System.out.println(name3.hashCode());
//               System.out.println(name4.hashCode());
//               
//               System.out.println(name3==name4);
               
               
               StringBuffer name5=new StringBuffer("Sakshi");
               System.out.println(name5.hashCode());
               name5=name5.append("Thorbole");
               System.out.println(name5.hashCode());

	}

}
