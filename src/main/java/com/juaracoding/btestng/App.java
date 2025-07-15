package com.juaracoding.btestng;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         
        System.out.println("Hello World!");
        int a = 10;
        int b = 2;
        int expected = 12;

        int actual = Calculator.add(a, b);

        if (expected == actual) {
            System.out.println("Test Passs");
        } else {
            System.out.println("Test Fail");
        }
    
    }
}
