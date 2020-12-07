package me.zbl.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private Long id;
  private String name;
  private String dept;
  private Integer salary;
  private List<Employee> subordinates;

  public Employee(String name, String dept, Integer salary) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
    this.subordinates = new ArrayList<>();
  }

  public void add(Employee employee){
    this.subordinates.add(employee);
  }

  public void remove(){}
}
