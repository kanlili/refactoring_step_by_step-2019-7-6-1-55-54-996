package com.tws.refactoring;

public class Driver {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLegalDriver() {
        return  this.age>=18;
    }
}
