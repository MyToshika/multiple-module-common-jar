package com.mytoshik.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytoshika.JarAClass;
import com.mytoshika.JarBClass;

@RestController
public class RestServiceUser {
	
	@Autowired
	private JarAClass jarAClass;
	
	@Autowired
	private JarBClass jarBClass;

	@RequestMapping(value = "/testA", method = RequestMethod.GET)
	public String testA() {

		return "successMessage: accessed testA: "+ jarAClass.getData();
	}
	
	@RequestMapping(value = "/testB", method = RequestMethod.GET)
	public String testB() {

		return "successMessage: accessed testB: "+ jarBClass.getData();
	}

}
