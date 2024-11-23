package com.RestAPIdemo.RestAPI.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.RestAPIdemo.RestAPI.Exception.UserNotFoundException;
import com.RestAPIdemo.RestAPI.Exception.fligtException;
import com.RestAPIdemo.RestAPI.Model.flightDetails;
import com.RestAPIdemo.RestAPI.Repositry.flightRepo;

@Service
public class flightService {
	
	 @Autowired
	 flightRepo flightRepo;


	@CachePut(cacheNames = "flightUpdate" , key = "#flight.flightId" )
	public String saveFlight(flightDetails flight) {
		 flightRepo.save(flight);
		return "Successed";
	 }
	
	@Cacheable(cacheNames = "flight" , key = "#flightId")		
	public flightDetails getflightdetails(long flightId) throws UserNotFoundException {
		//flightRepo.findById(flightId).isEmpty()
		if(flightRepo.findById(flightId).isEmpty()) {
			throw new UserNotFoundException(" Invalid Flight Detailss ");
		}
		return flightRepo.findById(flightId).get();
	 }

	@CacheEvict(cacheNames = "flightDelete" , key = "#id")
	public String deleteFlight(long id) {
		 flightRepo.deleteById(id);
		return "Successed";
	}



}
