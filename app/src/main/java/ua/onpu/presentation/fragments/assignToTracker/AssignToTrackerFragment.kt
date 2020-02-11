package ua.onpu.presentation.fragments.assignToTracker

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_assign_to_tracker.*
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.db.entity.Action
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.adapters.ActionsAdapter
import ua.onpu.presentation.viewModels.AssignToTrackerViewModel
import ua.onpu.presentation.viewModels.MainViewModel
import ua.onpu.presentation.viewModels.StartActionViewModel
import java.util.*

class AssignToTrackerFragment :
    BaseFragment<StartActionViewModel>(StartActionViewModel::class.java) {

    override val fragmentLayout = R.layout.fragment_assign_to_tracker
    private val adapter = ActionsAdapter(Collections.emptyList(), this::openEditActionFragment)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
        showToolbar()
        initRecyclerView()
    }

    override fun initObservers() {
        viewModel.getAllActions().observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            adapter.setAddedActions(it)})
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    private fun initRecyclerView() {
        recyclerViewActions.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewActions.adapter = adapter
    }

    private fun openEditActionFragment(action: Action)= findNavController().navigate(AssignToTrackerFragmentDirections.actionActionManagmentFragmentToEditActionFragment(action))

    private fun initToolbar() {
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value =getString(R.string.assignToTracker)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_add_activity -> {
                findNavController().navigate(R.id.addActionFragment)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        menu.findItem(R.id.menu_add_activity).isVisible = true
        menu.findItem(R.id.menu_save_activity).isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    private fun showToolbar() {
        (requireActivity() as LobbyActivity).showToolbar()
    }
}
