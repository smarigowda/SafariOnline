package com.packtpub.maven;

/**
 * Uses the log wrapper defined in the log-provider package
 */
public class Hello {

    public static void main(String... args) {
        LogWrapper wrapper = new LogWrapper();
        wrapper.log("Hello, World!");
    }

}
