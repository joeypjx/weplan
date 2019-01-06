package org.weplan.model;

import java.util.Date;

public class Project {
    private Integer id;

    private Integer userId;

    private String title;

    private Byte color;

    private Byte icon;

    private String bannerUrl;

    private Date createTime;

    private Date updateTime;

    public Project(Integer id, Integer userId, String title, Byte color, Byte icon, String bannerUrl, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.color = color;
        this.icon = icon;
        this.bannerUrl = bannerUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Project() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getColor() {
        return color;
    }

    public void setColor(Byte color) {
        this.color = color;
    }

    public Byte getIcon() {
        return icon;
    }

    public void setIcon(Byte icon) {
        this.icon = icon;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
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