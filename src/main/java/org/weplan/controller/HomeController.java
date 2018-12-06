package org.weplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.weplan.mapper.PlanMapper;
import org.weplan.mapper.PlanSortMapper;
import org.weplan.mapper.UserMapper;
import org.weplan.model.Plan;
import org.weplan.model.PlanSort;
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
	
	@Autowired
	private PlanSortMapper planSortMapper;
	
	@ApiOperation("新增计划")
	@RequestMapping(value="/plan", method=RequestMethod.POST)
	public Plan insertPlan(@RequestBody Plan plan) throws Exception {
		
		planMapper.insertSelective(plan);
		insertPlanSort(plan.getId(), plan.getUserId());
		return plan;
	}
	
	public int insertPlanSort(int planId, int userId) throws Exception {
		int order = planSortMapper.selectMaxOrderByUserId(userId) + 1024;
		
		PlanSort planSort = new PlanSort();
		planSort.setPlanId(planId);
		planSort.setSort(order);
		planSortMapper.insertSelective(planSort);
		
		return 0;
	}
	
	@ApiOperation("新增用户")
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User insertUser(@RequestBody User user) throws Exception {
		
		userMapper.insertSelective(user);
		return user;
	}
	
	@ApiOperation("计划排序")
	@RequestMapping(value="/plansort/{planId}", method=RequestMethod.POST)
	public PlanSort updatePlanSort(@PathVariable int planId, @RequestBody PlanSort planSort) throws Exception {
		
		planSortMapper.updateByPlanId(planSort);
		return planSort;
	}
}