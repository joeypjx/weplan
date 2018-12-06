package org.weplan.mapper;

import org.weplan.model.PlanSort;

public interface PlanSortMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlanSort record);

    int insertSelective(PlanSort record);

    PlanSort selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlanSort record);

    int updateByPrimaryKey(PlanSort record);
    
    int updateByPlanId(PlanSort record);
    
    int selectMaxOrderByUserId(int userId);
}