package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购物车中商品信息表(Cart_goods)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:50
 */
@Entity
@Table(name = "cart_goods")
public class Cart_goods implements Serializable {
    private static final long serialVersionUID = -91502314265198355L;

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
     * 购物车ID,关联购物车表
     */
    private Integer cartid;
    /**
     * 0表示无货,1表示有货
     */
    private Integer flag;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
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

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Integer getCartid() {
        return cartid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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

}