package ua.onpu.presentation.fragments.settings

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.lifecycle.ViewModelProviders
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.viewModels.MainViewModel
import ua.onpu.presentation.viewModels.ProfileViewModel

class ProfileFragment : BaseFragment<ProfileViewModel>(ProfileViewModel::class.java) {
    override val fragmentLayout = R.layout.fragment_profile

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
        setHasOptionsMenu(true)
        showToolbar()
    }

    private fun initToolbar(){
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value = getString(R.string.profile)
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
