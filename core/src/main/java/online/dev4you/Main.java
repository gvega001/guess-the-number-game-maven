package online.dev4you;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String CONFIG_LOCACTION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCACTION);

        NumberGenerator numberGenerator
                = context.getBean("numberGenerator", NumberGenerator.class);

        //call the method next() to get a random number
        int number = numberGenerator.next();

        //log generated number
        log.info("number = {}", number);
    }

}
