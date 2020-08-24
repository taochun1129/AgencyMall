package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购买会员订单明细表(Order_user)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:56
 */
@Entity
@Table(name = "order_user")
public class Order_user implements Serializable {
    private static final long serialVersionUID = 413027294791539643L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 关联订单表
     */
    private Integer orderinfoid;
    /**
     * 会员类型
     */
    private String rolename;
    /**
     * 会员价格
     */
    private Double roleprice;
    /**
     * 关联角色表
     */
    private Integer roleid;

    private String createby;

    private Date createdatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderinfoid() {
        return orderinfoid;
    }

    public void setOrderinfoid(Integer orderinfoid) {
        this.orderinfoid = orderinfoid;
    }

    public void setRoleprice(Double roleprice) {
        this.roleprice = roleprice;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Object getRoleprice() {
        return roleprice;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

}