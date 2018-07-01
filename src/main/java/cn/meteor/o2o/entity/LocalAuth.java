package cn.meteor.o2o.entity;

import java.io.Serializable;
import java.util.Date;

public class LocalAuth implements Serializable {

    //主键
    private Long localAuthId;

    //用户名
    private String username;

    //密码
    private String password;

    //创建时间
    private Date createTime;

    //最近更新时间
    private Date lastEditTime;

    //关联用户
    private PersonInfo peronInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public PersonInfo getPeronInfo() {
        return peronInfo;
    }

    public void setPeronInfo(PersonInfo peronInfo) {
        this.peronInfo = peronInfo;
    }
}