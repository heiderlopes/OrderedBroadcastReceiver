package br.com.heiderlopes.orderedbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MeuReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val results = getResultExtras(true)
        val extras = results.getString("extras")
        results.putString("extras", extras + "->" + "meuoutroreceiver")
    }
}
