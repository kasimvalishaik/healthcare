package com.slokam.healthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Complaint;
@Repository
public interface ComplaintDao extends JpaRepository<Complaint, Long> {

}
