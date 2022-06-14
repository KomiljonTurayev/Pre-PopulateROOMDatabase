package com.example.pre_populateroomdatabase

import androidx.lifecycle.ViewModel
import com.example.pre_populateroomdatabase.data.PersonDao
import com.example.pre_populateroomdatabase.data.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    personDao: PersonDao
) : ViewModel() {

    val readAll = personDao.readAll()
}