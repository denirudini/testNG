package com.juaracoding.btestng;

import org.testng.annotations.Test;

public class TestClassTwo {

    @Test
    public void testMethodC() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestClassTwo - testMethodC dimulai pada thread: " + Thread.currentThread().getId());
        // Simulasikan pekerjaan
        Thread.sleep(2500); // Tidur selama 2.5 detik
        long endTime = System.currentTimeMillis();
        System.out.println("TestClassTwo - testMethodC selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethodD() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestClassTwo - testMethodD dimulai pada thread: " + Thread.currentThread().getId());
        // Simulasikan pekerjaan
        Thread.sleep(1000); // Tidur selama 1 detik
        long endTime = System.currentTimeMillis();
        System.out.println("TestClassTwo - testMethodD selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }
}
