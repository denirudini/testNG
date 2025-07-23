package com.juaracoding.btestng;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public static String OS = "Windows XP";
    public static List<String> appList = new ArrayList<String>(){
        {
            add("microsoft Word");
            add("opera");
            add("Mozilla FireFox");
        }
    };

    public static double RAM_MB = 1024;
    public static double storage_GB = 128;
    
    
}
