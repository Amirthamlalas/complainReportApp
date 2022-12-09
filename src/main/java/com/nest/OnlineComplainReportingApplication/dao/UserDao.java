package com.nest.OnlineComplainReportingApplication.dao;

import com.nest.OnlineComplainReportingApplication.model.Report;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<Report, Integer> {

    @Query(value = "SELECT * FROM `usersignup` WHERE `username`= :username AND `password`= :password",nativeQuery = true)
    List<Report>UserLogin(@Param("username")String username,@Param("password")String password);
}
