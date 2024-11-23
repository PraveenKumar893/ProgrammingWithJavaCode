package com.RestAPIdemo.RestAPI.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestAPIdemo.RestAPI.Model.flightDetails;

public interface flightRepo extends JpaRepository<flightDetails, Long> {

}
