package com.sarthak.technojam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import github.com.st235.lib_expandablebottombar.navigation.ExpandableBottomBarNavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationController = Navigation.findNavController(this, R.id.navigationHost)

        /**
         * Call looks like NavigationUI.setupWithNavController(bottomNavigation, navigationController)
         * for native BottomNavigationView
         */
        ExpandableBottomBarNavigationUI.setupWithNavController(bottomNavigation, navigationController)
    }
}
