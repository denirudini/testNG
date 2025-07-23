package com.juaracoding.btestng;

import org.testng.annotations.Test;

public class TestClassOne {

    @Test
    public void testMethodA() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestClassOne - testMethodA dimulai pada thread: " + Thread.currentThread().getId());
        // Simulasikan pekerjaan
        Thread.sleep(2000); // Tidur selama 2 detik
        long endTime = System.currentTimeMillis();
        System.out.println("TestClassOne - testMethodA selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethodB() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestClassOne - testMethodB dimulai pada thread: " + Thread.currentThread().getId());
        // Simulasikan pekerjaan
        Thread.sleep(1500); // Tidur selama 1.5 detik
        long endTime = System.currentTimeMillis();
        System.out.println("TestClassOne - testMethodB selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }
}
