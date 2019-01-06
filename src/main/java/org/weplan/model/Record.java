package org.weplan.model;

import java.util.Date;

public class Record {
    private Integer id;

    private Integer planId;

    private Date recordTime;

    private Date createTime;

    private Date updateTime;

    public Record(Integer id, Integer planId, Date recordTime, Date createTime, Date updateTime) {
        this.id = id;
        this.planId = planId;
        this.recordTime = recordTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Record() {
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

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
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