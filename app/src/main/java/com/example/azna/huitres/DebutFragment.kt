package com.example.azna.huitres


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import com.example.azna.huitres.R.id.numberPicker1
import com.example.azna.huitres.R.id.numberPicker2
import kotlinx.android.synthetic.main.fragment_debut.*
import org.jetbrains.anko.support.v4.find
import java.nio.file.Files.find


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DebutFragment : Fragment(){

    private var i=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_debut,container,false)
        // Inflate the layout for this fragment
        val nPicker1 :NumberPicker=view.findViewById(R.id.numberPicker1)
        val nPicker2 :NumberPicker=view.findViewById(R.id.numberPicker2)
        val heures= Array<String>(24,{i:Int->i.toString()})
        val minutes = Array<String>(60,{i:Int->i.toString()})
        nPicker1.minValue=0
        nPicker1.maxValue=heures.size -1
        nPicker1.displayedValues = heures
        nPicker1.value=8
        nPicker2.minValue=0
        nPicker2.maxValue=minutes.size -1
        nPicker2.displayedValues = minutes
        nPicker2.value=0


        return view
//        inflater.inflate(R.layout.fragment_debut, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
