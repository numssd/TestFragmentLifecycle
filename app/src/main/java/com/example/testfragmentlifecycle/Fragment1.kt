package com.example.testfragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.*


class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Testing", "Fragment1 onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Testing", "Fragment1 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Testing", "Fragment2 onCreateView")

        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("Testing", "Fragment2 onViewCreated")

        buttonFragment1To2.setOnClickListener {
            val fragment2 = Fragment2()
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.container1, fragment2)
                ?.commit()
        }

    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.d("Testing", "Fragment1 onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Testing", "Fragment1 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Testing", "Fragment1 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Testing", "Fragment1 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Testing", "Fragment1 onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Testing", "Fragment1 onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Testing", "Fragment1 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Testing", "Fragment1 onDetach")
    }


}