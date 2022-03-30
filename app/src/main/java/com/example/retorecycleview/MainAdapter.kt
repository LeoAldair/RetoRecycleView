package com.example.retorecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retorecycleview.databinding.ItemObjectBinding
import org.json.JSONObject

class MainAdapter (private val restaurant: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemObjectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(restaurant[position])
    }

    override fun getItemCount(): Int = restaurant.size

    class MainHolder(val binding: ItemObjectBinding): RecyclerView.ViewHolder(binding.root){
        fun render(rest: JSONObject){
            binding.tvNameRestaurand.setText(rest.getString("name"))
            binding.tvDeliveryCostNumber.setText(rest.getString("cost"))
            binding.tvDeliveryTime.setText(rest.getString("time"))
            binding.tvNoteRestaurant.setText(rest.getString("note"))
            binding.ivRestaurandThumbnail.setImageResource(R.drawable.restaurant_placeholder)
        }
    }

}