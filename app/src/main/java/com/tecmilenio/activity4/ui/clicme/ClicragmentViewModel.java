package com.tecmilenio.activity4.ui.clicme;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClicragmentViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;
    public ClicragmentViewModel(){
        mText = new MutableLiveData<>();mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {    return mText;}

}