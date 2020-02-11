package ua.onpu.presentation.fragments.settings

import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_tracker.*
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.viewModels.MainViewModel
import ua.onpu.presentation.viewModels.TrackerViewModel

class TrackerSettingsFragment : BaseFragment<TrackerViewModel>(TrackerViewModel::class.java) {

    override val fragmentLayout = R.layout.fragment_tracker

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUiEnabled(false)
        setHasOptionsMenu(true)
        initToolbar()
        showToolbar()
    }

    override fun initObservers() {
        viewModel.isBluetoothEnabled.observe(viewLifecycleOwner, Observer { setUiEnabled(it) })
        viewModel.toastLiveData.observe(viewLifecycleOwner, Observer { it?.let { Toast.makeText(requireContext(), it, Toast.LENGTH_LONG).show() } })
        viewModel.data.observe(viewLifecycleOwner, Observer {
            if (it.isEmpty()) textView.text = it
            else textView.append(it)
        })
    }

    private fun initToolbar(){
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value = getString(R.string.tracker)
    }

    override fun onPrepareOptionsMenu(menu: Menu){
        menu.findItem(R.id.menu_add_activity).isVisible = false
        menu.findItem(R.id.menu_save_activity).isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    override fun initListeners() {
        button_enable_bt.setOnClickListener { viewModel.enableBluetooth() }
        button_send.setOnClickListener {
            viewModel.send(tiet_command_input.text.toString())
            scrollView.post { scrollView.fullScroll(View.FOCUS_DOWN) }
        }
        button_disable_bt.setOnClickListener { viewModel.disableBluetooth() }
        button_clear.setOnClickListener { viewModel.clearData() }
    }

    private fun setUiEnabled(bool: Boolean) {
        button_enable_bt.isEnabled = !bool
        button_send.isEnabled = bool
        button_disable_bt.isEnabled = bool
        textView.isEnabled = bool
    }

    private fun showToolbar(){
        (requireActivity() as LobbyActivity).showToolbar()
    }
}
