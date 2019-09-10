package com.example.rt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuyzh
 * @description:
 * @date 2019/9/3 16:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    public long id;
    public String name;
    public int age;

}
