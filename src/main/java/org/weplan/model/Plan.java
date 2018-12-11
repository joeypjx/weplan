package org.weplan.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Plan {
    private Integer id;

    private Integer userId;

    private Byte state;

    private String title;

    private String detail;

    private Byte dateType;

    private Date startDate;

    private Date dueDate;

    private Date startTime;

    private Date dueTime;

    private String recurrence;

    private Byte flag;

    private Byte importance;

    private Byte stick;

    private Integer projectId;

    private Integer tagId;

    private Date reminder;

    private String scene;

    private String members;

    private Date createTime;

    private Date updateTime;
    
    public Plan(Integer id, Integer userId, Byte state, String title, String detail, Byte dateType, Date startDate, Date dueDate, Date startTime, Date dueTime, String recurrence, Byte flag, Byte importance, Byte stick, Integer projectId, Integer tagId, Date reminder, String scene, String members, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.state = state;
        this.title = title;
        this.detail = detail;
        this.dateType = dateType;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.startTime = startTime;
        this.dueTime = dueTime;
        this.recurrence = recurrence;
        this.flag = flag;
        this.importance = importance;
        this.stick = stick;
        this.projectId = projectId;
        this.tagId = tagId;
        this.reminder = reminder;
        this.scene = scene;
        this.members = members;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    
    public Plan() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Byte getDateType() {
        return dateType;
    }

    public void setDateType(Byte dateType) {
        this.dateType = dateType;
    }

    @JsonFormat(pattern="YYYY-MM-dd")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @JsonFormat(pattern="YYYY-MM-dd")
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @JsonFormat(pattern="HH:mm")
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonFormat(pattern="HH:mm")
    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence == null ? null : recurrence.trim();
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public Byte getImportance() {
        return importance;
    }

    public void setImportance(Byte importance) {
        this.importance = importance;
    }

    public Byte getStick() {
        return stick;
    }

    public void setStick(Byte stick) {
        this.stick = stick;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Date getReminder() {
        return reminder;
    }

    public void setReminder(Date reminder) {
        this.reminder = reminder;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members == null ? null : members.trim();
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