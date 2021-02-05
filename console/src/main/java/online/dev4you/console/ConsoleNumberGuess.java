package online.dev4you.console;

import online.dev4you.Game;
import online.dev4you.MessageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Scanner;

@Component
public class ConsoleNumberGuess {

    //**==== constants ===
    private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    //**=== fields ***====
    @Autowired
    private Game game;
    @Autowired
    private MessageGenerator messageGenerator;

    //***==== fields ***===
    @EventListener
    public void start(ContextRefreshedEvent contextRefreshedEvent) {

        log.info("start() --> Container ready for use");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(messageGenerator.getMainMessage());
            System.out.println(messageGenerator.getResultMessage());

            int guess = scanner.nextInt();
            scanner.nextLine();
            game.setGuess(guess);
            game.check();

            if(game.isGameWon() || game.isGameLost()){
                System.out.println(messageGenerator.getResultMessage());
                System.out.println("play again y/n");

                String playAgainString = scanner.nextLine().trim();
                if(!playAgainString.equalsIgnoreCase("y")){
                    break;
                }

                game.reset();
            }
        }

    }

}
