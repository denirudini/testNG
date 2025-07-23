package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.juaracoding.btestng.SignIn;



public class SignInTest {
  // private String username;
  // private String password;

  // @BeforeClass
  // public void setup() {
  //   System.out.println("SignInTest.setup()");
  //   username = "johansebastian";
  //   password = "123qwe";
  // }

  // @Test
  // public void tc003() {
  //   System.out.println("TC003.");
  //   SignIn signIn = new SignIn();

  //   signIn.setUsername(username);
  //   signIn.setPassword(password);
  //   boolean actual = signIn.onSignIn();

  //   Assert.assertTrue(actual);
  // }

  // @BeforeSuite
  // public void beforeSuite() {
  //   System.out.println("Before suite berjalan.");
  // }

  // @AfterClass
  // public void tearDown() {
  //   username = "";
  //   password = "";
  // }

  

  // @Test(priority = 2)
  // public void dashboardTest() {
  //   System.out.println("Method SignInTest.dashboardTest dijalankan");
  // }

  // @Test(priority = 1)
  // public void signinTest() {
  //   System.out.println("Method SignInTest.signinTest dijalankan");
  // }

  // @Test(priority = 3)
  // public void profileTest() {
  //   System.out.println("Method SignInTest.profileTest dijalankan");
  // }

  // @Test(priority = 4, enabled = false)
  // public void mencobaEnable() {
  //   System.out.println("Method SignInTest.mencobaEnable dijalankan");
  // }

  // @Test(priority = 5)
  // public void mencobaTrue() {
  //   System.out.println("Method SignInTest.mencobaTrue dijalankan");
  // }

   private SignIn signIn;

  @BeforeClass
  public void setup() {
    signIn = new SignIn();
  }

  @Test(priority = 1)
  @Parameters("username")
  public void fillUsername(String username) {
    signIn.setUsername(username);
    Assert.assertEquals(username, signIn.getUsername());
    System.out.println("berhasil memasukan .username");
  }

  @Test(priority = 2, timeOut = 500)
  @Parameters("password")
  public void fillPassword(String password) throws Exception{
    signIn.setPassword(password);
    Assert.assertEquals(password, signIn.getPassword());
    System.out.println("berhasil memasukan .password");
    Thread.sleep(400);
  }

  @Test(priority = 3)
  public void clickButtonSignIn() {
    boolean actual = signIn.clickButtonSignIn();
    Assert.assertTrue(actual);
  }

}
