package com.companyname.loginpage;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {

    private static Retrofit retrofit;
    private static Retrofit getInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl("https://demo.e-sadad.com:9090/tomcat/")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

    public static ApInterface getApi(){
        ApInterface api = getInstance().create(ApInterface.class);
        return api;
    }
}
