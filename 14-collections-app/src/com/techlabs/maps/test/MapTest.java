package com.techlabs.maps.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

          TreeMap<Integer,String> map=new TreeMap<Integer, String>();
          
          map.put(5, "chiarag");
          map.put(4, "Shirish");
          map.put(7, "Vinayak");
          
          
          System.out.println(map);
          
          Set<Entry<Integer,String>> entries=map.entrySet();
          
          for(Entry<Integer,String> entry:entries)
          {
        	  System.out.println(entry.getKey()+"-"+entry.getValue());
          }

	}

}
