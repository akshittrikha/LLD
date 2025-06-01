package designPatterns.ChainOfResponsibilityDesign;

public class Main {
    public static void main(String[] args) {
        int INFO = 1;
        int DEBUG = 2;
        int ERROR = 3;
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(INFO, "this is an info log");
        logger.log(DEBUG, "this is a debug log");
        logger.log(ERROR, "this is an error log");
        logger.log(4, "this logger is not defined");
    }
}
