package com.ibsplc.demo;

import java.util.*;


public class ComparatorTest {


    public static void main(String args[]){
       List<Employee> employeeList=new ArrayList<>();
       employeeList.add(new Employee(12,"sameer",23));
        employeeList.add(new Employee(45,"akash",22));
        employeeList.add(new Employee(34,"parveen",25));
        employeeList.add(new Employee(90,"manas",34));
        employeeList.add(new Employee(78,"kartik",36));
       System.out.println("sort by ID");
        Comparator<Employee> empById= ((Employee e1,Employee e2)-> e1.getEmpId()-e2.getEmpId());
        employeeList.sort(empById);
        employeeList.forEach((employee)->System.out.println(employee));

        System.out.println("sort by age");

        employeeList.sort((Employee e1,Employee e2)-> e1.getAge()-e2.getAge());
        employeeList.forEach((employee)->System.out.println(employee));

        System.out.println("sort by name");
        employeeList.sort((Employee e1,Employee e2)-> e1.getName().compareTo(e2.getName()));
        employeeList.forEach((employee)->System.out.println(employee));

    }
    }
