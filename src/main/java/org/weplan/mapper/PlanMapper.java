package org.weplan.mapper;

import org.weplan.model.Plan;

public interface PlanMapper {

	public Plan findPlanById(int id) throws Exception;

	public void insertPlan(Plan plan) throws Exception;
}