package com.company;

public class adminstrator extends person {
    private double salary;
    private String E_mail;
    private String password;
    private String job_title;

    public adminstrator(){}
    public adminstrator(String name,int id,String date_of_birth,String phone,String address,double salary,String E_mail,String password,String job_title){
        super( name, id, date_of_birth, phone, address);
        this.E_mail=E_mail;
        this.password=password;
        this.salary=salary;
        this.job_title=job_title;

    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    @Override
    public String toString() {
        return "adminstrator{" +
                "salary=" + getSalary()+
                ", E_mail='" + getE_mail()+ '\'' +
                ", password='" + getPassword()+ '\'' +
                ", job_title='" + getJob_title() + '\'' +
                '}';
    }

    @Override
    public void add() {
        adminstrator s =new adminstrator();
        s.name=sc.next();
        s.id=sc.nextInt();
        s.phone=sc.next();
        s.date_of_birth=sc.next();
        s.address=sc.next();
        s.setJob_title(sc.next());
        s.setSalary(sc.nextInt());
        s.setE_mail(sc.next());
        s.setPassword(sc.next());
        a.add(s);

    }

    @Override
    public void edit() {
        int x = sc.nextInt();
        for (int i = 0; i < a.size(); i++) {
            adminstrator e =(adminstrator) a.get(i);
            if (e.id == x) {
                e.name=sc.next();
                e.id = sc.nextInt();
                e.phone = sc.next();
                e.date_of_birth = sc.next();
                e.address = sc.next();
                e.setSalary(sc.nextDouble());
                e.setJob_title(sc.next());
                e.setE_mail(sc.next());
                e.setPassword(sc.next());
                break;

            }
        }
        for (int j = 0; j < a.size(); j++) {

            a.get(j).display();
        }

    }

    @Override
    public void delete() {
        int x = sc.nextInt();
        for (int i = 0; i < a.size(); i++) {
            person e = a.get(i);
            if (e.id == x) {
                a.remove(a.get(i));

            }
        }
        for (int j = 0; j < a.size(); j++) {

            System.out.println(a.get(j));
        }

    }

    @Override
    public void display() {
        System.out.println("name= "+name);
        System.out.println("date_of_birth= "+date_of_birth);
        System.out.println("phone= "+phone);
        System.out.println("id= "+id);
        System.out.println("address= "+address);
        System.out.println(toString());
    }
}
