package com.example.ndkcmakedemo;

public class NDKTools {

    static {
        System.loadLibrary("native-lib");
    }

    public static native String getStringFromNDK();

}
