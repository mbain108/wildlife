package com.melissadbain.wildlife.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Patient {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "date_admitted")
    private String dateAdmitted;
    @Column(name = "reference_number")
    private Integer referenceNumber;
    @Column(name = "microchip_number")
    private Integer microchipNumber;
    @Column(name = "species_name")
    private String speciesName;
    @Column(name = "number_of_patients")
    private Integer numberOfPatients;
    @Column(name = "rescuer_id")
    private Integer rescuerId;
    @Column(name = "rescuer_notes")
    private String rescuerNotes;
    @Column(name = "donation_id")
    private Integer donationId;
    @Column(name = "admitted_by")
    private String admittedBy;
    @Column(name = "transported_by")
    private String transportedBy;
    @Column(name = "address_found")
    private String addressFound;
    @Column(name = "city_found")
    private String cityFound;
    @Column(name = "state_found")
    private String stateFound;
    @Column(name = "county_found")
    private String countyFound;
    @Column(name = "date_found")
    private String dateFound;
    private String reason;
    @Column(name = "care_from_user")
    private String careFromUser;
    @Column(name = "notes_about_rescue")
    private String notesAboutRescue;
    private String location;
    private String band;
    private String disposition;
    @Column(name = "case_year")
    private String caseYear;

    public Patient() {}

    public Patient(Integer referenceNumber, Integer microchipNumber, String speciesName,
                   Integer numberOfPatients, Integer rescuerId, String rescuerNotes, Integer donationId,
                   String admittedBy, String transportedBy, String addressFound, String cityFound,
                   String stateFound, String countyFound, String dateDound, String reason,
                   String careFromUser, String notesAboutRescue, String location, String band,
                   String disposition, String caseYear) {

        this.referenceNumber = referenceNumber;
        this.microchipNumber = microchipNumber;
        this.speciesName = speciesName;
        this.numberOfPatients = numberOfPatients;
        this.rescuerId = rescuerId;
        this.rescuerNotes = rescuerNotes;
        this.donationId = donationId;
        this.admittedBy = admittedBy;
        this.transportedBy = transportedBy;
        this.addressFound = addressFound;
        this.cityFound = cityFound;
        this.stateFound = stateFound;
        this.countyFound = countyFound;
        this.dateFound = dateFound;
        this.reason = reason;
        this.careFromUser = careFromUser;
        this.notesAboutRescue = notesAboutRescue;
        this.location = location;
        this.band = band;
        this.disposition = disposition;
        this.caseYear = caseYear;
    }

    public int getId() {
        return id;
    }

    public String getDateAdmitted() {
        return dateAdmitted;
    }

    public void setDateAdmitted(String dateAdmitted) {
        this.dateAdmitted = dateAdmitted;
    }

    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Integer getMicrochipNumber() {
        return microchipNumber;
    }

    public void setMicrochipNumber(Integer microchipNumber) {
        this.microchipNumber = microchipNumber;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Integer getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(Integer numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public Integer getRescuerId() {
        return rescuerId;
    }

    public void setRescuerId(Integer rescuerId) {
        this.rescuerId = rescuerId;
    }

    public String getRescuerNotes() {
        return rescuerNotes;
    }

    public void setRescuerNotes(String rescuerNotes) {
        this.rescuerNotes = rescuerNotes;
    }

    public Integer getDonationId() {
        return donationId;
    }

    public void setDonationId(Integer donationId) {
        this.donationId = donationId;
    }

    public String getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(String admittedBy) {
        this.admittedBy = admittedBy;
    }

    public String getTransportedBy() {
        return transportedBy;
    }

    public void setTransportedBy(String transportedBy) {
        this.transportedBy = transportedBy;
    }

    public String getAddressFound() {
        return addressFound;
    }

    public void setAddressFound(String addressFound) {
        this.addressFound = addressFound;
    }

    public String getCityFound() {
        return cityFound;
    }

    public void setCityFound(String cityFound) {
        this.cityFound = cityFound;
    }

    public String getStateFound() {
        return stateFound;
    }

    public void setStateFound(String stateFound) {
        this.stateFound = stateFound;
    }

    public String getCountyFound() {
        return countyFound;
    }

    public void setCountyFound(String countyFound) {
        this.countyFound = countyFound;
    }

    public String getDateFound() {
        return dateFound;
    }

    public void setDateFound(String dateFound) {
        this.dateFound = dateFound;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCareFromUser() {
        return careFromUser;
    }

    public void setCareFromUser(String careFromUser) {
        this.careFromUser = careFromUser;
    }

    public String getNotesAboutRescue() {
        return notesAboutRescue;
    }

    public void setNotesAboutRescue(String notesAboutRescue) {
        this.notesAboutRescue = notesAboutRescue;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getCaseYear() {
        return caseYear;
    }

    public void setCaseYear(String caseYear) {
        this.caseYear = caseYear;
    }
}