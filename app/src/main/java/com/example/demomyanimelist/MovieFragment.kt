package com.example.demomyanimelist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demomyanimelist.databinding.MovieFragmentBinding
import com.example.demomyanimelist.adapter.AdapterList

class MovieFragment : Fragment() {

    private lateinit var viewModel: MovieViewModel
    private var movieBinding : MovieFragmentBinding? = null
    private val binding get() = movieBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        movieBinding = MovieFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movieBinding?.rvMovie?.layoutManager = LinearLayoutManager (
            context, LinearLayoutManager.VERTICAL,false
        )
        viewModel = ViewModelProvider(this)[MovieViewModel::class.java]
        viewModel.setListData(DataAnimatio.listMovie)
        showRecyclerList(viewModel.isNull)

    }

    private fun showRecyclerList(isNull: Boolean) {
        if (!isNull) {
            movieBinding?.apply {
                rvMovie.adapter = AdapterList(viewModel.list)
                rvMovie.layoutManager = LinearLayoutManager(context)
                rvMovie.visibility = View.VISIBLE
                msgMovie.visibility = View.INVISIBLE
            }
        } else {
            movieBinding?.apply {
                rvMovie.visibility = View.INVISIBLE
                msgMovie.visibility = View.VISIBLE
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        movieBinding = null
    }

}