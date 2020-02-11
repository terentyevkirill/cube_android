package ua.onpu.presentation.fragments.settings

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_settings.*
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.presentation.viewModels.MainViewModel
import ua.onpu.presentation.viewModels.SettingsViewModel

class SettingsFragment : BaseFragment<SettingsViewModel>(SettingsViewModel::class.java) {
    override val fragmentLayout = R.layout.fragment_settings

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
        setHasOptionsMenu(true)
    }

    override fun initListeners() {
        super.initListeners()
        go_to_bluetooth_settings.setOnClickListener{findNavController().navigate(R.id.trackerSettingsFragment)}
        constraintLayout_profile.setOnClickListener{findNavController().navigate(R.id.profileFragment)}
    }

    private fun initToolbar(){
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value = getString(R.string.settingsFragment)
    }

    override fun onPrepareOptionsMenu(menu: Menu){
        menu.findItem(R.id.menu_add_activity).isVisible = false
        menu.findItem(R.id.menu_save_activity).isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

}
