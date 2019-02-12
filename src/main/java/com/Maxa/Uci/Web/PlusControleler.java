package com.Maxa.Uci.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlusControleler {
    //UserDetails userDetails=new UserDetails ();
    @GetMapping("/ucenik")
    String Ajd() {
        return "Maxa";
    }
//   @PostMapping(path = "/members"/*, consumes = "application/json"*/, produces = "application/json")
//   public String createUser(@RequestBody UserDetails userDetails) {
//       return userDetails.firstName+" "+userDetails.lastName;
//   }
    @PostMapping(path = "/members")
    public String addMemberV1(@RequestBody UserDetails userDetails) {
        //System.out.println("Uneto "+userDetails.firstName);
        return userDetails.getFirstName() + " " + userDetails.getLastName();
    }

    @PostMapping(path = "/korisnik")
    public Korisnik dodajClanV2(@RequestBody UserDetails userDetails) {
        Korisnik k1 = new Korisnik();
        k1.setIme(userDetails.getFirstName()+" "+userDetails.getAddress());
        k1.setPrezime(userDetails.getLastName());
        return k1;
    }
}
