package com.example.dependancy.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("demo.xml");
        Student s= context.getBean("student",Student.class);
        s.displayStudentInfo();


//        Student s2= context.getBean("student2",Student.class);
//        s2.displayStudentInfo();
    }
}
