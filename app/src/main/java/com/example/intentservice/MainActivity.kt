package com.example.intentservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.download).setOnClickListener {
            val intent = Intent(this, AppIntentService::class.java)
            intent.action = AppIntentService.ACTION_DOWNLOAD
            startService(intent)
        }

        findViewById<Button>(R.id.syncData).setOnClickListener {
            val intent = Intent(this, AppIntentService::class.java)
            intent.action = AppIntentService.ACTION_SYNC_DATA
            startService(intent)
        }

        findViewById<Button>(R.id.uploadData).setOnClickListener {
            val intent = Intent(this, AppIntentService::class.java)
            intent.action = AppIntentService.ACTION_UPLOAD
            startService(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
