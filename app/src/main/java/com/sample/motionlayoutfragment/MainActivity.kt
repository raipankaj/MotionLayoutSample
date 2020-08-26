package com.sample.motionlayoutfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.utils.widget.ImageFilterButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        supportFragmentManager.beginTransaction()
            .add(R.id.flProfile, ProfileFragment())
            .commit()
    }
}