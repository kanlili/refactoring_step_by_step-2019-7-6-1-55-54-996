package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {
    private  static Police police;
    @BeforeAll
    public  static void init(){
        police=new Police();
    }
    @Test
    public void should_return_true_when_driver_over_age() {
        //given

        Driver driver=new Driver(19);
        //when
        boolean result=police.checkDriver(driver);
        //then
        Assertions.assertEquals(true,result);
    }
    @Test
    public void should_return_false_when_driver_low_age() {
        //given

        Driver driver=new Driver(17);
        //when
        boolean result=police.checkDriver(driver);
        //then
        Assertions.assertEquals(false,result);
    }
    @Test
    public void should_return_true_when_driver_equal_age() {
        //given

        Driver driver=new Driver(18);
        //when
        boolean result=police.checkDriver(driver);
        //then
        Assertions.assertEquals(true,result);

    }
}