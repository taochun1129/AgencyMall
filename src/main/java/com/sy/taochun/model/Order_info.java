package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(Order_info)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:56
 */
@Entity
@Table(name = "Order_info")
public class Order_info implements Serializable {
    private static final long serialVersionUID = -49184553296365958L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 订单编号
     */
    private String ordercode;
    /**
     * 订单总价
     */
    private Double orderprice;
    /**
     * 订单时间
     */
    private Date createtime;
    /**
     * 创建者
     */
    private String createby;
    /**
     * 修改时间
     */
    private Date lastupdatetime;
    /**
     * 1已支付,0失效订单,2未支付
     */
    private Integer status;
    /**
     * 关联用户表
     */
    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

}