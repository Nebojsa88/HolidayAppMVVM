package com.radanov.holidayappmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.radanov.holidayappmvvm.R;
import com.radanov.holidayappmvvm.adapter.HolidayAdapter;
import com.radanov.holidayappmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    final String TAG = getClass().getSimpleName();

    ActivityMainBinding binding;
    HolidayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.rvHolidayListing.setHasFixedSize(true);

    }
}