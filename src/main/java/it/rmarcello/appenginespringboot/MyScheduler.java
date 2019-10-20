package it.rmarcello.appenginespringboot;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
@EnableScheduling
public class MyScheduler {

    private static final Logger LOGGER = Logger.getLogger(MyScheduler.class.getName());

    @Scheduled(fixedDelay = 30000)
    public void tic() {
        Date now = new Date();
        LOGGER.info("tic! at: " + now);


    }

}
