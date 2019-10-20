package it.rmarcello.appenginespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {
  private static final Logger LOGGER = Logger.getLogger(MyScheduler.class.getName());
  public static void main(String[] args) {

    LOGGER.info("starting the application");
    SpringApplication.run(DemoApplication.class, args);
  }


}