package com.companyname.predictivebackgesture

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.OnBackInvokedCallback
import android.window.OnBackInvokedDispatcher

class MainActivity : AppCompatActivity() {

    private lateinit var onBackInvokedCallback: OnBackInvokedCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            onBackInvokedCallback = OnBackInvokedCallback {
//                // Your app's onBackPressed logic goes here...
//                finish()
//            }
//            onBackInvokedDispatcher.registerOnBackInvokedCallback(
//                OnBackInvokedDispatcher.PRIORITY_DEFAULT,
//                onBackInvokedCallback,
//            )
//        }

    }

    override fun onDestroy() {
        super.onDestroy()

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback)
//        }
    }
}