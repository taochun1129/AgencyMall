package com.sy.taochun.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 咨讯表(Information)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:53
 */
@Entity
@Table(name = "information")
public class Information implements Serializable {
    private static final long serialVersionUID = 536817109541561300L;
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 发布状态（0、未发布 1、发布）默认为发布
     */
    private Integer state;
    /**
     * 发布人
     */
    private String publisher;
    /**
     * 发布时间
     */
    private Date publishtime;
    /**
     * 附件类型ID
     */
    private Integer typeid;
    /**
     * 附件类型NAME
     */
    private String typename;
    /**
     * 附件名称
     */
    private String filename;
    /**
     * 附件存放路径
     */
    private String filepath;
    /**
     * 附件大小
     */
    private Double filesize;
    /**
     * 上传时间
     */
    private Date uploadtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFilesize(Double filesize) {
        this.filesize = filesize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Double getFilesize() {
        return filesize;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

}