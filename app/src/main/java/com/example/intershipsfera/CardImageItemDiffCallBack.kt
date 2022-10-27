package com.example.intershipsfera

import androidx.recyclerview.widget.DiffUtil
import com.example.intershipsfera.CardImage

class CardImageItemDiffCallBack: DiffUtil.ItemCallback<CardImage>(){
    override fun areItemsTheSame(oldItem: CardImage, newItem: CardImage): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CardImage, newItem: CardImage): Boolean {
        return oldItem==newItem
    }


}
