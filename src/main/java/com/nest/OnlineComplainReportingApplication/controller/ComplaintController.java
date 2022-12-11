package com.nest.OnlineComplainReportingApplication.controller;

import com.nest.OnlineComplainReportingApplication.dao.ComplainDao;
import com.nest.OnlineComplainReportingApplication.model.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ComplaintController {
    @Autowired
    private ComplainDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/complaint",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> addComplaint(@RequestBody Complaint c){
        dao.save(c);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

}
