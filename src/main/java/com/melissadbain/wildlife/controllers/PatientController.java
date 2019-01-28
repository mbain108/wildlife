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
@RequestMapping("patient")
public class PatientController {

    @Autowired
    private PatientDao patientDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "List All Patients");
        model.addAttribute("patients", patientDao.findAll());

        return "patient/index";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String displayCreatePatientForm(Model model) {

        model.addAttribute("title", "New Patient");
        model.addAttribute(new Patient());

        return "patient/create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String processCreatePatientForm(@ModelAttribute @Valid Patient newPatient,
                                           Errors errors, Model model) {

        if (errors.hasErrors()) {

            model.addAttribute("title", "New Patient");

            return "patient/create";
        }

        patientDao.save(newPatient);

        return "redirect:";
    }

    @RequestMapping(value = "view/{patientId}", method = RequestMethod.GET)
    public String viewPatient(Model model, @PathVariable int patientId) {

        Patient patient = patientDao.findOne(patientId);

        model.addAttribute("patient", patient);
        model.addAttribute("patientId", patient.getId());

        return "patient/view";
    }

    @RequestMapping(value="edit/{patientId}", method = RequestMethod.GET)
    public String displayEditPatientForm(Model model, @PathVariable int patientId) {

        Patient editedPatient = patientDao.findOne(patientId);

        model.addAttribute("title", "Edit - " + editedPatient.getId());
        model.addAttribute("patient", editedPatient);

        return "patient/edit";

    }

    @RequestMapping(value="edit/{patientId}", method = RequestMethod.POST)
    public String processEditPatientForm(Model model, @ModelAttribute @Valid Patient patient,
                                         @PathVariable int patientId, Errors errors) {

        Patient editedPatient = patientDao.findOne(patientId);

        if(errors.hasErrors()) {

            model.addAttribute("title", "Edit - " + editedPatient.getId());

            return "patient/edit";
        }

        editedPatient.setSpecies_name(patient.getSpecies_name());

        patientDao.save(editedPatient);

        return "redirect:/patient";
    }
}