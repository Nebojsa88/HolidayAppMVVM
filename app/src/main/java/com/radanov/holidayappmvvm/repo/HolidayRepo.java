package com.radanov.holidayappmvvm.repo;

import androidx.lifecycle.MutableLiveData;

import com.radanov.holidayappmvvm.model.HolidayModel;
import com.radanov.holidayappmvvm.retrofit.ApiInterface;
import com.radanov.holidayappmvvm.retrofit.RetrofitUtility;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HolidayRepo {

    private final String TAG = getClass().getSimpleName();

    public MutableLiveData<List<HolidayModel>> requestHolidays(){

            final MutableLiveData<List<HolidayModel>> mutableLiveData = new MutableLiveData<>();

        ApiInterface apiService = RetrofitUtility.getRetrofitClient().create(ApiInterface.class);
        apiService.getHolidays().enqueue(new Callback<List<HolidayModel>>() {
            @Override
            public void onResponse(Call<List<HolidayModel>> call, Response<List<HolidayModel>> response) {

                if(response.isSuccessful() && response.body() != null){
                    mutableLiveData.setValue(response.body());
                }

            }
            @Override
            public void onFailure(Call<List<HolidayModel>> call, Throwable t) {



            }
        });
        return mutableLiveData;

    }

}
