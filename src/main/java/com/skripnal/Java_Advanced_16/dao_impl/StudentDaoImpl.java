package com.skripnal.Java_Advanced_16.dao_impl;

import com.skripnal.Java_Advanced_16.Student;
import com.skripnal.Java_Advanced_16.dao.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private List<Student> students;
    private static StudentDaoImpl studentDaoImpl;

    private StudentDaoImpl() {
        students = new ArrayList<>();
    }

    public static StudentDaoImpl getStudentDaoImpl() {
        if (studentDaoImpl == null) {
            studentDaoImpl = new StudentDaoImpl();
        }
        return studentDaoImpl;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.toString() +" added");
    }

    @Override
    public void removeStudent(int id) {
        System.out.println(students.get(id).toString() +" removed");
        students.remove(id);
    }

    @Override
    public Student getStudent(int id) {
        System.out.println("Student returned");
        return students.get(id);
    }

    @Override
    public void updateStudent(Student student) {

        students.set(student.getId()-1, student);
        System.out.println("Student updated");
    }

    @Override
    public void printStudents() {
        System.out.println("Students:");
        students.forEach(System.out::println);
    }
}
