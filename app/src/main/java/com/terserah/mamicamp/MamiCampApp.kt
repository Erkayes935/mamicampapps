package com.terserah.mamicamp

import android.app.Application
import timber.log.Timber

class MamiCampApp: Application (){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(object : Timber.DebugTree(){
            override fun createStackElementTag
                        (element: StackTraceElement): String? {
                return "(${element.fileName}" +
                ":${element.lineNumber}) MamiCamp log"
            }
        })
    }
}