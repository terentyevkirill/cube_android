package ua.onpu.presentation.fragments

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_history.*
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.adapters.HistoryAdapter
import ua.onpu.presentation.viewModels.HistoryViewModel
import ua.onpu.presentation.viewModels.MainViewModel
import java.util.*

class HistoryFragment : BaseFragment<HistoryViewModel>(HistoryViewModel::class.java) {

    override val fragmentLayout = R.layout.fragment_history

    private val historyAdapter = HistoryAdapter(Collections.emptyList())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)
        initToolbar()
        initRecyclerView()
        showAndHideTextView()
        showToolbar()

        viewModel.getAllIntervalsWithActions().observe(viewLifecycleOwner, androidx.lifecycle.Observer{
            historyAdapter.setIntervals(it)
        })
    }

    private fun initToolbar(){
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value = getString(R.string.history)
    }

    override fun onPrepareOptionsMenu(menu: Menu){
        menu.findItem(R.id.menu_add_activity).isVisible = false
        menu.findItem(R.id.menu_save_activity).isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_history, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_clear){
            viewModel.deleteAllIntervals()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initRecyclerView(){
        recyclerViewHistory.layoutManager = LinearLayoutManager(context)
        recyclerViewHistory.adapter = historyAdapter
    }

    private fun showAndHideTextView(){
        txtNothingTracked.visibility = when (viewModel.isHistoryEmpty()) {
            true -> View.VISIBLE
            false -> View.INVISIBLE
        }
    }

    private fun showToolbar(){
        (requireActivity() as LobbyActivity).showToolbar()
    }
}