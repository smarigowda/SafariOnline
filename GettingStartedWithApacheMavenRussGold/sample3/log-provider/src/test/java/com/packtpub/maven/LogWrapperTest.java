package com.packtpub.maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class LogWrapperTest {

    private PrintStream savedOut;

    @Before
    public void setUp() {
        savedOut = System.out;
    }

    @After
    public void tearDown() {
        System.setOut(savedOut);
    }

    @Test
    public void canLogMessages() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        LogWrapper wrapper = new LogWrapper();
        wrapper.log("a log message");
        assertTrue(baos.toString().contains("a log message"));
    }
}

