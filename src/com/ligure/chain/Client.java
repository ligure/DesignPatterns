package com.ligure.chain;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        AbstractLogger logger1 = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger logger2 = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger logger3 = new FileLogger(AbstractLogger.ERROR);
        logger1.setNext(logger2);
        logger2.setNext(logger3);
        logger1.log(AbstractLogger.INFO, "INFO");
        logger1.log(AbstractLogger.DEBUG, "DEBUG");
        logger1.log(AbstractLogger.ERROR, "ERROR");
    }
}
