package com.companyname.loginpage;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApInterface {
    @POST("mfsuserfunctions/ChannelLogin")
    public Call<UserInfo> setData(@Body MainUserData mainUserData);
}
