package com.example.testkotproj

import android.icu.text.DisplayContext
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity() {

    private val DISPATCHERS_DEFAULT_CONTEXT:CoroutineDispatcher = Dispatchers.Default
    private val DISPATCHERS_IO_CONTEXT:CoroutineDispatcher = Dispatchers.IO
    private val DISPATCHERS_MAIN_CONTEXT:CoroutineDispatcher = Dispatchers.Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
