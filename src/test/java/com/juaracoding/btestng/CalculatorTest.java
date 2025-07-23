package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
  private int a;
  private int b;

  @BeforeClass
  public void setup() {
    System.out.println("CalculatorTest.setup()");
    a = 10;
    b = 2;
  }

  @Test
  public void addTest() {
    System.out.println("addTest.");
    int expected = 12;

    int actual = Calculator.add(a, b);
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void substractTest() {
    System.out.println("substractTest.");
    int expected = 8;
    int actual = Calculator.substract(a, b);

    Assert.assertEquals(expected, actual);
  }

  @AfterClass
  public void tearDown() {
    a = 0;
    b = 0;
  }

  @Test
  public void tc001() {
    System.out.println("TC001.SignInTest.");
  }

  @Test
  public void tc003() {
    System.out.println("TC003.SignInTest.");
  }

  @Test
  public void tc002() {
    System.out.println("TC002.SignInTest.");
  }

  @Test
  public void SignInTest() {
    System.out.println("mencoba .SignInTest.");
  }
  @Test(dependsOnMethods = {"SignInTest"})
  public void dashboardTest() {
    System.out.println("mencoba2 .dASHBOARD.");
  }

}
