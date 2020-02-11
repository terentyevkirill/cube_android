package ua.onpu.presentation.fragments.assignToTracker

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_add_action.*
import ua.onpu.R
import ua.onpu.base.BaseFragment
import ua.onpu.db.entity.Action
import ua.onpu.presentation.activity.LobbyActivity
import ua.onpu.presentation.viewModels.AddActionViewModel
import ua.onpu.presentation.viewModels.MainViewModel

class AddActionFragment : BaseFragment<AddActionViewModel>(AddActionViewModel::class.java) {
    override val fragmentLayout = R.layout.fragment_add_action

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)
        initToolbar()
        onButtonBackPressed()
        showToolbar()
    }

    private fun createAction() {
        val name = addActionName.editText?.text.toString().trim()
        val id = viewModel.getId().last()
        val action = Action(id + 1, name, setColorP())
        viewModel.addAction(action)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.menu_save_activity) {
            createAction()
            findNavController().navigate(R.id.actionManagmentFragment)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initToolbar() {
        ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java).toolbarTitle.value =
            getString(R.string.add_actvity)
    }

    private fun onButtonBackPressed() {
        (requireActivity() as LobbyActivity).onButtonBackPressed()
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        menu.findItem(R.id.menu_add_activity).isVisible = false
        menu.findItem(R.id.menu_save_activity).isVisible = true
        return super.onPrepareOptionsMenu(menu)
    }

    private fun showToolbar() {
        (requireActivity() as LobbyActivity).showToolbar()
    }

    override fun initListeners() {
        colorRed.setOnClickListener { setColorRed() }
        colorRed2.setOnClickListener { setColorRed2() }
        pinkish.setOnClickListener { setColorPin() }
    }

    private fun setColorPin(): Boolean {
        return true
    }

    /**устанавливает цвет с нашего textView в переменную color*/
    private fun setColorRed2(): Int {
        var color = Color.TRANSPARENT
        val background = colorRed2.background
        if (background is ColorDrawable)
            color = background.color
        return color
        Log.i("color", color.toString())
    }

    private fun setColorRed(): Int {
        var color = Color.TRANSPARENT
        val background = colorRed.background
        if (background is ColorDrawable)
            color = background.color
        return color
        Log.i("color", color.toString())
    }

    private fun setColorPinkish(): Int {
        var color = Color.TRANSPARENT
        val background = pinkish.background
        if (background is ColorDrawable)
            color = background.color
        return color
        Log.i("color", color.toString())
    }

    private fun setColorP(): Int {
        var color1:Int?=null
        if (setColorPin()) {
            color1 = setColorPinkish()
        }
        return color1!!
    }
}
