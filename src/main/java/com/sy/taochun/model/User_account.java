package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 金钱账户表(User_account)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:59
 */
@Entity
@Table(name = "user_account")
public class User_account implements Serializable {
    private static final long serialVersionUID = 338723796874604562L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 关联用户表
     */
    private Integer userid;
    /**
     * 账户余额
     */
    private Double balance;

    private Date createtime;

    private Date lastupdatetime;

    private String createby;
    /**
     * 0锁定,1锁定
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}