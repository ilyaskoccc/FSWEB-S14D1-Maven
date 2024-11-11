package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private int salary;

    public Employee(long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void work() {
        System.out.println(getName() + " starts to working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
