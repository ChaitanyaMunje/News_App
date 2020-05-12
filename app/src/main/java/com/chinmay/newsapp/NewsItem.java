package com.chinmay.newsapp;

public class NewsItem {
    private String sectionName;
    private String webTitle;
    private String webUrl;
    private String webPublicationDate;

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getSectionName() {
        return sectionName;
    }


    public String getWebTitle() {
        return webTitle;
    }


    public String getWebUrl() {
        return webUrl;
    }


    public NewsItem(String sectionName, String webTitle, String webUrl, String webPublicationDate) {
        this.sectionName = sectionName;
        this.webTitle = webTitle;
        this.webUrl = webUrl;
        this.webPublicationDate=webPublicationDate;
    }



}
