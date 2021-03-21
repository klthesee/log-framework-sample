package com.zk.test;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//
//
//public class Log4jTest {
//
//    static final Logger log = LoggerFactory.getLogger(Log4jTest .class);
//
//    public static void main(String[] args) {
//        log.info("lbw");
//    }
//
//}


import org.apache.log4j.Logger;

public class Log4jTest {

        final static Logger log =  Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        log.info("lbw");
    }

}