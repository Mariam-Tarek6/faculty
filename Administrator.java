package com.company;

public class Administrator extends Employee {

    private String E_mail;
    private String password;


    public Administrator(){}
    public Administrator(String name, String id, String date_of_birth, String phone, String city, String StreetName, String job_title, double salary, String E_mail, String password){
        super( name,id,date_of_birth, phone, city,StreetName, job_title, salary);
        this.E_mail=E_mail;
        this.password=password;
    }




    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "E_mail= " +getE_mail()+"\n"+"password= "
                +getPassword();

    }

    @Override
    public void add() {
        Administrator s =new Administrator();
        s.add=new Address();
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
               s.add.StreetName=sc.nextLine();
        System.out.println("Enter your E-mail: ");
               s.setE_mail(sc.nextLine());
        System.out.println("Enter your Password: ");
               s.setPassword(sc.nextLine());
        System.out.println("Enter your Job title: ");
               s.setJob_title(sc.nextLine());
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
            if(a.get(i) instanceof Administrator){
           Administrator e =(Administrator) a.get(i);
            if (e.id .equals(x)) {
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
                System.out.println("Enter your E-mail: ");
                e.setE_mail(sc.nextLine());
                System.out.println("Enter your Password: ");
                e.setPassword(sc.nextLine());
                System.out.println("Enter your Job title: ");
                e.setJob_title(sc.nextLine());
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
        else System.out.println("This ID is not exist");

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
          boolean f=false;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof Administrator) {
               Administrator p = (Administrator) a.get(i);
                a.get(i).display();
                System.out.println();
                f=true;

            }

            }
        if(!f)
            System.out.println("There is no Data about Administrators");

        }

    }



