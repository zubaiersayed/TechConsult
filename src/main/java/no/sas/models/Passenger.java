package no.sas.models;

import java.util.Objects;

public class Passenger {
    private String socialSecurityNumber;
    private String name;
    private String dob;
    private String destination;

    public Passenger(String socialSecurityNumber, String name, String dob, String destination){
        this.socialSecurityNumber = socialSecurityNumber;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if(obj instanceof Passenger passenger) return passenger.socialSecurityNumber.equals(this.socialSecurityNumber);

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob, destination);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
