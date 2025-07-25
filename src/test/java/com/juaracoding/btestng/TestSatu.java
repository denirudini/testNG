package com.juaracoding.btestng;

import org.testng.annotations.Test;

public class TestSatu {

    @Test
    public void testMethodA() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestSatu - testMethodA dimulai pada thread: " + Thread.currentThread().getId());
        // Pemisah start dan end
        Thread.sleep(2000); 
        long endTime = System.currentTimeMillis();
        System.out.println("TestSatu - testMethodA selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethodB() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestSatu - testMethodB dimulai pada thread: " + Thread.currentThread().getId());
        // Pemisah start dan end
        Thread.sleep(1500); 
        long endTime = System.currentTimeMillis();
        System.out.println("TestSatu - testMethodB selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }
}
