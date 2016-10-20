package com.htcinc.entity;

/**
 * Created by sudhishk on 20/10/16.
 */
public class Item {

    private Integer id;
    private String content;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
