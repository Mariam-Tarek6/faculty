package com.company;

public class Student extends Person {
    private double gpa;
    private int level;
    private String E_mail;
    private String password;

    public Student() {

    }

    public Student(String name, String id, String date_of_birth, String phone, String city, String StreetName, double gpa, int level, String E_mail, String password) {
        super(name, id, date_of_birth, phone, city, StreetName);
        this.gpa = gpa;
        this.E_mail = E_mail;
        this.level = level;
        this.password = password;
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
        return "gpa= " + getGpa() + "\n"
                + "level= " + getLevel() + "\n" + "E_mail= "
                + getE_mail() + "\n" + "password= "
                + getPassword();

    }

    @Override
    public void add() {
        Student s = new Student();
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
        System.out.println("Enter your GPA: ");
        s.setGpa(sc.nextDouble());
        System.out.println("Enter your Level: ");
        sc.nextLine();
        s.setLevel(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter your E-mail: ");
        s.setE_mail(sc.nextLine());
        System.out.println("Enter your Password: ");
        s.setPassword(sc.nextLine());
        System.out.println("Your Data is added");
        a.add(s);


    }

    int c = 0;

    @Override
    public void edit() {
        boolean f = false;
        System.out.println("Enter your ID: ");
        String x = sc.nextLine();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof Student) {
                Student p = (Student) a.get(i);
                if (p.id.equals(x)) {
                    System.out.println("Enter your Name: ");
                    p.name = sc.nextLine();
                    System.out.println("Enter your ID: ");
                    p.id = sc.nextLine();
                    System.out.println("Enter your Phone: ");
                    p.add.phone = sc.nextLine();
                    System.out.println("Enter your Date Of Birth: ");
                    p.date_of_birth = sc.nextLine();
                    System.out.println("Enter your City: ");
                    p.add.city = sc.nextLine();
                    System.out.println("Enter your Street Name: ");
                    p.add.StreetName = sc.nextLine();
                    System.out.println("Enter your GPA: ");
                    p.setGpa(sc.nextDouble());
                    System.out.println("Enter your Level: ");
                    sc.nextLine();
                    p.setLevel(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter your E-mail: ");
                    p.setE_mail(sc.nextLine());
                    System.out.println("Enter your Password: ");
                    p.setPassword(sc.nextLine());
                    System.out.println("Your Data is Updated");
                    System.out.println();
                    f = true;
                    c = i;

                }
            }
            if (f) break;
        }
        if (f) {
            for (int j = 0; j < a.size(); j++) {
                if (j == c) {
                    a.get(j).display();
                    break;
                }

            }
        } else System.out.println("This ID is not exist");

    }


    @Override
    public void delete() {
        System.out.println("Enter your ID: ");
        String x = sc.nextLine();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).id.equals(x)) {
                a.remove(a.get(i));
                System.out.println("Your Data is removed");
                return;
            }

        }
        System.out.println("This ID is not exist");
    }

    @Override
    public void display() {
        System.out.println("name= " + name);
        System.out.println("date_of_birth= " + date_of_birth);
        System.out.println("phone= " + add.phone);
        System.out.println("id= " + id);
        System.out.println("city= " + add.city);
        System.out.println("StreetName= " + add.StreetName);
        System.out.println(toString());


    }

    @Override
    public void search() {
        System.out.println("Enter your ID: ");
        String x = sc.nextLine();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).id.equals(x)) {
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
            if (a.get(i) instanceof Student) {
                Student p = (Student) a.get(i);
                        a.get(i).display();
                       System.out.println();
                       f=true;

                    }
            }
         if(!f)
             System.out.println("There is no Data about Students");



            }

        }






