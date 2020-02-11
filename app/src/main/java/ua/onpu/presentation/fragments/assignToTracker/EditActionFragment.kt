package ua.onpu.presentation.fragments.assignToTracker

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_edit_action.*
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.db.entity.Action
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.viewModels.AddActionViewModel
import ua.onpu.presentation.viewModels.MainViewModel

class EditActionFragment : BaseFragment<AddActionViewModel>(AddActionViewModel::class.java){

    override val fragmentLayout = R.layout.fragment_edit_action
    private val args: EditActionFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)
        initToolbar()
        showToolbar()
        initData()
    }

    override fun initListeners() {
        deleteAction.setOnClickListener { deleteAction() }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.menu_save_activity) {
            editAction()
            findNavController().navigate(R.id.actionManagmentFragment)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        menu.findItem(R.id.menu_add_activity).isVisible = false
        menu.findItem(R.id.menu_save_activity).isVisible = true
        return super.onPrepareOptionsMenu(menu)
    }

    private fun initData() {
        editActionName.editText?.setText(args.StringGoToEditAction.name)
        colorRed.setTextColor(args.StringGoToEditAction.color)
    }

    private fun editAction() {
        val id = args.StringGoToEditAction.id
        val name = editActionNameEditText.text.toString()
        val color = args.StringGoToEditAction.color

        val action = Action(id, name, color)
        viewModel.editAction(action)
    }

    private fun deleteAction(){
        val id = args.StringGoToEditAction.id
        val name = editActionNameEditText.text.toString()
        val color = args.StringGoToEditAction.color
        val action = Action(id, name, color)
        viewModel.deleteAction(action)
        findNavController().popBackStack()
    }

    private fun initToolbar() {
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value = getString(R.string.edit_actvity)
    }

    private fun showToolbar() {
        (requireActivity() as LobbyActivity).showToolbar()
    }
}
