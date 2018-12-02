package com.example.azna.huitres


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import kotlinx.android.synthetic.main.fragment_fin.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FinFragment : Fragment() {

    private var i=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_fin,container,false)
        val numberPicker3 :NumberPicker=view.findViewById(R.id.numberPicker3)
        val numberPicker4 :NumberPicker=view.findViewById(R.id.numberPicker4)
        val heures= Array<String>(24,{i:Int->i.toString()})
        val minutes = Array<String>(60,{i:Int->i.toString()})
        numberPicker3.minValue=0
        numberPicker3.maxValue=heures.size -1
        numberPicker3.displayedValues = heures
        numberPicker3.value=8
        numberPicker4.minValue=0
        numberPicker4.maxValue=minutes.size -1
        numberPicker4.displayedValues = minutes
        numberPicker4.value=0

        // Inflate the layout for this fragment

        return view
//        return inflater.inflate(R.layout.fragment_fin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
