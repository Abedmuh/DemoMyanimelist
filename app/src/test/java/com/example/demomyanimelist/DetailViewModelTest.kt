package com.example.demomyanimelist

import com.example.demomyanimelist.adapter.Animation
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {

    private lateinit var detailViewModelTest: DetailViewModel

    @Before
    fun init() {
        detailViewModelTest = DetailViewModel()
    }

    @Test
    fun setListData() {
        detailViewModelTest.packet = DataAnimatio.listMovie[0]
        val dummyPacket = detailViewModelTest.packet
        detailViewModelTest.setpacket(dummyPacket)
        Assert.assertNotNull(dummyPacket)
        Assert.assertEquals(false,detailViewModelTest.isNull)
        Assert.assertEquals(DataAnimatio.listMovie[0],dummyPacket)
        Assert.assertEquals(DataAnimatio.listMovie[0].rank,dummyPacket?.rank)
        Assert.assertEquals(DataAnimatio.listMovie[0].studio,dummyPacket?.studio)
        Assert.assertEquals(DataAnimatio.listMovie[0].description,dummyPacket?.description)
        Assert.assertEquals(DataAnimatio.listMovie[0].poster,dummyPacket?.poster)
        Assert.assertEquals(DataAnimatio.listMovie[0].aired,dummyPacket?.aired)
        Assert.assertEquals(DataAnimatio.listMovie[0].Name,dummyPacket?.Name)
    }
}