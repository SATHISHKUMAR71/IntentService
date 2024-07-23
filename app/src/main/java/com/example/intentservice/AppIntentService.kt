package com.example.intentservice

import android.app.IntentService
import android.content.Intent

class AppIntentService:IntentService("intent") {

    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(intent: Intent?) {

        if(intent!=null){
            when(intent.action){
                "ACTION_DOWNLOAD" ->{
                    println("Download Started")
                    Thread.sleep(2000)
                    println("Download Finished")
                }
                "ACTION_UPLOAD" ->{
                    println("Uploading Data")
                    Thread.sleep(2000)
                    println("Data Uploaded Successfully")
                }
                "ACTION_SYNC_DATA" -> {
                    println("Data Sync Started")
                    Thread.sleep(2000)
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