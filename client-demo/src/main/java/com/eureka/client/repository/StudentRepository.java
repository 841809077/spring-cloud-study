package com.eureka.client.repository;

import com.eureka.client.entity.Student;

import java.util.Collection;

/**
 * @author liuyzh
 * @description:
 * @date 2019/9/3 16:27
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
