package com.juaracoding.btestng;

import org.testng.annotations.Test;

public class TestDua {

    @Test
    public void testMethodC() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestDua - testMethodC dimulai pada thread: " + Thread.currentThread().getId());
        // Pemisah start dan end
        Thread.sleep(2500);
        long endTime = System.currentTimeMillis();
        System.out.println("TestDua - testMethodC selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethodD() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("TestDua - testMethodD dimulai pada thread: " + Thread.currentThread().getId());
        // Pemisah start dan end
        Thread.sleep(1000); 
        long endTime = System.currentTimeMillis();
        System.out.println("TestDua- testMethodD selesai dalam " + (endTime - startTime) + " ms pada thread: " + Thread.currentThread().getId());
    }
}
