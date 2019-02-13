package com.melissadbain.wildlife.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Donation {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "patient_id")
    private Integer patientId;
    private String method;
    private String value;
    private String comments;
    @Column(name = "date_entered")
    private String dateEntered;

    public Donation() {}

    public Donation(Integer patientId, String method, String value, String comments, String dateEntered) {

        this.patientId = patientId;
        this.method = method;
        this.value = value;
        this.comments = comments;
        this.dateEntered = dateEntered;
    }

    public int getId() {
        return id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(String dateEntered) {
        this.dateEntered = dateEntered;
    }
}