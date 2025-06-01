package designPatterns.ChainOfResponsibilityDesign;

public abstract class LogProcessor {
    LogProcessor nextLogger;

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor(LogProcessor nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int logLevel, String message) {
        if (this.nextLogger != null) {
            nextLogger.log(logLevel, message);
        } else {
            System.out.println("Cannot log the message. No logger found!");
        }
    }
}