package com.example.demomyanimelist

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.ViewPagerActions
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    private val dummyTvshow = DataAnimatio.listTvShow
    private val dummyMovie = DataAnimatio.listMovie

    @Before
    fun setup(){
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun tabsView() {
        onView(withId(R.id.tabs))
            .check(matches(isDisplayed()))
        onView(withId(R.id.view_pager))
            .check(matches(isDisplayed()))
        onView(withId(R.id.view_pager)).perform(
            ViewPagerActions.scrollToPage(2)
        )
        onView(withId(R.id.view_pager)).perform(
            ViewPagerActions.scrollToPage(1)
        )
    }

    @Test
    fun rvMovieTest() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    @Test
    fun rvTvshowTest() {
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyTvshow.size
            )
        )
    }

    @Test
    fun detailMovieTest() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.description)).check(matches(isDisplayed()))
        onView(withId(R.id.studio)).check(matches(isDisplayed()))
        onView(withId(R.id.aired)).check(matches(isDisplayed()))
        onView(withId(R.id.rating)).check(matches(isDisplayed()))
        onView(withId(R.id.poster)).check(matches(isDisplayed()))
        onView(withId(R.id.description)).check(matches(withText(dummyMovie[0].description)))
        onView(withId(R.id.studio)).check(matches(withText(dummyMovie[0].studio)))
        onView(withId(R.id.aired)).check(matches(withText(dummyMovie[0].aired)))
        onView(withId(R.id.rating)).check(matches(withText(dummyMovie[0].rank)))
        onView(withId(R.id.poster)).check(matches(withText(dummyMovie[0].poster)))
    }

    @Test
    fun detailTvTest() {
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.description)).check(matches(isDisplayed()))
        onView(withId(R.id.studio)).check(matches(isDisplayed()))
        onView(withId(R.id.aired)).check(matches(isDisplayed()))
        onView(withId(R.id.rating)).check(matches(isDisplayed()))
        onView(withId(R.id.poster)).check(matches(isDisplayed()))
        onView(withId(R.id.description)).check(matches(withText(dummyMovie[0].description)))
        onView(withId(R.id.studio)).check(matches(withText(dummyMovie[0].studio)))
        onView(withId(R.id.aired)).check(matches(withText(dummyMovie[0].aired)))
        onView(withId(R.id.rating)).check(matches(withText(dummyMovie[0].rank)))
        onView(withId(R.id.poster)).check(matches(withText(dummyMovie[0].poster)))
    }
}