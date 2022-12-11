package com.nest.OnlineComplainReportingApplication.dao;

import com.nest.OnlineComplainReportingApplication.model.Complaint;
import com.nest.OnlineComplainReportingApplication.model.Report;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ComplainDao extends CrudRepository<Complaint, Integer> {

    @Query(value = "SELECT `id`, `complaints`, `userid` FROM `complaints` WHERE `userid`= :userid",nativeQuery = true)
    List<Complaint> ViewComplain(@Param("userid")Integer userid);

    @Query(value = "SELECT  u.`address`, u.`email`, u.`name`, u.`phoneno`, u.`username`,c.complaints FROM `usersignup` u JOIN complaints c ON u.id=c.userid",nativeQuery = true)
    List<Map<String,String>>viewallcomplains();
}
