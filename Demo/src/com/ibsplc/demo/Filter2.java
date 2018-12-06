package com.ibsplc.demo;


import java.util.*;

public class Filter2 {
    public static void main(String args[]){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(12,"sameer",23));
        employeeList.add(new Employee(45,"akash",22));
        employeeList.add(new Employee(34,"parveen",25));
        employeeList.add(new Employee(90,"manas",34));
        employeeList.add(new Employee(78,"kartik",36));

        Employee emp=employeeList.stream().filter(e->"sameer".equals(e.getName())).findAny().orElse(null);
        System.out.println(emp);
        System.out.println("---------------");
        Employee e=employeeList.stream().filter(s->"manas".equals(s.getName()) &&(20==s.getAge() || 90==s.getEmpId())).findAny().orElse(null);
        System.out.println(e);
    }
}
