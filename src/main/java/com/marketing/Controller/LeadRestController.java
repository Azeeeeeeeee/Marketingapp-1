package com.marketing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.Service.LeadService;
import com.marketing.entities.Lead;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	private LeadService leadService;
	
	
	@GetMapping
	public List<Lead> getAllLeads(){
		List<Lead> listLeads = leadService.listLeads();
		return  leads;
	}
}
