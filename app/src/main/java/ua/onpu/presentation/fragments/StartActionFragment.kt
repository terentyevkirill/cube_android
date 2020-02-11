package ua.onpu.presentation.fragments

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_start_action.*
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.db.entity.Action
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.adapters.StartActionAdapter
import ua.onpu.presentation.viewModels.MainViewModel
import ua.onpu.presentation.viewModels.StartActionViewModel
import java.util.*

class StartActionFragment : BaseFragment<StartActionViewModel>(StartActionViewModel::class.java) {
    override val fragmentLayout = R.layout.fragment_start_action
    private lateinit var listAdapter: StartActionAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        setHasOptionsMenu(true)
        initToolbar()
        showToolbar()
    }

    private fun initRecyclerView() {
        active_actions_rv.layoutManager = LinearLayoutManager(requireActivity())
        listAdapter = StartActionAdapter(Collections.emptyList(), this::openTimerFragment)
        active_actions_rv.adapter = listAdapter
    }

    private fun openTimerFragment(action: Action) = findNavController().navigate(StartActionFragmentDirections.actionTimer(action))


    override fun initObservers() {
/**закомментарованный код нам нужен для выбора всех отображения видов деятельности, которые добавлены из кода */
//        viewModel.getAllActions().observe(viewLifecycleOwner, Observer {
//            listAdapter.setActions(it.filter { action ->  action.available})
//        })
        viewModel.getAllActions().observe(viewLifecycleOwner, Observer {
            listAdapter.setActions(it)
        })
    }

    private fun initToolbar(){
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value = getString(R.string.fragment_start_action)
    }

    override fun onPrepareOptionsMenu(menu: Menu){
        menu.findItem(R.id.menu_add_activity).isVisible = false
        menu.findItem(R.id.menu_save_activity).isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    private fun showToolbar(){
        (requireActivity() as LobbyActivity).showToolbar()
    }
}