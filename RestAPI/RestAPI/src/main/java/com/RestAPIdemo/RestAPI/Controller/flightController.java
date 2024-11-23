package com.RestAPIdemo.RestAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.RestAPIdemo.RestAPI.Exception.UserNotFoundException;
import com.RestAPIdemo.RestAPI.Model.flightDetails;
import com.RestAPIdemo.RestAPI.ServiceImpl.flightService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/flightcontrols")
public class flightController {
	
	@Autowired
	flightService flightService;
	
    @RequestMapping("/welcome")
    @ResponseBody
	public String flight() {
		return "hello world";
	}
    
    @PostMapping("/saveFlight")
    public String saveFlight ( @RequestBody @Valid flightDetails flightdetails) {
		return flightService.saveFlight(flightdetails);
    }

    @GetMapping("/getFlight/{id}")
    public flightDetails getflight(@PathVariable long id) throws UserNotFoundException {
		return flightService.getflightdetails(id);
    	
    }
    
    @DeleteMapping("/deleteFlight/{id}")
    public String deleteflight(@PathVariable long id) {
		return flightService.deleteFlight(id);
    	
    }
	
    @GetMapping("/viewsas")
    public ModelAndView returnmodelandvie() {
    	
    	ModelAndView model = new ModelAndView("views");
    	model.addObject("message", "The view can be  return successfully");
    	return model;
    }
}
