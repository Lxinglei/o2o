package cn.meteor.o2o.entity;

import java.util.Date;

public class HealLine {

    //主键
    private Long lineId;

    //头条名称
    private String lineName;

    //头条链接
    private String lineLink;

    //头条图片
    private String lineImg;

    //头条优先级
    private Integer priority;

    //头条状态，0：不可用，1：可用
    private Integer enableStaus;

    //创建时间
    private Date create_time;

    //最近修改时间
    private Date last_edit_time;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineImg() {
        return lineImg;
    }

    public void setLineImg(String lineImg) {
        this.lineImg = lineImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStaus() {
        return enableStaus;
    }

    public void setEnableStaus(Integer enableStaus) {
        this.enableStaus = enableStaus;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_edit_time() {
        return last_edit_time;
    }

    public void setLast_edit_time(Date last_edit_time) {
        this.last_edit_time = last_edit_time;
    }
}
