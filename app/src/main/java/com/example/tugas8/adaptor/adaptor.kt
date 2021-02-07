package com.example.tugas8.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas8.databinding.FormBinding
import com.example.tugas8.model.form

class adaptor (var barang :List<form>) : RecyclerView.Adapter<adaptor.TodoViewHolder>() {
    inner class TodoViewHolder(val binding: FormBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(FormBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.apply {
            tvView.text = barang [position].tv
            tv2View.text = barang [position].tv2
            imgView.setImageResource(barang[position].img)

        }

    }

    override fun getItemCount(): Int {
        return barang.size
    }

}