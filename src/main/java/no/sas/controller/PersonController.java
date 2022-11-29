package no.sas.controller;

import no.sas.models.Passenger;
import no.sas.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PassengerService passengerService;

    @RequestMapping("/passengers")
    public List<Passenger> getPassengers(){
        return passengerService.getPassengerList();
    }

    @RequestMapping("/passengers/{id}")
    public Passenger getDetails(@PathVariable Passenger passenger){
        return passengerService.getPassengerList().stream().filter(p -> p.equals(passenger)).findFirst().get();
    }
}
