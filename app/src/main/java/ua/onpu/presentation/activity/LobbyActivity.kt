package ua.onpu.presentation.activity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.os.Bundle
import android.util.Log.v
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_lobby.*
import ua.onpu.R
import ua.onpu.bluetooth.BluetoothConnectionService
import ua.onpu.presentation.viewModels.MainViewModel

class LobbyActivity : DaggerAppCompatActivity() {

    private lateinit var receiver: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lobby)

        bottomNavigationView.setupWithNavController(Navigation.findNavController(this, R.id.nav_host_main_fragment))
        initObservers()
        setSupportActionBar(main_toolbar)

        val intent = Intent(this, BluetoothConnectionService::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(intent)
        } else {
            startService(intent)
        }

    }

    override fun onDestroy() {
        v("LobbyActivity", "onDestroy()")
        super.onDestroy()
        stopService(Intent(this, BluetoothConnectionService::class.java))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_activity, menu)
        menuInflater.inflate(R.menu.save_activity, menu)
        return true
    }

    fun hideToolbar(){
        main_toolbar.visibility = View.GONE
    }

    fun showToolbar(){
        main_toolbar.visibility = View.VISIBLE
    }

    fun initObservers() {
        ViewModelProviders.of(this).get(MainViewModel::class.java).toolbarTitle.observe(this,
            Observer { main_toolbar.title = it })
    }

    /** метод выполняет переход назад, сначало мы должны сделать проверку на условия
     * можно ли закрывать даннный фрагмент(перейти назад в графе) и потом вызвать этот метод */
    fun onButtonBackPressed(){
        main_toolbar.setNavigationOnClickListener { onBackPressed() }
    }
}
