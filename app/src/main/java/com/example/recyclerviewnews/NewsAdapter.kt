package com.example.recyclerviewnews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(var listNews:ArrayList<ListNews>): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var judulnews = view.findViewById<TextView>(R.id.txtJudul)
        var tglnews = view.findViewById<TextView>(R.id.txtTanggal)
        var kategori = view.findViewById<TextView>(R.id.txtKategori)
        var image = view.findViewById<ImageView>(R.id.imgNews)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        holder.judulnews.text = listNews[position].judulnews
        holder.tglnews.text = listNews[position].tglnews.toString()
        holder.kategori.text = listNews[position].kategori.toString()
        holder.image.setImageResource(listNews[position].image)


    }

    override fun getItemCount(): Int {
        return listNews.size

    }
}