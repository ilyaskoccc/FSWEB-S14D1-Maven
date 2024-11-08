package com.workintech.developers;

public class HRManager extends Employee{
    private String[] JuniorDeveloper;
    private String[] MidDeveloper;
    private String[] SeniorDeveloper ;

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }
}
