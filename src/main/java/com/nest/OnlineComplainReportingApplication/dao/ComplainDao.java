package com.nest.OnlineComplainReportingApplication.dao;

import com.nest.OnlineComplainReportingApplication.model.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface ComplainDao extends CrudRepository<Complaint, Integer> {
}
