package org.weplan.mapper;

import java.util.HashMap;
import java.util.List;

import org.weplan.model.Plan;

public interface PlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Plan record);

    int insertSelective(Plan record);

    Plan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);
    
    List<Plan> selectByUserId(HashMap<String, Object> map);
}