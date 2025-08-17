package com.intelligent_web_indexer.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Information {

    @Id
    private Long Id;
    @Column(length = 100)
    private  String URL;
    @Column(length = 100)
    private String Content;
    @Column(length = 100)
    private String Summary;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }
    public Information() {}
    public Information(Long id, String url, String content, String summary) {
        this.Id = id;
        this.URL = url;
        this.Content = content;
        this.Summary = summary;
    }

}
