package designpatterns.chainofresponsibilitypattern;

/**
 * Created by CHULEI on 2020/9/16.
 */

class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
