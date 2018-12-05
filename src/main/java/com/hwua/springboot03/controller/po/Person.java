package com.hwua.springboot03.controller.po;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {

    private Integer id;
    @NotNull(message = "用户名不能为null")
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 3,max = 5,message = "用户名长度应该在3到5之间")
    private String name;//长度为10-15
    @Email(message = "不是个合法的邮箱")
//    @Pattern(regexp = "正则表达式")
    private String email;
//    @Size(min = 10,max = 200,message = "年龄不合法")
    @Range(min = 10,max = 200,message = "年龄不合法")
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
