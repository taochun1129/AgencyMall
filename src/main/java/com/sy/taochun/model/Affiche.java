package com.sy.taochun.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 公告表(Affiche)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:19:44
 */
@Entity
@Table(name = "affiche")
public class Affiche implements Serializable {
    private static final long serialVersionUID = -97820830490460389L;
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
     * 发布人
     */
    private String publisher;
    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy年MM月dd日")
    private Date publishtime;
    /**
     * 生效时间
     */
    @JsonFormat(pattern = "yyyy年MM月dd日")
    private Date starttime;
    /**
     * 失效时间
     */
    @JsonFormat(pattern = "yyyy年MM月dd日")
    private Date endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

}