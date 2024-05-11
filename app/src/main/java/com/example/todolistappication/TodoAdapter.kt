package com.example.todolistappication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class TodoAdapter {

    class TodoAdapter:Adapter<TodoViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
           val view =LayoutInflater.from(parent.context).inflate(R.layout.view_item,parent,false)

            return TodoViewHolder(view)
        }

        override fun getItemCount(): Int {
            TODO("Not yet implemented")
        }

        override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
            TODO("Not yet implemented")
        }

    }
}