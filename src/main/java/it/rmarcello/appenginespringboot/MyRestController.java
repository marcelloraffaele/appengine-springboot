package it.rmarcello.appenginespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String testaCroce() {
        int x = (int)(Math.random()*100);
        String res = "TESTA";
        if( x%2==1)
            res = "CROCE";
        return "Lancio monetina: " + res;
    }

    @GetMapping("/random")
    public String random() {
        int x = (int)(Math.random()*100);
        String res = "NUMERO = " + x;
        return res;
    }

}
