package org.weplan.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.weplan.model.Plan;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.POST)
	public Plan home(@RequestBody Plan plan) {
		return plan;
	}
}