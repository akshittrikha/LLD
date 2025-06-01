package designPatterns.ChainOfResponsibilityDesign;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }
}