package edu.uw.ischool.CACS2340142.activityspy

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i("Activity Spy", "onCreate event fired" + intent)


    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivitySpy", "onDestroy event fired" + intent)
        Log.e("ActivitySpy", "We're going down, Captain!" + intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity Spy", "OnStart event fired" + intent)
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivitySpy", "onStop event fired" + intent)
    }

    override fun onPause() {
        super.onPause()
        Log.i("ActivitySpy", "onPause event fired" + intent)
    }

    override fun onResume() {
        super.onResume()
        Log.i("ActivitySpy", "onResume event fired" + intent)
    }


}