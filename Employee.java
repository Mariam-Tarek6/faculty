package com.company;

public class Employee extends Person {
    protected String job_title;
    protected double salary;
    public Employee(){}
    public Employee(String name,String id,String date_of_birth,String phone,String city,String StreetName,String job_title,double salary){
        super(name, id, date_of_birth, phone, city,StreetName);
        this.job_title=job_title;
        this.salary=salary;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void add() {}

    @Override
    public void edit() {}

    @Override
    public void delete() {}

    @Override
    public void display() {}

    @Override
    public void search() {}

    @Override
    public void show() {}
}
