package com.example.demomyanimelist

import com.example.demomyanimelist.adapter.Animation
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {

    private lateinit var movieViewModelTest: MovieViewModel

    @Before
    fun init() {
        movieViewModelTest = MovieViewModel()
    }

    @Test
    fun setListData() {
        movieViewModelTest.setListData(DataAnimatio.listMovie)
        Assert.assertEquals(10, movieViewModelTest.list.size)
        Assert.assertNotNull(movieViewModelTest.list.size)
    }
}