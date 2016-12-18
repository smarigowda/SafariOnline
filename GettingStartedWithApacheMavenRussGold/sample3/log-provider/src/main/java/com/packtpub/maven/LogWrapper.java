package com.packtpub.maven;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Wrappers a log4j logger.
 */
public class LogWrapper {

    private final Logger logger;

    LogWrapper() {
        BasicConfigurator.configure();
        logger = Logger.getLogger("com.packtpub");
        logger.setLevel(Level.INFO);
    }

    void log(String message) {
        logger.info(message);
    }

}
