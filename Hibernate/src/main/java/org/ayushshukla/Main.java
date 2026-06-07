package org.ayushshukla;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.ayushshukla.Developers.class);
//        cfg.configure();
//
//        SessionFactory sf= new Configuration()
//                .addAnnotatedClass(org.ayushshukla.Developers.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Laptop laptop = new Laptop();
//        laptop.setId(1);
//        laptop.setBrand("Ayush");
//        laptop.setCompany("HP");
//        laptop.setRam(24);
//
//        Developers d= new Developers();
//        d.setLaptop(laptop);
//        d.setName("Kushal");
//        d.setEmployee_id(1);
//        d.setPosition("Developer");
//        Transaction trans = session.beginTransaction();
//        session.persist(d);
//
//        trans.commit();
//        session.close();
//        sf.close();
        String[] names = {
                "Ayush","Darshika","Aarav", "Vivaan", "Aditya", "Arjun", "Krishna", "Rohan", "Rahul", "Amit",
                "Ankit", "Vikas", "Suresh", "Mahesh", "Rajesh", "Mukesh", "Deepak", "Pankaj",
                "Nitin", "Manish", "Karan", "Varun", "Abhishek", "Akash", "Ashish", "Rakesh",
                "Prashant", "Sachin", "Ravindra", "Shubham", "Yash", "Harsh", "Ayush", "Priyanshu",
                "Neeraj", "Lokesh", "Gaurav", "Tarun", "Anurag", "Vivek", "Sanjay", "Vijay",
                "Ajay", "Dinesh", "Naresh", "Umesh", "Rituraj", "Mohit", "Siddharth", "Naveen",
                "Aisha", "Priya", "Ananya", "Diya", "Kavya", "Pooja", "Neha", "Sneha",
                "Riya", "Aditi", "Shreya", "Nidhi", "Swati", "Meera", "Sanya", "Ishita",
                "Muskan", "Khushi", "Payal", "Komal", "Anjali", "Simran", "Tanya", "Rashmi",
                "Preeti", "Ritu", "Jyoti", "Bhavna", "Naina", "Garima", "Pallavi", "Sakshi",
                "Shruti", "Madhuri", "Rekha", "Sunita", "Kiran", "Lata", "Aparna", "Divya",
                "Tanvi", "Nandini", "Priti", "Charu", "Monika", "Sheetal", "Vaishnavi", "Ruchi",
                "Soumya", "Mansi"
        };

        String[] company ={"TCS","Google","Stratbeans"};
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.ayushshukla.Developers.class)
                .addAnnotatedClass(org.ayushshukla.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        Random random = new Random();
        for(int i=0;i< names.length;i++){
            Students s = new Students();
            String name = names[i];
            s.setName(name);
            s.setId(i+1);
            s.setAge(random.nextInt(8)+18);
            Job job = new Job();
            job.setCtc(random.nextInt(100000,900000));
            job.setCompany_name(company[i%3]);
            
            s.setJob(job);
            session.persist(s);
        }
        trans.commit();
        session.close();
        sf.close();

    }
}