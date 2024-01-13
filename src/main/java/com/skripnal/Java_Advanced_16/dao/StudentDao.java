package com.skripnal.Java_Advanced_16.dao;

import com.skripnal.Java_Advanced_16.Student;

public interface StudentDao {

    public void addStudent(Student student);
    public void removeStudent(int id);
    public Student getStudent(int id);
    public void updateStudent(Student student);
    public void printStudents();

}
