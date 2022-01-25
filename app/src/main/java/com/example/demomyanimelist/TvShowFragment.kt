package com.example.demomyanimelist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demomyanimelist.databinding.TvShowFragmentBinding
import com.example.demomyanimelist.adapter.AdapterList

class TvShowFragment : Fragment() {

    private lateinit var viewModel: TvShowViewModel
    private var tvShowbinding : TvShowFragmentBinding? = null
    private val binding get() = tvShowbinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tvShowbinding = TvShowFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvShowbinding?.rvTvshow?.layoutManager = LinearLayoutManager (
            context, LinearLayoutManager.VERTICAL,false
        )
        viewModel = ViewModelProvider(this)[TvShowViewModel::class.java]
        viewModel.setListData(DataAnimatio.listTvShow)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        tvShowbinding?.apply {
            rvTvshow.adapter = AdapterList(viewModel.list)
            rvTvshow.layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        tvShowbinding = null
    }

}