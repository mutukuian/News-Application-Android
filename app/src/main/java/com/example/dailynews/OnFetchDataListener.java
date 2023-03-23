package com.example.dailynews;

import com.example.dailynews.Models.NewsHeadLines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadLines> list,String message);
    void onError(String message);
}
