package com.sunny.model;

import java.io.Serializable;

/**
 * @author sunny
 * @className GradleUser
 * @date 2018-03-26 17:32
 * @description:
 */
public class GradleUser implements Serializable {

    private static final long serialVersionUID = -8292116193956717244L;

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
