package designpatterns.chainofresponsibilitypattern;

/**
 * Created by CHULEI on 2020/9/16.
 */

class Test {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
