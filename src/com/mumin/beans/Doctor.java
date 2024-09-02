package com.mumin.beans;

public class Doctor {

  private int id;
  private String name;
  private String department;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void displayInfo() {
    System.out.println("Id : " + id);
    System.out.println("Name : " + name);
    System.out.println("Department : " + department);
  }
}
