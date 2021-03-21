package com.zk;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class Testlog4j2 {

//    static final Logger logger = LogManager.getLogger(Testlog4j2.class);
    static final Logger logger = LoggerFactory.getLogger(Testlog4j2.class);
    public static void main(String[] args) {
        logger.info("log4j2 test");
    }

}
