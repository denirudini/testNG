package com.juaracoding.btestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("This is before method");
    }
    @AfterMethod
    public void AfterMethod() {
        System.out.println("This is after method");
    }
}
