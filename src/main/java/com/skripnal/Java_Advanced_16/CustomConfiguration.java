package com.skripnal.Java_Advanced_16;

import com.skripnal.Java_Advanced_16.dao_impl.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
    @Bean(name = "studentDaoImpl")
    public StudentDaoImpl getStudentDaoImpl() {
        return StudentDaoImpl.getStudentDaoImpl();
    }
}
