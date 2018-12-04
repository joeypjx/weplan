package org.weplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.weplan.mapper.PlanMapper;
import org.weplan.model.Plan;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private PlanMapper planMapper;
	
	@RequestMapping(method=RequestMethod.POST)
	public Plan home(@RequestBody Plan plan) throws Exception {
		
		planMapper.insertSelective(plan);
		return plan;
	}
}