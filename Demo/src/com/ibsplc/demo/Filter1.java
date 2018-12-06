package com.ibsplc.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Filter1 {
    public  static void main(String args[]){
      Stream.of("spring", "node", "java").filter(l->!"java".equals(l)).collect(Collectors.toList()).forEach(System.out::println);
System.out.println("---------------------------");
      List<String> list= Arrays.asList("spring", "node", "java");
     List<String> result= list.stream().filter(n->!"spring".equals(n)).collect(Collectors.toList());
      result.forEach(System.out::println);
    }
}
