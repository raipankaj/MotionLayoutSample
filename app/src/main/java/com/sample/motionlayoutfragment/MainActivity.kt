package com.sample.motionlayoutfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.utils.widget.ImageFilterButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btAnimatedView.setOnClickListener {
            launchActivity<AnimatedViewActivity> {}
        }

        btCustomPath.setOnClickListener {
            launchActivity<PathAnimationActivity> {}
        }
    }

    private inline fun <reified T>launchActivity(intentFunc: Intent.() -> Unit?) {
        val intent = Intent(this@MainActivity, T::class.java)
        intent.intentFunc()
        startActivity(intent)
    }
}