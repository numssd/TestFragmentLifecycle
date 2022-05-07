package com.example.testfragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.fragment_2.*

class Fragment2 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Testing", "Fragment2 onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Testing", "Fragment2 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Testing", "Fragment2 onCreateView")

        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("Testing", "Fragment2 onViewCreated")

        buttonShowAlertDialog.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Alert Dialog")
            builder.setMessage("Это AlertDialog")
            builder.setIcon(R.drawable.ic_launcher_background)
            builder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog = builder.create()
            dialog.show()
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.d("Testing", "Fragment2 onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Testing", "Fragment2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Testing", "Fragment2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Testing", "Fragment2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Testing", "Fragment2 onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Testing", "Fragment2 onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Testing", "Fragment2 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Testing", "Fragment2 onDetach")
    }
}