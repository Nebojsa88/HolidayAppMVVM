package com.radanov.holidayappmvvm.retrofit;

import com.radanov.holidayappmvvm.model.HolidayModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/PublicHolidays/2021/us")
    Call<List<HolidayModel>> getHolidays();



}
