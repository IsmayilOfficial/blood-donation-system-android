package com.jama.kenyablooddonationsystem.ui.home.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jama.kenyablooddonationsystem.R
import com.jama.kenyablooddonationsystem.models.EventModel
import kotlinx.android.synthetic.main.events_item.view.*

class EventAdapter(private var events: MutableList<EventModel>, private val context: Context): RecyclerView.Adapter<EventAdapter.EventViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.events_item, parent, false)
        return EventViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.itemView.textViewEventName.text = events[position].eventName
        holder.itemView.textViewPlace.text = events[position].place
        holder.itemView.textViewDate.text = events[position].date.toString()
//        holder.itemView.textViewEventName.text = events[position].eventName
    }

//    fun insertData(newRequests: MutableList<RequestModel>) {
//        val requestDiffCallback = RequestsDiffUtilCallback(requests, newRequests)
//        val diffResult: DiffUtil.DiffResult = DiffUtil.calculateDiff(requestDiffCallback)
//        requests.clear()
//        requests.addAll(newRequests)
//        diffResult.dispatchUpdatesTo(this)
//    }

    class EventViewHolder(view: View): RecyclerView.ViewHolder(view)

}