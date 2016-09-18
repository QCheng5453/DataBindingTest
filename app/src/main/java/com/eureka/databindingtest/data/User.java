package com.eureka.databindingtest.data;

/**
 * usage
 *
 * @author cheng.qian.
 * @date 2016/9/18.
 * ============================================
 * Copyright (c) 2016 TRANSSION.Co.Ltd.
 * All right reserved.
 **/

public class User {
    private String name;
    private String age;

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public User(String name, String age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    private boolean isMale;


    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
