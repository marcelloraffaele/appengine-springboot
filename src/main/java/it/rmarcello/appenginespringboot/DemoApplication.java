package it.rmarcello.appenginespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Add imports
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String hello() {
	  int x = (int)(Math.random()*100);
	  String res = "TESTA";
	  if( x%2==1)
		  res = "CROCE";
    return "Lancio monetina: " + res;
  }
}