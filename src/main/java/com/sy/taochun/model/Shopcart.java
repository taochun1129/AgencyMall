package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购物车(Shopcart)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:58
 */
@Entity
@Table(name = "shopcart")
public class Shopcart implements Serializable {
    private static final long serialVersionUID = -64328770371074509L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 关联用户名
     */
    private Integer userid;
    /**
     * 购物车中商品总价
     */
    private Double totalprice;
    /**
     * 创建人,读自用户表
     */
    private String createby;
    /**
     * 最后修改时间
     */
    private Date lastupdatetime;
    /**
     * 创建时间
     */
    private Date createtime;

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

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}