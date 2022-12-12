package com.eurotech.step_definitions;

import com.eurotech.utulities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("\nThis is coming from Before method");
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[]screenshot=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
    @Before("@db")
    public void setupDb(){
        System.out.println("\tConnecting DB");
    }
    @After("@db")
    public void closeDB(){
        System.out.println("\tDisconnecting DB");
    }


}
