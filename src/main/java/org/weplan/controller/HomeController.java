package org.weplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.weplan.mapper.PlanMapper;
import org.weplan.mapper.UserMapper;
import org.weplan.model.Plan;
import org.weplan.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("计划管理")
@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private PlanMapper planMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@ApiOperation("新增计划")
	@RequestMapping(value="/plan", method=RequestMethod.POST)
	public Plan insertPlan(@RequestBody Plan plan) throws Exception {
		
		planMapper.insertSelective(plan);
		return plan;
	}
	
	@ApiOperation("新增用户")
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User insertUser(@RequestBody User user) throws Exception {
		
		userMapper.insertSelective(user);
		return user;
	}
}