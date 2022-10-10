package com.marketing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.Service.LeadService;
import com.marketing.entities.Lead;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;

	
	@RequestMapping("/CreateLead")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	@RequestMapping("/saveLead")
	private String saveOneLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("msg", "Lead is saved!!");
		return "create_lead";
	}

	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads =leadService.listLeads();
		model.addAttribute("leads", leads);
		return "lead_search_result";
		
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id, ModelMap model) {
		leadService.deleteLeadById(id);
		
		List<Lead> leads =leadService.listLeads();
		model.addAttribute("leads", leads);
		return "lead_search_result";
		
	}
	@RequestMapping("/update")
	public String upateOneLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		
		return "update_lead";
	}
}
