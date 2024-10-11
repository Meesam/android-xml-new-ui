package com.xml_new_ui.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.xml_new_ui.myapplication.databinding.RecycleItemBinding

class ItemAdapter(private val itemList:List<Item>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemBinding= RecycleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    inner class ItemViewHolder(private val binding: RecycleItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:Item) {
          binding.apply {
              tvTitle.text = item.title
              tvDescription.text = item.description
          }
        }
    }
}