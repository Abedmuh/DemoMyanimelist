package com.example.demomyanimelist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demomyanimelist.databinding.MovieFragmentBinding

class MovieFragment : Fragment() {

    companion object {
        fun newInstance() = MovieFragment()
    }

    private lateinit var viewModel: MovieViewModel
    private var movieBinding : MovieFragmentBinding? = null
    private val binding get() = movieBinding!!
    private val list = ArrayList<Animation>()

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
        list.addAll(DataAnimation.listOfMovie(this))
        showRecyclerList()

    }

    private fun showRecyclerList() {
        movieBinding?.apply {
            rvMovie.adapter = AdapterList(list)
            rvMovie.layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        movieBinding = null
    }

}