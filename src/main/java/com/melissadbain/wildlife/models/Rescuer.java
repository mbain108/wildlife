package com.melissadbain.wildlife.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Rescuer {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String organization;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "alt_number")
    private String altNumber;
    private String email;
    private String street;
    private String city;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "no_solicitations")
    private String noSolicitations;
    @Column(name = "date_entered")
    private String dateEntered;

    public Rescuer() {}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAltNumber() {
        return altNumber;
    }

    public void setAltNumber(String altNumber) {
        this.altNumber = altNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNoSolicitations() {
        return noSolicitations;
    }

    public void setNoSolicitations(String noSolicitations) {
        this.noSolicitations = noSolicitations;
    }

    public String getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(String dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Rescuer(String firstName, String lastName, String organization,
                   String phoneNumber, String altNumber, String email, String street,
                   String city, String postalCode, String noSolicitations, String dateEntered) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.phoneNumber = phoneNumber;
        this.altNumber = altNumber;
        this.email = email;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.noSolicitations = noSolicitations;
        this.dateEntered = dateEntered;


    }
}