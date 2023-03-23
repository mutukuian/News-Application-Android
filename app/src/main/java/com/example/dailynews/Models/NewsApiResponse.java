package com.example.dailynews.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    String status;
    int totalResult;
    List<NewsHeadLines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public List<NewsHeadLines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsHeadLines> articles) {
        this.articles = articles;
    }
}
