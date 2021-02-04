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
    private MessageGenerator messageGenerator;
    private  String mainMessage;
    private String resultMessage;

    // === init ==
    @PostConstruct
    @Override
    public String getMainMessage() {
        System.out.println("In Post Construct");
        return mainMessage;
    }

    @PreDestroy
    @Override
    public String getResultMessage() {
        System.out.println("In Pre Destroy");
        return resultMessage;
    }

    public void setMainMessage(){
        String mainMessage = "Main Message";
        this.mainMessage = mainMessage;
    }

    public void setResultMessage(){
        String resultMessage= "Result Message";
        this.resultMessage = resultMessage;
    }
}
