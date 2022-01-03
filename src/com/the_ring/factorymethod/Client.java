package com.the_ring.factorymethod;

import com.the_ring.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
//        factory = new FileLoggerFactory();
        factory = (LoggerFactory) XMLUtil.getBean("factorymethod");
        logger = factory.createLogger();
        logger.writeLog();
    }
}
