package no.sas.service;

import no.sas.models.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    private List<Passenger> passengerList = new ArrayList<>();

    public List<Passenger> getPassengerList() {
        return List.copyOf(this.passengerList);
    }
}
