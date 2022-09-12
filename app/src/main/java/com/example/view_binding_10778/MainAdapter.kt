package com.example.view_binding_10778

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.view_binding_10778.databinding.RecyclerviewItemBinding

class MainAdapter (val taskList: List<Task>):RecyclerView.Adapter<MainAdapter.MainViewHolder>(){
    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(task: Task){
            itemBinding.chapter.text = task.chapter
            itemBinding.itemTitle.text = task.title
            itemBinding.itemDetail.text = task.details
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}