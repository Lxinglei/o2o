package cn.meteor.o2o.entity;

import java.io.Serializable;
import java.util.Date;

public class WechatAuth implements Serializable {

    //主键
    private Long weChatAuthId;

    //微信openId
    private String openId;

    //创建时间
    private Date createTime;

    //关联用户
    private PersonInfo peronInfo;

    public Long getWeChatAuthId() {
        return weChatAuthId;
    }

    public void setWeChatAuthId(Long weChatAuthId) {
        this.weChatAuthId = weChatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPeronInfo() {
        return peronInfo;
    }

    public void setPeronInfo(PersonInfo peronInfo) {
        this.peronInfo = peronInfo;
    }
}
