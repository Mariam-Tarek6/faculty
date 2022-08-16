package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Person implements print  {

    protected String name;
    protected String id;   // National ID
    protected String date_of_birth;
    Address add;



    static Scanner sc=new Scanner(System.in);
  static ArrayList<Person> a =new ArrayList<>();
    public Person(){}
    public Person(String name,String id,String date_of_birth,String phone,String city,String StreetName){


        this.add.StreetName=StreetName;
        this.add.city= city;
        this.name=name;
        this.id=id;
        this.date_of_birth=date_of_birth;
        this.add.phone = phone;

    }


    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getDate_of_birth() {return date_of_birth;}

    public void setDate_of_birth(String date_of_birth) {this.date_of_birth = date_of_birth;}
    @Override
    public boolean equals(Object t){
        String n=((Person)t).getId();
      if(this.id.equals(n)){
          return true;
      }
      else
          return false;
    }

    public abstract void add();
    public abstract void edit();
    public abstract void delete();
    public abstract void display();
    public abstract void search();
    public abstract void show();

}
