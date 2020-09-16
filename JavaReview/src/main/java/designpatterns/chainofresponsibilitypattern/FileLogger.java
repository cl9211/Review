package designpatterns.chainofresponsibilitypattern;

/**
 * Created by CHULEI on 2020/9/16.
 */

class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
