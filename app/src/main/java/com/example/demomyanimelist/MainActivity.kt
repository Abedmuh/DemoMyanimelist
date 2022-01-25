package com.example.demomyanimelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.example.demomyanimelist.databinding.ActivityMainBinding
import com.example.demomyanimelist.adapter.AdapterFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var mainbinding: ActivityMainBinding? = null
    private val binding get() = mainbinding

    companion object {
        @StringRes
        val TAB_TITLES = intArrayOf(
            R.string.movie_tabs,
            R.string.tvShow_tabs
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val fragmentAdapter = AdapterFragment(this)
        setTested(fragmentAdapter)

    }

    fun setTested(fragmentAdapter: AdapterFragment) {
        binding?.apply {
            viewPager.adapter = fragmentAdapter
            TabLayoutMediator(tabs, viewPager) { tabs, position ->
                tabs.text = resources.getString(TAB_TITLES[position])
            }.attach()
        }
    }
}