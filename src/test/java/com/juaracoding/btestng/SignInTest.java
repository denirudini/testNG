package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SignInTest {
  private String username;
  private String password;

  @BeforeClass
  public void setup() {
    System.out.println("SignInTest.setup()");
    username = "johansebastian";
    password = "123qwe";
  }

  @Test
  public void tc003() {
    System.out.println("TC003.");
    SignIn signIn = new SignIn();

    signIn.setUsername(username);
    signIn.setPassword(password);
    boolean actual = signIn.onSignIn();

    Assert.assertTrue(actual);
  }

  @BeforeSuite
  public void beforeSuite() {
    System.out.println("Before suite berjalan.");
  }

  @AfterClass
  public void tearDown() {
    username = "";
    password = "";
  }
}
