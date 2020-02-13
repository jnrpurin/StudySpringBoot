package com.example.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SampleEg;
import com.example.demo.model.SampleResponse;

@RestController
public class WebController {

	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "name",
	defaultValue = "Robot") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is "+name);
		return response;

	}
	
	@RequestMapping("/eg")
	public SampleEg SampleEgRequest(@RequestParam(value = "value",
	defaultValue = "Nao informou valor") Optional<String> name) {
		SampleEg response = new SampleEg();
		response.setId(9);
		Optional<String> ret = Optional.ofNullable("Valor informado!!!"+name); 
		response.setMessage(ret);
		return response;

	}	
}