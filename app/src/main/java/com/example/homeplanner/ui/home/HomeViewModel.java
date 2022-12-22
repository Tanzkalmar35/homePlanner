package com.example.homeplanner.ui.home;

import static android.provider.Settings.Global.getString;

import android.content.res.Resources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.homeplanner.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

     

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}