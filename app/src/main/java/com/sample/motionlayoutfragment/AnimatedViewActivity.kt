package com.sample.motionlayoutfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AnimatedViewActivity : AppCompatActivity(R.layout.activity_animated_view) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .add(R.id.flProfile, ProfileFragment())
            .commit()
    }

}