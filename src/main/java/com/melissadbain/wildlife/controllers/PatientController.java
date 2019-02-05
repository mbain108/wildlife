package com.melissadbain.wildlife.controllers;

import com.melissadbain.wildlife.models.data.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import com.melissadbain.wildlife.models.Patient;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class PatientController {

    @Autowired
    private PatientDao patientDao;


    @RequestMapping(value = "/")
    public String index(Model model) {

        model.addAttribute("title", "Demo Wildlife Rehabilitation Account");
        model.addAttribute("patients", patientDao.findAll());

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

        editedPatient.setCase_year(patient.getCase_year());
        editedPatient.setSpecies_name(patient.getSpecies_name());
        editedPatient.setReference_number(patient.getReference_number());
        editedPatient.setMicrochip_number(patient.getMicrochip_number());
        editedPatient.setNumber_of_patients(patient.getNumber_of_patients());
        editedPatient.setRescuer_id(patient.getRescuer_id());
        editedPatient.setRescuer_notes(patient.getRescuer_notes());
        editedPatient.setDonation_id(patient.getDonation_id());
        editedPatient.setAdmitted_by(patient.getAdmitted_by());
        editedPatient.setTransported_by(patient.getTransported_by());
        editedPatient.setAddress_found(patient.getAddress_found());
        editedPatient.setCity_found(patient.getCity_found());
        editedPatient.setState_found(patient.getState_found());
        editedPatient.setCounty_found(patient.getCounty_found());
        editedPatient.setDate_found(patient.getDate_found());
        editedPatient.setReason(patient.getReason());
        editedPatient.setCare_from_user(patient.getCare_from_user());
        editedPatient.setNotes_about_rescue(patient.getNotes_about_rescue());
        editedPatient.setLocation(patient.getLocation());
        editedPatient.setBand(patient.getBand());
        editedPatient.setDisposition(patient.getDisposition());

        patientDao.save(editedPatient);

        return "redirect:/patient";
    }
}