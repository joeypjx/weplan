package org.weplan.model;

import java.util.Date;

public class PlanSort {
    private Integer id;

    private Integer planId;

    private Integer sort;

    private Date createTime;

    private Date updateTime;

    public PlanSort(Integer id, Integer planId, Integer sort, Date createTime, Date updateTime) {
        this.id = id;
        this.planId = planId;
        this.sort = sort;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public PlanSort() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}