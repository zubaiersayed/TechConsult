package no.sas.models;

import java.util.Objects;

public class Passenger {
    private String name;
    private String dob;
    private String destination;

    public Passenger(String name, String dob, String destination){
        this.name = name;
        this.dob = dob;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob, destination);
    }
}
