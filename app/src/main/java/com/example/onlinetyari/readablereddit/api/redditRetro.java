package com.example.onlinetyari.readablereddit.api;

import com.example.onlinetyari.readablereddit.pojo.InitialData;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by Siddharth Verma on 24/4/16.
 */
public interface redditRetro {

    @GET
    Observable<InitialData> getData(
            @Url String url);
}