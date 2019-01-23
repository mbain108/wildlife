package com.melissadbain.wildlife.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Patient {

    @Id
    @GeneratedValue
    private int id;

    private String admitted_date;

    @NotNull
    @Size(min = 3, max = 100)
    private String species_name;

    @NotNull
    @Size(min = 3, max = 1000)
    private String reason;

    public Patient() {}

    public Patient(String species_name, String reason) {

        this.species_name = species_name;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public String getAdmitted_date() {
        return admitted_date;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}