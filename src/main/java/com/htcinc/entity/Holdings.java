package com.htcinc.entity;

import java.util.List;

/**
 * Created by peris on 10/19/16.
 */
public class Holdings {

    private Integer id;

    private String content;

    private List<Item> item;

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public List<Item> getItem() {
        return item;
    }
}
