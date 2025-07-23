package com.juaracoding.btestng;

import static org.testng.Assert.assertTrue;
import com.juaracoding.btestng.Computer;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

public class ComputerTest1 {
    @Test
    public void RAMTest (){
        boolean RAM_OK = Computer.RAM_MB >= 256;
        assertTrue(RAM_OK, "RAM komputer anda kurang darui 256MB");
    }
     
     @Test
    public void StorageTest(){
        boolean Storage_OK = Computer.storage_GB >= 64;
        assertTrue(Storage_OK, "RAM komputer anda kurang darui 64 gb");
    }
    

   
    
}
