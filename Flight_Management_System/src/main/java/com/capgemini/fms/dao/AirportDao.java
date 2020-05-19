package com.capgemini.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.fms.entity.Airport;

@Repository
public interface AirportDao extends JpaRepository<Airport, String> {

}