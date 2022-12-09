package com.nest.OnlineComplainReportingApplication.dao;

import com.nest.OnlineComplainReportingApplication.model.Report;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<Report, Integer> {

    @Query(value = "SELECT * FROM `usersignup` WHERE `username`= :username AND `password`= :password",nativeQuery = true)
    List<Report>UserLogin(@Param("username")String username,@Param("password")String password);

    @Query(value = "SELECT `id`, `address`, `email`, `name`, `password`, `phoneno`, `username` FROM `usersignup` WHERE `id`=:id",nativeQuery = true)
    List<Report>ViewProfile(@Param("id")Integer id);
}
