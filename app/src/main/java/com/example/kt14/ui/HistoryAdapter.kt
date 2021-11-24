package com.example.kt14.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kt14.databinding.ItemHistoryBinding
import com.example.kt14.ui.HistoryAdapter.ViewHolder

class HistoryAdapter : RecyclerView.Adapter<ViewHolder>(){

    private var list = arrayListOf<String>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemHistoryBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    fun setList(list: ArrayList<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(private var binding: ItemHistoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(story: String) {
            binding.tvPl.text = story
        }

    }


}