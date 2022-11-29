package no.sas.controller;

import no.sas.models.Passenger;
import no.sas.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PassengerService passengerService;

    @RequestMapping(method=RequestMethod.GET, value="/passengers")
    public List<Passenger> getPassengers(){
        return this.passengerService.getPassengerList();
    }

    @RequestMapping(method=RequestMethod.GET, value="/passengers/{passenger}")
    public Passenger getPassenger(@PathVariable String passenger){
        return this.passengerService.getPassenger(passenger);
    }

    @RequestMapping(method=RequestMethod.POST, value="/passengers")
    public void addPassenger(@RequestBody Passenger passenger){
        this.passengerService.addPassenger(passenger);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/passengers/{passengerSocialSecNumber}")
    public void updatePassenger(@RequestBody Passenger passenger, @PathVariable String passengerSocialSecNumber){
        this.passengerService.updatePassenger(passenger, passengerSocialSecNumber);
    }
}
