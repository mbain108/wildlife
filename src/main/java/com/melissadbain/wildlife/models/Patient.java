package com.melissadbain.wildlife.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Patient {

    @Id
    @GeneratedValue
    private int id;

    @GeneratedValue
    private String date_admitted;

    private Integer reference_number;
    private Integer microchip_number;
    private String species_name;
    private Integer number_of_patients;
    private Integer rescuer_id;
    private String rescuer_notes;
    private Integer donation_id;
    private String admitted_by;
    private String transported_by;
    private String address_found;
    private String city_found;
    private String state_found;
    private String county_found;
    private String date_found;
    private String reason;
    private String care_from_user;
    private String notes_about_rescue;
    private String location;
    private String band;
    private String disposition;
    private String case_year;

    public Patient() {}

    public Patient(Integer reference_number, Integer microchip_number,
                   String species_name, Integer number_of_patients, Integer rescuer_id, String rescuer_notes, Integer donation_id,
                   String admitted_by, String transported_by, String address_found, String city_found,
                   String state_found, String county_found, String date_found, String reason, String care_from_user,
                   String notes_about_rescue, String location, String band, String disposition,
                   String case_year) {

        this.reference_number = reference_number;
        this.microchip_number = microchip_number;
        this.species_name = species_name;
        this.number_of_patients = number_of_patients;
        this.rescuer_id = rescuer_id;
        this.rescuer_notes = rescuer_notes;
        this.donation_id = donation_id;
        this.admitted_by = admitted_by;
        this.transported_by = transported_by;
        this.address_found = address_found;
        this.city_found = city_found;
        this.state_found = state_found;
        this.county_found = county_found;
        this.date_found = date_found;
        this.reason = reason;
        this.care_from_user = care_from_user;
        this.notes_about_rescue = notes_about_rescue;
        this.location = location;
        this.band = band;
        this.disposition = disposition;
        this.case_year = case_year;
    }

    public int getId() {
        return id;
    }

    public String getDate_admitted() {
        return date_admitted;
    }

    public Integer getReference_number() {
        return reference_number;
    }

    public void setReference_number(Integer reference_number) {
        this.reference_number = reference_number;
    }

    public Integer getMicrochip_number() {
        return microchip_number;
    }

    public void setMicrochip_number(Integer microchip_number) {
        this.microchip_number = microchip_number;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public Integer getNumber_of_patients() {
        return number_of_patients;
    }

    public void setNumber_of_patients(Integer number_of_patients) {
        this.number_of_patients = number_of_patients;
    }

    public Integer getRescuer_id() {
        return rescuer_id;
    }

    public void setRescuer_id(Integer rescuer_id) {
        this.rescuer_id = rescuer_id;
    }

    public String getRescuer_notes() {
        return rescuer_notes;
    }

    public void setRescuer_notes(String rescuer_notes) {
        this.rescuer_notes = rescuer_notes;
    }

    public Integer getDonation_id() {
        return donation_id;
    }

    public void setDonation_id(Integer donation_id) {
        this.donation_id = donation_id;
    }

    public String getAdmitted_by() {
        return admitted_by;
    }

    public void setAdmitted_by(String admitted_by) {
        this.admitted_by = admitted_by;
    }

    public String getTransported_by() {
        return transported_by;
    }

    public void setTransported_by(String transported_by) {
        this.transported_by = transported_by;
    }

    public String getAddress_found() {
        return address_found;
    }

    public void setAddress_found(String address_found) {
        this.address_found = address_found;
    }

    public String getCity_found() {
        return city_found;
    }

    public void setCity_found(String city_found) {
        this.city_found = city_found;
    }

    public String getState_found() {
        return state_found;
    }

    public void setState_found(String state_found) {
        this.state_found = state_found;
    }

    public String getCounty_found() {
        return county_found;
    }

    public void setCounty_found(String county_found) {
        this.county_found = county_found;
    }

    public String getDate_found() {
        return date_found;
    }

    public void setDate_found(String date_found) {
        this.date_found = date_found;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCare_from_user() {
        return care_from_user;
    }

    public void setCare_from_user(String care_from_user) {
        this.care_from_user = care_from_user;
    }

    public String getNotes_about_rescue() {
        return notes_about_rescue;
    }

    public void setNotes_about_rescue(String notes_about_rescue) {
        this.notes_about_rescue = notes_about_rescue;
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

    public String getCase_year() {
        return case_year;
    }

    public void setCase_year(String case_year) {
        this.case_year = case_year;
    }
}