package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class ShoeListViewModel: ViewModel() {

    private val _shoes = MutableLiveData<MutableList<Shoe>>()
    val shoes: LiveData<MutableList<Shoe>>
        get() = _shoes

    init {
        Timber.i("ViewModel Lyfecycle started.")
    }



    override fun onCleared() {
        super.onCleared()
        Timber.i("ViewModel Lyfecycle Destroyed.")
    }
}