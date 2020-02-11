package ua.onpu.presentation.adapters

import android.graphics.drawable.ColorDrawable
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_all_action.view.*
import kotlinx.android.synthetic.main.item_history.view.*
import kotlinx.android.synthetic.main.item_tracked_action.view.*
import ua.onpu.R
import ua.onpu.core.inflate
import ua.onpu.db.converters.IntervalWithAction
import ua.onpu.db.entity.Action

class ActionsAdapter(private var actions: List<Action>, private val openEditActionFragment:(action: Action) -> Unit) :
    RecyclerView.Adapter<ActionsAdapter.ActionsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActionsViewHolder {
        val inflatedView = parent.inflate(R.layout.item_all_action, false)
        return ActionsViewHolder(inflatedView)
    }

    override fun getItemCount() = actions.size

    override fun onBindViewHolder(holder: ActionsViewHolder, position: Int) {
        holder.bind(actions, position, openEditActionFragment)
    }

    fun setAddedActions(actions: List<Action>) {
        this.actions = actions
        notifyDataSetChanged()
    }

    class ActionsViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        fun bind(actionList: List<Action>, position: Int, openEditActionFragment:(action: Action)->Unit) {
            val action: Action = actionList[position]
            itemView.nameAddedActivity.text = action.name
            itemView.colorAddedActivity.setImageDrawable(ColorDrawable(action.color))
            itemView.setOnClickListener { openEditActionFragment(action) }
        }
    }
}