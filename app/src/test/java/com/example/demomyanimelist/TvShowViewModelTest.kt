package com.example.demomyanimelist

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest{
    private lateinit var tvShowViewModel: TvShowViewModel

    @Before
    fun init() {
        tvShowViewModel = TvShowViewModel()
    }

    @Test
    fun setListData() {
        tvShowViewModel.setListData(DataAnimatio.listMovie)
        Assert.assertEquals(10, tvShowViewModel.list.size)
        Assert.assertNotNull(tvShowViewModel.list.size)
    }
}