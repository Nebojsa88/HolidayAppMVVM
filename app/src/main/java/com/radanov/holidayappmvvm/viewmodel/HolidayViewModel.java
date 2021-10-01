package com.radanov.holidayappmvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.radanov.holidayappmvvm.model.HolidayModel;
import com.radanov.holidayappmvvm.repo.HolidayRepo;

import java.util.List;

public class HolidayViewModel extends ViewModel {

    private HolidayRepo holidayRepo;
    private MutableLiveData<List<HolidayModel>> mutableLiveData;

    public HolidayViewModel(HolidayRepo holidayRepo) {
        this.holidayRepo = holidayRepo;
    }

    public LiveData<List<HolidayModel>> getHolidays(){

            if(mutableLiveData == null){
                mutableLiveData = holidayRepo.requestHolidays();
            }
        return mutableLiveData;
    }

}
