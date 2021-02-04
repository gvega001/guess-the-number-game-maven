package online.dev4you;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("message")
public class MessageGeneratorImpl implements MessageGenerator{

    //***=== constants ***===
    private static final Logger log = LoggerFactory.getLogger(MessageGenerator.class);

    //**=== fields ***===
    @Autowired
    private Game game;
    private int guessCount =10;

    // === init ==
    @PostConstruct
    @Override
    public String getMainMessage() {
          return "getMainMessage()called";
    }

    @PreDestroy
    @Override
    public String getResultMessage() {
        return "getResultMessage() called";
    }

}
