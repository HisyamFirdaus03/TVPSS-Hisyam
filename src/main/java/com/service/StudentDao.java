package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Student;

import java.util.List;

@Service
public class StudentDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
    @Transactional
    public void saveStudent(Student student) {
        getCurrentSession().saveOrUpdate(student);
    }
    
    @Transactional
    public Student getStudent(int id) {
        return getCurrentSession().get(Student.class, id);
    }
    
    @Transactional
    @SuppressWarnings("unchecked")
    public List<Student> getAllStudents() {
        return getCurrentSession().createQuery("from Student").list();
    }
    
    @Transactional
    public void deleteStudent(int id) {
        Student student = getStudent(id);
        if (student != null) {
            getCurrentSession().delete(student);
        }
    }
}