package com.melissadbain.wildlife.controllers;

import com.melissadbain.wildlife.models.data.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("patient")
public class PatientController {

    @Autowired
    private PatientDao patientDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("patients", patientDao.findAll());
        model.addAttribute("title", "List All Patients");

        return "patient/index";
    }
}