package com.example.testkotproj

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*


class ModuleActivity : AppCompatActivity() {

    val DISPACHER_IO_CONTEXT : CoroutineDispatcher = Dispatchers.IO
    lateinit var imageView : ImageView
    lateinit var insertImageBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bitmapList = mutableListOf<Bitmap>()
        var drawable = getDrawable(R.drawable.bitmaptest)

        var mapTest = mutableMapOf<Int, Int>()
        imageView = findViewById(R.id.imageViewTest)

        insertImageBtn = findViewById(R.id.buttonTest)
        insertImageBtn.setOnClickListener() {

            GlobalScope.launch(DISPACHER_IO_CONTEXT) {
                initialize(DISPACHER_IO_CONTEXT)
            }
        }


    }

    public suspend  fun initialize(dispatcher: CoroutineDispatcher) {
        val engineLoader = EngineLoader()
        engineLoader.LoadEngine()
    }

    inner private class EngineLoader(private val engineLoadScope:CoroutineScope = GlobalScope) {

        var testString : String = ""

        suspend fun LoadEngine() {
            engineLoadScope.launch {

            }
        }
    }


}
