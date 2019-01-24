package com.fiqri.clonewhatsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //TODO: Inisiasi Firebase
    fun initFirebase(){

    }

    //TODO: Mendapatkan data semua pengguna
    fun getListOfUser(){

    }

    //TODO: Mendapatkan data semua pesan
    fun getListOfMessage(){

    }

    //TODO: Mendapatkan status pengguna online / offline
    fun status(status: String){

    }

    //TODO: Menampilkan toolbar menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    //TODO: Menghandle ketika menu dipilih
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
