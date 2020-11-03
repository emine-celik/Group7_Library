package com.Cybertek.Library.step_definitions;


import com.Cybertek.Library.Utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
