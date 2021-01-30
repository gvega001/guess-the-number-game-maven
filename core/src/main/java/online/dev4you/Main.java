package online.dev4you;

import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final ILoggerFactory log = LoggerFactory.getILoggerFactory();

    private static final String CONFIG_LOCACTION = "beans.xml";

    public static void main(String[] args) {
        log.getLogger("Guess The Number Game");
    }

    ConfigurableApplicationContext context
            = new ClassPathXmlApplicationContext(CONFIG_LOCACTION);

    NumberGenerator numberGenerator
            = context.getBean("numberGenerator", NumberGenerator.class);
}
