package ua.onpu.presentation.adapters

import android.graphics.drawable.ColorDrawable
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_tracked_action.view.*
import ua.onpu.R
import ua.onpu.core.inflate
import ua.onpu.db.entity.Action

class StartActionAdapter(
    private var actions: List<Action>,
    private val openTimerFragment: (action: Action) -> Unit
) :
    RecyclerView.Adapter<StartActionAdapter.ActiveActionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActiveActionViewHolder {
        val inflatedView = parent.inflate(R.layout.item_tracked_action, false)
        return ActiveActionViewHolder(inflatedView)
    }

    override fun getItemCount() = actions.size

    override fun onBindViewHolder(holder: ActiveActionViewHolder, position: Int) {
        holder.bindAction(actions[position], openTimerFragment)
    }

    fun setActions(actions: List<Action>) {
        this.actions = actions
        notifyDataSetChanged()
    }

    class ActiveActionViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        fun bindAction(action: Action, openTimerFragment: (action: Action) -> Unit) {
            itemView.itemActiveActionNameTv.text = action.name
            itemView.itemActionColorIv.setImageDrawable(ColorDrawable(action.color))
            itemView.setOnClickListener { openTimerFragment(action) }
        }

    }
}