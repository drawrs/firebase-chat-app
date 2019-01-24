package com.fiqri.clonewhatsapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.fiqri.clonewhatsapp.R

class MessageAcitivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_acitivty)
    }
    private fun initFirebase(){

    }

    private fun initComponent(){

    }

    private fun readMessages(myId: String?, userId: String?, imageURL: String?) {

    }

    private fun sendMessage(sender: String?, receiver: String?, msg: String) {

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
