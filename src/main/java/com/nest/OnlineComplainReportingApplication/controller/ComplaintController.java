package com.nest.OnlineComplainReportingApplication.controller;

import com.nest.OnlineComplainReportingApplication.dao.ComplainDao;
import com.nest.OnlineComplainReportingApplication.model.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @CrossOrigin(origins = "*")
    @PostMapping("/viewcomplaint")
    public List<Complaint> viewComplaint(@RequestBody Complaint c){
       return (List<Complaint>)dao.ViewComplain(c.getUserid());


    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewallcomplaint")
    public List<Map<String,String>>viewallComplaint(){
        return(List<Map<String,String>>)dao.viewallcomplains();


    }

}
