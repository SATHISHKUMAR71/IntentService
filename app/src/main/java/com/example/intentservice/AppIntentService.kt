package com.example.intentservice

import android.app.IntentService
import android.content.Intent

class AppIntentService:IntentService("intent") {

    private var isRunning = false
    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(intent: Intent?) {

        if(intent!=null){
            when(intent.action){
                "ACTION_DOWNLOAD" ->{
                    isRunning = true
                    while (isRunning){
                        Thread.sleep(1000)
                        println("Data Downloading Started")
                    }
                    println("Data Downloaded Successfully")
                }
                "ACTION_UPLOAD" ->{
                    isRunning = true
                    for (i in 1..1000000){
                        Thread.sleep(10)
                        println("Data Uploading Started $i")
                    }
                    println("Data Uploaded Successfully")
                }
                "ACTION_SYNC_DATA" -> {
                    isRunning = true
                    for (i in 1..1000000){
                        Thread.sleep(10)
                        println("Data Sync Started")
                    }
                    println("Data Sync Finished")
                }
                else->{
                    println("Unknown action")
                }
            }
        }
    }

    companion object {
        val ACTION_UPLOAD: String = "ACTION_UPLOAD"
        val ACTION_SYNC_DATA: String = "ACTION_SYNC_DATA"
        val ACTION_DOWNLOAD: String = "ACTION_DOWNLOAD"
    }
}