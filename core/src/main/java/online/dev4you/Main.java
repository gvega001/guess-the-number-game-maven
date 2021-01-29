package online.dev4you;

import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

public class Main {

    private static final ILoggerFactory log = LoggerFactory.getILoggerFactory();

    public static void main(String[] args) {
        log.getLogger("Guess The Number Game");
    }
}
