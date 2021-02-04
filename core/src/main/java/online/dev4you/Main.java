package online.dev4you;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Guess The Number Game");
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        //get the game bean context (container)
        NumberGenerator numberGenerator
                = context.getBean(NumberGenerator.class);

        //call the method next() to get a random number
        int number = numberGenerator.next();

        //log generated number
        log.info("number = {}", number);

        //get the game bean context (container)
        Game game =
                context.getBean(Game.class);

        MessageGenerator messageGenerator =
                context.getBean(MessageGenerator.class);

        log.info(messageGenerator.getMainMessage());
        log.info(messageGenerator.getResultMessage());

        //game.reset();
        context.close();
    }
}
