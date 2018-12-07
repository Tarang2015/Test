package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/4/2018.
 */
public class Employee {
   private Integer empId;
   private String name;
   private int age;
   private int sal;
   private int count;
   private String eamil;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(Integer empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
