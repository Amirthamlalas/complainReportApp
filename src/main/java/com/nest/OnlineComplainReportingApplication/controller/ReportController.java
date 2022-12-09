package com.nest.OnlineComplainReportingApplication.controller;

import com.nest.OnlineComplainReportingApplication.dao.UserDao;
import com.nest.OnlineComplainReportingApplication.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ReportController {
@Autowired
private UserDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/usersignup",produces = "application/json",consumes = "application/json")
    public String userSignup(@RequestBody Report r){
        System.out.println(r.getName());
        dao.save(r);
        return "signup working";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin",produces = "application/json",consumes = "application/json")
    public HashMap<String, String> userLogin(@RequestBody Report r){
        System.out.println(r.getName());
        List<Report> result = (List<Report>) dao.UserLogin(r.getUsername(),r.getPassword());
        HashMap<String,String>map=new HashMap<>();
        if(result.size()==0){
            map.put("status","failed");
        }else {
            int id = result.get(0).getId();
            map.put("userid",String.valueOf(id));
            map.put("status","success");
        }
        return map;

    }
}
