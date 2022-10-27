package com.example.intershipsfera

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.internshipsfera.databinding.ItemImageBinding
import androidx.recyclerview.widget.ListAdapter as ListAdapterCards


class CardImageListAdapter: ListAdapterCards <CardImage, CardImageListAdapter.CardImageItemHolder> (
    CardImageItemDiffCallBack()
){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardImageItemHolder {
        return CardImageItemHolder(ItemImageBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: CardImageItemHolder, position: Int) {
        val cardImageItem = getItem(position)

    }

    class CardImageItemHolder(binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root){
        val itemImage: ImageView = binding.rcImage
    }

}
