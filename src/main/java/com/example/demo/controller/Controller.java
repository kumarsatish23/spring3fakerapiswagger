package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.binding.CompanyDTLS;
import com.example.demo.service.Service;

@RestController
public class Controller {
	@Autowired
	private Service service;

	@GetMapping("/dtls")
	public List<CompanyDTLS> getDetails() {
		return service.getDTLS();
	}
}