package com.tws.refactoring;

public class Driver {
    private  static  final  int LEGAL_AGE=18;
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isLegalDriver() {
        return  this.age>=LEGAL_AGE;
    }
}
