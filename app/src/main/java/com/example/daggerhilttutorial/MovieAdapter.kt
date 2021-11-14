package com.example.daggerhilttutorial

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerhilttutorial.data.Movie
import com.example.daggerhilttutorial.databinding.ItemMovieBinding
import javax.inject.Inject

class MovieAdapter @Inject constructor() : ListAdapter<Movie, MovieAdapter.MainViewHolder>(diffUtil) {

    inner class MainViewHolder(private val binding: ItemMovieBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(movieModel: Movie) {
            binding.movie = movieModel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Movie>() {
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem == newItem
            }
        }
    }
}