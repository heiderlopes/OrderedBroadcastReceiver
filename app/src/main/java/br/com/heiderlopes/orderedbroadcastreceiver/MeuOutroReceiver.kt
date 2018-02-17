package br.com.heiderlopes.orderedbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MeuOutroReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val results = getResultExtras(true)
        results.putString("extra", "meu outro receiver")
    }
}
