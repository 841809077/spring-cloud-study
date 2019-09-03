package com.eureka.client.repository.impl;

import com.eureka.client.entity.Student;
import com.eureka.client.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyzh
 * @description:
 * @date 2019/9/3 16:30
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 25));
        studentMap.put(2L, new Student(2L, "李四", 18));
        studentMap.put(3L, new Student(3L, "王五", 16));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.id, student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
