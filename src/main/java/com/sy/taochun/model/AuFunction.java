package com.sy.taochun.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 权限表(AuFunction)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:47
 */
@Entity
@Table(name = "au_function")
public class AuFunction implements Serializable {
    private static final long serialVersionUID = -17978035376980046L;
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 功能编码
     */
    private String funccode;
    /**
     * 功能名称
     */
    private String funcname;
    /**
     * 功能URL
     */
    private String funcurl;

    private Integer parentid;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy年MM月dd日")
    private Date creationtime;

    public Integer getId() {
        return id;
    }

    public String getFunccode() {
        return funccode;
    }

    public void setFunccode(String funccode) {
        this.funccode = funccode;
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname;
    }

    public String getFuncurl() {
        return funcurl;
    }

    public void setFuncurl(String funcurl) {
        this.funcurl = funcurl;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

}