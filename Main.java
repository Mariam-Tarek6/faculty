package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Person> a = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;

        do {


               System.out.println("\n\n\t\t\t\t\t\t\t\t=====================================================================\n\n");
               System.out.println("\t\t\t\t\t\t\t\t                      FACULTY MANAGEMENT SYSTEM                      ");
               System.out.println("\n\t\t\t\t\t\t\t\t=====================================================================\n\n\n");
               System.out.print("\t\t\t\t\t\t      ==================\n");
               System.out.print("\t\t\t\t\t\t       : :MAIN MENU: :\n");
               System.out.print("\t\t\t\t\t\t      ==================\n");
               System.out.print("\n\t\t\t\t\t\t\t1. ADD A PERSON");
               System.out.print("\n\t\t\t\t\t\t\t2. EDIT A PERSON'S INFORMATION");
               System.out.print("\n\t\t\t\t\t\t\t3. SEARCH FOR A PERSON");
               System.out.print("\n\t\t\t\t\t\t\t4. DELETE A PERSON");
               System.out.print("\n\t\t\t\t\t\t\t5. DISPLAY A PERSON'S INFORMATION");
               System.out.print("\n\t\t\t\t\t\t\t6. EXIT");
               System.out.print("\n\n\t\t\tSelect Your Option (1-6): ");
               ch = sc.next().charAt(0);


            switch (ch) {
                case '1':

                    try {
                        System.out.print("\n\t\t\t\t\t\t\t1. ADD A STUDENT");
                        System.out.print("\n\t\t\t\t\t\t\t2. ADD AN ADMINISTRATOR");
                        System.out.print("\n\t\t\t\t\t\t\t3. ADD AN INSTRUCTOR");
                        System.out.print("\n\t\t\t\t\t\t\t4. ADD A TECHNICAL");
                        System.out.print("\n\t\t\t\t\t\t\t5. ADD A WORKER");
                        System.out.print("\n\n\t\t\tSelect Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person u = new Student();
                                u.add();
                               break;
                            }
                            catch (Exception e) {

                                System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.add();
                                break;
                            }
                            catch (Exception e) {

                                 System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.add();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '4':
                            try {
                                Employee c = new Technical();
                                c.add();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '5':
                            try {
                                Employee w = new Worker();
                                w.add();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                          break;
                    }
                  break;

                case '2':
                    try {
                        System.out.print("\n\t\t\t\t\t\t\t1. EDIT FOR  STUDENT'S INFORMATION");
                        System.out.print("\n\t\t\t\t\t\t\t2. EDIT FOR ADMINISTRATOR'S INFORMATION");
                        System.out.print("\n\t\t\t\t\t\t\t3. EDIT FOR INSTRUCTOR'S INFORMATION");
                        System.out.print("\n\t\t\t\t\t\t\t4. EDIT FOR TECHNICIAN'S INFORMATION");
                        System.out.print("\n\t\t\t\t\t\t\t5. EDIT FOR WORKER'S INFORMATION");
                        System.out.print("\n\n\t\t\tSelect Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.edit();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.edit();
                                break;
                            }
                            catch (Exception e) {

                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.edit();
                                break;
                            } catch (Exception e) {

                                System.out.println("Your Code have a logical error");
                            }

                            break;

                        case '4':
                            try {
                                Employee c = new Technical();
                                c.edit();
                                break;
                            } catch (Exception e) {

                                System.out.println("Your Code have a logical error");
                            }

                            break;

                        case '5':
                            try {
                                Employee w = new Worker();
                                w.edit();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }

                            break;

                    }
                    break;

                case '3':
                    try {
                        System.out.print("\n\t\t\t\t\t\t\t1. SEARCH FOR  STUDENT");
                        System.out.print("\n\t\t\t\t\t\t\t2. SEARCH FOR ADMINISTRATOR");
                        System.out.print("\n\t\t\t\t\t\t\t3. SEARCH FOR INSTRUCTOR");
                        System.out.print("\n\t\t\t\t\t\t\t4. SEARCH FOR TECHNICIAN");
                        System.out.print("\n\t\t\t\t\t\t\t5. SEARCH FOR WORKER");
                        System.out.print("\n\n\t\t\tSelect Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '4':
                            try {
                                Employee c = new Technical();
                                c.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '5':
                            try {
                                Employee w = new Worker();
                                w.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                    }
                    break;

                case '4':
                    try {
                        System.out.print("\n\t\t\t\t\t\t\t1. DELETE A STUDENT");
                        System.out.print("\n\t\t\t\t\t\t\t2. DELETE AN ADMINISTRATOR");
                        System.out.print("\n\t\t\t\t\t\t\t3. DELETE AN INSTRUCTOR");
                        System.out.print("\n\t\t\t\t\t\t\t4. DELETE A TECHNICAL");
                        System.out.print("\n\t\t\t\t\t\t\t5. DELETE A WORKER");
                        System.out.print("\n\n\t\t\tSelect Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.delete();
                                break;
                            } catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.delete();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.delete();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '4':
                            try {
                                Employee c = new Technical();
                                c.delete();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '5':
                            try {

                                Employee w = new Worker();
                                w.delete();
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                    }
                    break;
                case '5':
                    try {
                        System.out.print("\n\t\t\t\t\t\t\t1. SHOW STUDENTS' DATA");
                        System.out.print("\n\t\t\t\t\t\t\t2. SHOW ADMINISTRATORS' DATA");
                        System.out.print("\n\t\t\t\t\t\t\t3. SHOW INSTRUCTORS' DATA");
                        System.out.print("\n\t\t\t\t\t\t\t4. SHOW TECHNICIANS' DATA");
                        System.out.print("\n\t\t\t\t\t\t\t5. SHOW WORKERS' DATA");
                        System.out.print("\n\n\t\t\tSelect Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    }catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.show();
                                break;
                            } catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.show();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.show();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '4':
                            try {
                                Employee c = new Technical();
                                c.show();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '5':
                            try {

                                Employee w = new Worker();
                                w.show();
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                    }
                    break;

                case '6':
                    break;
                default:
                    System.out.print("\n\n\t\t\tSORRY,INVALID OPTION.....SELECT OPTION AGAIN");


            }
        } while (ch != '6');
    }
}
