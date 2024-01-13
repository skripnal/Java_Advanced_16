package com.skripnal.Java_Advanced_16;

import com.skripnal.Java_Advanced_16.dao_impl.StudentDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaAdvanced16Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(JavaAdvanced16Application.class, args);
        StudentDaoImpl studentDaoImpl = context.getBean("studentDaoImpl", StudentDaoImpl.class);

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        setStudentParams(student1, 1, "Ivan", 20);
        setStudentParams(student2, 2, "Petr", 21);
        setStudentParams(student3, 3, "Sidor", 22);
        setStudentParams(student4, 4, "Vasya", 23);
        setStudentParams(student5, 5, "Kolya", 24);
        setStudentParams(student6, 1, "Misha", 25);

        studentDaoImpl.addStudent(student1);
        studentDaoImpl.addStudent(student2);
        studentDaoImpl.addStudent(student3);
        studentDaoImpl.addStudent(student4);
        studentDaoImpl.addStudent(student5);

        studentDaoImpl.printStudents();

        studentDaoImpl.removeStudent(2);
        studentDaoImpl.printStudents();

        studentDaoImpl.updateStudent(student6);
        System.out.println(studentDaoImpl.getStudent(student6.getId() - 1));

        System.out.println();
        studentDaoImpl.printStudents();


    }

    public static void setStudentParams(Student student, int id, String name, int age) {
        student.setId(id);
        student.setName(name);
        student.setAge(age);
    }
}
