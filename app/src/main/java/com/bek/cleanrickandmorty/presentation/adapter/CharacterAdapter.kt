package com.bek.cleanrickandmorty.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bek.cleanrickandmorty.databinding.CharacterHolderBinding
import com.bek.cleanrickandmorty.domain.model.Character

class CharacterAdapter() : ListAdapter<Character.Result, CharacterAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(CharacterHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(getItem(position))
    }

    class ViewHolder(val binding : CharacterHolderBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(characterResponse: Character.Result) {
            Log.d("ololo", "bind: image = ${characterResponse.image}")
            Glide.with(binding.image.context)
                .load(characterResponse.image)
                .centerCrop()
                .placeholder(android.R.color.darker_gray)
                .into(binding.image)
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Character.Result>() {
        override fun areItemsTheSame(oldItem: Character.Result, newItem: Character.Result): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Character.Result, newItem: Character.Result): Boolean {
            return oldItem == newItem
        }
    }
}