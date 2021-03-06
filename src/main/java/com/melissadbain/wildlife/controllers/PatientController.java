package com.melissadbain.wildlife.controllers;

import com.melissadbain.wildlife.models.data.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import com.melissadbain.wildlife.models.Patient;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("")
public class PatientController {

    @Autowired
    private PatientDao patientDao;

    @RequestMapping(value = "/")
    public String index(Model model) {

        model.addAttribute("title", "Demo Wildlife Rehabilitation Account");
        //model.addAttribute("patients", patientDao.findByReason("CBH"));
        model.addAttribute("patients", patientDao.findBySpeciesName("Pigeon"));

        return "index";
    }

    @RequestMapping(value = "patient")
    public String patientIndex(Model model) {

        model.addAttribute("title", "List All Patients");
        model.addAttribute("patients", patientDao.findAll());

        return "patient/index";
    }

    @RequestMapping(value = "patient/create", method = RequestMethod.GET)
    public String displayCreatePatientForm(Model model) {

        model.addAttribute("title", "New Patient");
        model.addAttribute(new Patient());

        return "patient/create";
    }

    @RequestMapping(value = "patient/create", method = RequestMethod.POST)
    public String processCreatePatientForm(@ModelAttribute @Valid Patient newPatient,
                                           Errors errors, Model model) {

        if (errors.hasErrors()) {

            model.addAttribute("title", "New Patient");

            return "patient/create";
        }

        patientDao.save(newPatient);

        return "redirect:";
    }

    @RequestMapping(value = "patient/view/{patientId}", method = RequestMethod.GET)
    public String viewPatient(Model model, @PathVariable int patientId) {

        Patient patient = patientDao.findOne(patientId);

        model.addAttribute("patient", patient);
        model.addAttribute("patientId", patient.getId());

        return "patient/view";
    }

    @RequestMapping(value="patient/edit/{patientId}", method = RequestMethod.GET)
    public String displayEditPatientForm(Model model, @PathVariable int patientId) {

        Patient editedPatient = patientDao.findOne(patientId);

        model.addAttribute("title", "Edit - " + editedPatient.getId());
        model.addAttribute("patient", editedPatient);

        return "patient/edit";

    }

    @RequestMapping(value="patient/edit/{patientId}", method = RequestMethod.POST)
    public String processEditPatientForm(Model model, @ModelAttribute @Valid Patient patient,
                                         @PathVariable int patientId, Errors errors) {

        Patient editedPatient = patientDao.findOne(patientId);

        if(errors.hasErrors()) {

            model.addAttribute("title", "Edit - " + editedPatient.getId());

            return "patient/edit";
        }

        // send back as json object and then save upsert with hibernate
        editedPatient.setCaseYear(patient.getCaseYear());
        editedPatient.setSpeciesName(patient.getSpeciesName());
        editedPatient.setReferenceNumber(patient.getReferenceNumber());
        editedPatient.setMicrochipNumber(patient.getMicrochipNumber());
        editedPatient.setNumberOfPatients(patient.getNumberOfPatients());
        editedPatient.setRescuerId(patient.getRescuerId());
        editedPatient.setRescuerNotes(patient.getRescuerNotes());
        editedPatient.setDonationId(patient.getDonationId());
        editedPatient.setAdmittedBy(patient.getAdmittedBy());
        editedPatient.setTransportedBy(patient.getTransportedBy());
        editedPatient.setAddressFound(patient.getAddressFound());
        editedPatient.setCityFound(patient.getCityFound());
        editedPatient.setStateFound(patient.getStateFound());
        editedPatient.setCountyFound(patient.getCountyFound());
        editedPatient.setDateFound(patient.getDateFound());
        editedPatient.setReason(patient.getReason());
        editedPatient.setCareFromUser(patient.getCareFromUser());
        editedPatient.setNotesAboutRescue(patient.getNotesAboutRescue());
        editedPatient.setLocation(patient.getLocation());
        editedPatient.setBand(patient.getBand());
        editedPatient.setDisposition(patient.getDisposition());

        patientDao.save(editedPatient);

        return "redirect:/patient";
    }
}