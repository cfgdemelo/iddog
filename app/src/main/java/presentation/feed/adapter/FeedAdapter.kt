package com.cfgdemelo.iddog.presentation.feed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.cfgdemelo.iddog.R

class FeedAdapter(private val glide: RequestManager, private val itemClick: ItemClick) :
    RecyclerView.Adapter<FeedAdapter.FeedViewHolder>(), View.OnClickListener {

    private val photoList: ArrayList<String> = ArrayList()

    override fun onClick(view: View?) {
        val position = view?.tag as Int
        itemClick.click(photoList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        return FeedViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_feed,
                parent,
                false
            )
        ).apply {
            setOnClick(this@FeedAdapter)
        }
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        holder.itemView.tag = position
        photoList[position].apply {
            glide.load(this)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .onlyRetrieveFromCache(true)
                .into(holder.image)
        }
    }

    fun refresh(newList: List<String>) {
        photoList.clear()
        photoList.addAll(newList)
        notifyDataSetChanged()
    }

    inner class FeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.ivImage)

        fun setOnClick(onClick: View.OnClickListener) {
            itemView.setOnClickListener(onClick)
        }
    }
}

interface ItemClick {
    fun click(url: String)
}