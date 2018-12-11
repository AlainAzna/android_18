package com.example.azna.huitres


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker

import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_zero.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ZeroFragment : Fragment() {

    val jours = Array<String>(365,{i:Int->(i+1).toString()})
    val BUNDLE_PICKER0="value picker0"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_zero, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        numberPicker0.minValue=0
        numberPicker0.maxValue=jours.size-1
        numberPicker0.displayedValues=jours
        numberPicker0.value= MainActivity.jour_depart
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putInt(BUNDLE_PICKER0,numberPicker0.value)
    }

    override fun onViewStateRestored(inState: Bundle?) {
        super.onViewStateRestored(inState)

        if (inState!=null){
            numberPicker0.value=inState.getInt(BUNDLE_PICKER0)}
    }
}
