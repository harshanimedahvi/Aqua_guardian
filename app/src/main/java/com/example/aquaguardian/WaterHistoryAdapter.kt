package com.example.aquaguardian

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

enum class StatusType {
    SAFE, WARNING, DANGER
}

data class WaterRecord(
    val date: String,
    val color: String,
    val smell: String,
    val notes: String,
    val statusType: StatusType
)

class WaterHistoryAdapter(
    private val waterHistoryList: List<WaterRecord>,
    private val onItemClick: (WaterRecord) -> Unit
) : RecyclerView.Adapter<WaterHistoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvDate: TextView = view.findViewById(R.id.tvDate)
        val tvColor: TextView = view.findViewById(R.id.tvColor)
        val tvSmell: TextView = view.findViewById(R.id.tvSmell)
        val tvNotes: TextView = view.findViewById(R.id.tvNotes)
        val viewStatusCircle: View = view.findViewById(R.id.viewStatusCircle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_history_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val record = waterHistoryList[position]
        holder.tvDate.text = record.date
        holder.tvColor.text = record.color
        holder.tvSmell.text = record.smell
        holder.tvNotes.text = record.notes

        val circleBg = when (record.statusType) {
            StatusType.SAFE -> R.drawable.green_circle
            StatusType.WARNING -> R.drawable.yellow_circle
            StatusType.DANGER -> R.drawable.red_circle
        }
        holder.viewStatusCircle.setBackgroundResource(circleBg)

        holder.itemView.setOnClickListener {
            onItemClick(record)
        }
    }

    override fun getItemCount(): Int = waterHistoryList.size
}
