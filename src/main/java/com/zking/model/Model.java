package com.zking.model;

public class Model {
    private String id;

    private String pid;

    private String text;

    private String url;

    public Model(String id, String pid, String text, String url) {
        this.id = id;
        this.pid = pid;
        this.text = text;
        this.url = url;
    }

    public Model() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}