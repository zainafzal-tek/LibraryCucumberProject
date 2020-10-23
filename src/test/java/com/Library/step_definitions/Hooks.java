package com.Library.step_definitions;

import com.Library.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(){
        System.out.println(":::Starting Automation:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
        System.out.println(":::Step Complete:::");
    }

}
