package com.zk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    static final Logger logger = LoggerFactory.getLogger(LogbackTest .class);


    public static void main(String[] args) {
        logger.debug("logback test");
    }

}
