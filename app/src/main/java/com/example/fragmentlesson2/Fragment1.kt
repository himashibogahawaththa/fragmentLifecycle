package com.example.fragmentlesson2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment 1", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment 1", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment 1", "onCreateView")
        val fragmentView = inflater.inflate(R.layout.fragment_1,container,false)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Fragment 1", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment 1", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment 1", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment 1", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment 1", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("Fragment 1", "onSaveInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment 1", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment 1", "onDetach")
    }

}