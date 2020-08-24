package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * (Leave_reply)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:54
 */
@Entity
@Table(name = "leave_reply")
public class Leave_reply implements Serializable {
    private static final long serialVersionUID = -56955782554457892L;
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 留言ID（主表）
     */
    private Integer messageid;
    /**
     * 回复内容
     */
    private String replycontent;
    /**
     * 回复人
     */
    private String createdby;
    /**
     * 回复时间
     */
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}