package com.Maxa.Uci.Web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

    @RestController
    public class HelloController {

//        @RequestMapping("/")
//        public String index() {
//            return "Greetings from Spring Boot!";
//        }
        @GetMapping("/Profa")
        String Ajd() {
            return "Zoki";
        }
        @GetMapping("/broj")
        Integer Br() {
            return 777;
        }
        @GetMapping("/br")
        Integer Br1() {
            Pomocna pom=new Pomocna();
            return pom.Izracunaj(8);
        }
    }
