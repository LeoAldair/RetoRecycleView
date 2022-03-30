package com.example.retorecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.ArraySet
import com.example.retorecycleview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeRestaurantData: Array<JSONObject> = arrayOf(
            JSONObject("{\"name\": \"KFC (pipila-Morelia)\", \"cost\":\"$17\",\"time\":\"15-25 min\",\"note\":\"4.3\"}"),
            JSONObject("{\"name\": \"TasteTopDonuts (Centro)\", \"cost\":\"$23\",\"time\":\"20-30 min\",\"note\":\"4.8\"}"),
            JSONObject("{\"name\": \"Coffee Tree Cinépolis (Centro)\", \"cost\":\"$21\",\"time\":\"25-35 min\",\"note\":\"4.3\"}"),
            JSONObject("{\"name\": \"Burguer King (Centro 2)\", \"cost\":\"$19\",\"time\":\"20-30 min\",\"note\":\"4.6\"}"),
            )
        binding.rvRestaurantEntries.adapter = MainAdapter(fakeRestaurantData)
    }
}