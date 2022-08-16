package com.company;

public class Worker extends Employee{

    private String kind_of_job;

    public Worker(){}
    public Worker(String name, String id, String date_of_birth, String phone, String city, String StreetName, double salary, String job_title, String kind_of_job){
        super( name,id,date_of_birth, phone, city,StreetName, job_title, salary);
       this.kind_of_job=kind_of_job;

    }

    public String getKind_of_job() {
        return kind_of_job;
    }

    public void setKind_of_job(String kind_of_job) {
        this.kind_of_job = kind_of_job;
    }

    @Override
    public String toString() {

        return "kind_of_job= " +getKind_of_job();

    }

    @Override
    public void add() {
            Worker s = new Worker();
            s.add = new Address();
            System.out.println("Enter your Name: ");
            s.name = sc.nextLine();
            System.out.println("Enter your ID: ");
            s.id = sc.nextLine();
            System.out.println("Enter your Phone: ");
            s.add.phone = sc.nextLine();
            System.out.println("Enter your Date Of Birth: ");
            s.date_of_birth = sc.nextLine();
            System.out.println("Enter your City: ");
            s.add.city = sc.nextLine();
            System.out.println("Enter your Street Name: ");
            s.add.StreetName = sc.nextLine();
            System.out.println("Enter your Job title: ");
            s.setJob_title(sc.nextLine());
            System.out.println("Enter your Kind of Job (Full-time Or Part-time): ");
            s.setKind_of_job(sc.nextLine());
            System.out.println("Enter your Salary: ");
            s.setSalary(sc.nextInt());
            sc.nextLine();
            System.out.println("Your Data is added");
            a.add(s);
        }


   int c=0;
    @Override
    public void edit() {
        boolean f=false;
        System.out.println("Enter your ID: ");
             String x = sc.nextLine();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) instanceof Worker) {
                Worker e = (Worker) a.get(i);
                if (e.id.equals(x)) {
                    System.out.println("Enter your Name: ");
                    e.name = sc.nextLine();
                    System.out.println("Enter your ID: ");
                    e.id = sc.nextLine();
                    System.out.println("Enter your Phone: ");
                    e.add.phone = sc.nextLine();
                    System.out.println("Enter your Date Of Birth: ");
                    e.date_of_birth = sc.nextLine();
                    System.out.println("Enter your City: ");
                    e.add.city = sc.nextLine();
                    System.out.println("Enter your Street Name: ");
                    e.add.StreetName = sc.nextLine();
                    System.out.println("Enter your Job title: ");
                    e.setJob_title(sc.nextLine());
                    System.out.println("Enter your Kind of Job (Full-time Or Part-time): ");
                    e.setKind_of_job(sc.nextLine());
                    System.out.println("Enter your Salary: ");
                    e.setSalary(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Your Data is Updated");
                    System.out.println();
                    f = true;
                    c = i;
                }
            }
            if(f)break;
        }
        if(f) {
            for (int j = 0; j < a.size(); j++) {
                if(j==c) {
                    a.get(j).display();
                    break;
                }

            }
        }
        else  System.out.println("This ID is not exist");

    }

    @Override
    public void delete() {
        System.out.println("Enter your ID: ");
        String x=sc.nextLine();
        for(int i=0;i<a.size();i++){
            if(a.get(i).id.equals(x)){
                a.remove(a.get(i));
                System.out.println("Your Data is removed");
                return;
            }

        }
        System.out.println("This ID is not exist");
    }


    @Override
    public void display() {
        System.out.println("name= "+name);
        System.out.println("date_of_birth= "+date_of_birth);
        System.out.println("phone= "+add.phone);
        System.out.println("id= "+id);
        System.out.println("city= "+add.city);
        System.out.println("StreetName= "+add.StreetName);
        System.out.println("Job_title= "+getJob_title());
        System.out.println("salary= "+getSalary());
        System.out.println(toString());
    }

    @Override
    public void search() {
        System.out.println("Enter your ID: ");
        String x=sc.nextLine();
        for(int i=0;i<a.size();i++){
            if(a.get(i).id.equals(x)){
                System.out.println("The results of search");
                a.get(i).display();
                return;
            }
        }
        System.out.println("your search did not match any ID");
    }

    @Override
    public void show() {
        boolean f = false;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof Worker) {
                Worker p = (Worker) a.get(i);
                a.get(i).display();
                System.out.println();
                f = true;

            }


        }
        if (!f)
            System.out.println("There is no Data about Workers");


    }

    }


