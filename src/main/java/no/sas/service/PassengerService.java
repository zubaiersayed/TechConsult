package no.sas.service;

import no.sas.models.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

   final private List<Passenger> passengerList = new ArrayList<>();

    public List<Passenger> getPassengerList() {
        return  List.copyOf(this.passengerList);
    }

    public Passenger getPassenger(String socialSecNumber){
       return this.passengerList.stream().filter(p -> p.getSocialSecurityNumber().equals(socialSecNumber)).findFirst().orElseThrow(RuntimeException::new);
    }

    public void addPassenger(Passenger passenger){
        if(this.passengerList.contains(passenger)) {
            throw new RuntimeException();
        } else {
            this.passengerList.add(passenger);
        }
    }

    public void updatePassenger(Passenger ps, String passengerSocialSecNumber) {
        for(int i=0; i<this.passengerList.size(); i++){

            Passenger passenger = this.passengerList.get(i);

            if(passenger.getSocialSecurityNumber().equals(passengerSocialSecNumber)){
                this.passengerList.set(i, ps);
                break;
            }
        }
    }
}
