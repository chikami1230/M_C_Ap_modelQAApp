package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Fragment1_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_third).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_3_to_Fragment1_2)
        }
    }
}