package com.example.internshipsfera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.internshipsfera.databinding.ActivityMainBinding
import com.example.intershipsfera.CardImage
import com.example.intershipsfera.CardImageListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var cardImageListAdapter: CardImageListAdapter
    private lateinit var binding:ActivityMainBinding

    private var cardImage: CardImage = CardImage(0)
    private var cardList = mutableListOf<CardImage>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cardList.add(cardImage)
        cardImageListAdapter = CardImageListAdapter()

        val cardImageRecyclerView: RecyclerView =binding.rcFourTop
        cardImageRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        cardImageRecyclerView.adapter =cardImageListAdapter
    }

}