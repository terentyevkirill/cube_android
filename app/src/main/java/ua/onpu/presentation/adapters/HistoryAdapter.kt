package ua.onpu.presentation.adapters

import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_history.view.*
import ua.onpu.R
import ua.onpu.db.converters.IntervalWithAction
import java.text.SimpleDateFormat
import java.util.*

class HistoryAdapter(private var intervals: List<IntervalWithAction>) :
    RecyclerView.Adapter<HistoryAdapter.IntervalViewHolder>() {

    private lateinit var layoutInflater: LayoutInflater

    fun setIntervals(intervals: List<IntervalWithAction>) {
        this.intervals = intervals
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntervalViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        return IntervalViewHolder(layoutInflater.inflate(R.layout.item_history, parent, false))
    }

    override fun getItemCount() = intervals.size

    override fun onBindViewHolder(holder: IntervalViewHolder, position: Int) {
        holder.bind(intervals, position)
    }


    class IntervalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val dateFormatter = SimpleDateFormat("HH:mm", Locale.getDefault())

        fun bind(intervals: List<IntervalWithAction>, position: Int) {
            val intervalsItem: IntervalWithAction = intervals[position]
            itemView.actionName.text = intervalsItem.actionName
            itemView.startTime.text = dateFormatter.format(intervalsItem.startTime)
            itemView.endTime.text = dateFormatter.format(intervalsItem.endTime)
            itemView.historyActionColorIv.setImageDrawable(ColorDrawable(intervalsItem.actionColor))
        }
    }
}