package com.ibsplc.demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by A-8677 on 12/4/2018.
 */
public class Test {
    public static void main(String args[]){
   
        System.out.print("hello");
   
         List<Integer> list=new ArrayList<>();
         list.add(10);
         list.add(90);
         list.add(13);
         list.add(8);
         list.add(89);
         list.add(80);
         list.add(12);
        Collections.sort(list);
         System.out.println(list);
        List<Integer> l=list.stream().sorted().collect(Collectors.toList());
        l.forEach(n->System.out.println(n));
       
        Map<String, Integer> items = new HashMap<>();
        	items.put("A", 10);
        	items.put("B", 20);
        	items.put("C", 30);
        	items.put("D", 40);
        	items.put("E", 50);
        	items.put("F", 60);
        	items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        	List<Integer> nt=new ArrayList<>(items.values()) ;
        	System.out.println(nt);

        	

    }   	
}
