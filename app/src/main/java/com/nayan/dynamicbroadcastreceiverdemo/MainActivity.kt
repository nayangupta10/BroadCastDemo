package com.nayan.dynamicbroadcastreceiverdemo

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nayan.dynamicbroadcastreceiverdemo.receiver.Receiver

class MainActivity : AppCompatActivity() {

    var receiver : Receiver? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         receiver=Receiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver,it)
        }

    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}