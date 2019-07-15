package com.tws.refactoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class DriverTest {
    private  static Driver driver;
    @BeforeAll
    public  static void init(){
        driver= new Driver();
    }

    @Test
    public void should_return_true_when_driver_over_age() {
        //given

        driver.setAge(19);;
        //when
        boolean result=driver.isLegalDriver();
        //then
        Assertions.assertEquals(true,result);
    }
    @Test
    public void should_return_true_when_driver_low_age() {
        //given

         driver.setAge(18);
        //when
        boolean result=driver.isLegalDriver();
        //then
        Assertions.assertEquals(true,result);
    }
    @Test
    public void should_return_true_when_driver_equal_age() {
        //given

        driver.setAge(17);
        //when
        boolean result=driver.isLegalDriver();
        //then
        Assertions.assertEquals(false,result);
    }
}

