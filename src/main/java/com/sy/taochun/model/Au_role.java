package com.sy.taochun.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色表(Au_role)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:48
 */
@Entity
@Table(name = "au_role")
public class Au_role implements Serializable {
    private static final long serialVersionUID = -99176805028935137L;
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 角色编码
     */
    private String rolecode;
    /**
     * 角色名称
     */
    private String rolename;
    /**
     * 创建日期
     */
    @JsonFormat(pattern = "yyyy年MM月dd日")
    private Date createdate;
    /**
     * 是否启用（0、未启用1、启用）
     */
    private Integer isstart;
    /**
     * 创建者
     */
    private String createby;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getIsstart() {
        return isstart;
    }

    public void setIsstart(Integer isstart) {
        this.isstart = isstart;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

}