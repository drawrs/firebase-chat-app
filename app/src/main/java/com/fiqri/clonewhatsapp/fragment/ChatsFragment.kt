package com.fiqri.clonewhatsapp.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.fiqri.clonewhatsapp.R

/**
 * A simple [Fragment] subclass.
 *
 */
class ChatsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    private fun initFirebase(){

    }

    private fun getUsers(){

    }

    private fun getChats(){

    }

    private fun updateToken(){

    }

    private fun chatLists(){

    }


}
