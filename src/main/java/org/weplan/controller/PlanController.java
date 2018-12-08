package org.weplan.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.weplan.mapper.PlanMapper;
import org.weplan.mapper.PlanSortMapper;
import org.weplan.model.Plan;
import org.weplan.model.PlanSort;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("计划管理")
@RestController
@RequestMapping("/")
public class PlanController {
	
	@Autowired
	private PlanMapper planMapper;
	
	@Autowired
	private PlanSortMapper planSortMapper;
	
	@ApiOperation("新增计划")
	@RequestMapping(value="/plan", method=RequestMethod.POST)
	public Plan insertPlan(@RequestBody Plan plan) throws Exception {
		
		planMapper.insertSelective(plan);
		insertPlanSort(plan.getId(), plan.getUserId());
		return plan;
	}
	
	@ApiOperation("计划列表")
	@RequestMapping(value="/plans", method=RequestMethod.GET)
	public List<Plan> selectPlansByUserId(@RequestParam int userId, @RequestParam int state) {
		HashMap<String, Object> map= new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("state", state);
		List<Plan> plans = planMapper.selectByUserId(map);//sort排序
		return plans;
	}
	
	@ApiOperation("查询计划")
	@RequestMapping(value="/plan/{id}", method=RequestMethod.GET)
	public Plan selectPlan(@PathVariable int id) {
		Plan plan = planMapper.selectByPrimaryKey(id);
		return plan;
	}
	
	@ApiOperation("修改计划")
	@RequestMapping(value="/plan", method=RequestMethod.PUT)
	public int updatePlan(@RequestBody Plan plan) {
		planMapper.updateByPrimaryKeySelective(plan);
		return 0;
	}
	
	@ApiOperation("计划排序")
	@RequestMapping(value="/plansort/{planId}", method=RequestMethod.POST)
	public PlanSort updatePlanSort(@PathVariable int planId, @RequestBody PlanSort planSort) throws Exception {
		
		planSortMapper.updateByPlanId(planSort);
		return planSort;
	}
	
	private int insertPlanSort(int planId, int userId) throws Exception {
		int order = planSortMapper.selectMaxOrderByUserId(userId) + 1024;
		
		PlanSort planSort = new PlanSort();
		planSort.setPlanId(planId);
		planSort.setSort(order);
		planSortMapper.insertSelective(planSort);
		
		return 0;
	}
}