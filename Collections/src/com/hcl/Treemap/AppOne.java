package com.hcl.Treemap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AppOne {
	static TreeMap<Integer, String> tree_map = new TreeMap<>(Collections.reverseOrder());
    static void insert()
    {
    
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");
  
        System.out.println("Elements successfully inserted in the TreeMap");
    }
    
   static   void search(int key)
    {
  
        System.out.println("Is key " + key + " present? "+ tree_map.containsKey(key));
    }
  
    static void search(String value)
    {
  
        System.out.println("Is value " + value +" present? " + tree_map.containsValue(value));
    }
  
    static void display()
    {
        System.out.println( "Displaying the TreeMap:");
  
        System.out.println("TreeMap: " + tree_map);
    }
    private static void descending1() {
    	 Set set = tree_map.entrySet();
         Iterator i = set.iterator();
   
         // Traverse map and print elements
         while (i.hasNext()) {
             Map.Entry me = (Map.Entry)i.next();
             System.out.print(me.getKey() + ": ");
             System.out.println(me.getValue());
         }
		
	}
    static void traverse()
    {
        System.out.println("Traversing the TreeMap:");
        for (Map.Entry<Integer, String> e : tree_map.entrySet())
            System.out.println(e.getKey() + " "+ e.getValue());
    }
  

	public static void main(String[] args) {
		

        insert();
        descending1();
        search(50);
  
        search("Geeks");
  
        display();

        traverse();

	}

	private static void descending() {
		// TODO Auto-generated method stub
		
	}

}
