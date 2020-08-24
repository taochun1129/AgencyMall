package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购买商品订单明细表(Order_goods)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:55
 */
@Entity
@Table(name = "order_goods")
public class Order_goods implements Serializable {
    private static final long serialVersionUID = -94958248240272217L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 商品编号,关联商品表
     */
    private Integer goodsid;
    /**
     * 商品名字
     */
    private String goodsname;
    /**
     * 商品价格
     */
    private Double goodsprice;
    /**
     * 商品数量
     */
    private Integer goodsnum;
    /**
     * 创建人
     */
    private String createby;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 修改时间
     */
    private Date lastupdatetime;
    /**
     * 关联订单表
     */
    private Integer orderinfoid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public void setOrderinfoid(Integer orderinfoid) {
        this.orderinfoid = orderinfoid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
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

    public Integer getOrderinfoid() {
        return orderinfoid;
    }

}