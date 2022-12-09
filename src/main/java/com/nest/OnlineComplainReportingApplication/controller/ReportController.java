package com.nest.OnlineComplainReportingApplication.controller;

import com.nest.OnlineComplainReportingApplication.model.Report;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/usersignup",produces = "application/json",consumes = "application/json")
    public String userSignup(@RequestBody Report r){
        System.out.println(r.getName());
        return "signup working";
    }
}
