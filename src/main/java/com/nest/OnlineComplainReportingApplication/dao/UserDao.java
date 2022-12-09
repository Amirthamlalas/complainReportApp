package com.nest.OnlineComplainReportingApplication.dao;

import com.nest.OnlineComplainReportingApplication.model.Report;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<Report, Integer> {


}
