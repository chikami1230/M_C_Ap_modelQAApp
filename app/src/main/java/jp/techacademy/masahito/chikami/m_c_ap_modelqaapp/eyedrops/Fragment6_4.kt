package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.eyedrops

import android.os.Bundle
import android.preference.PreferenceManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R
import kotlinx.android.synthetic.main.fragment1_1.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Fragment6_4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment6_4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var flag1 = true
        var flag2 = true
        var flag3 = true
        var flag4 = true
        var flag5 = true
        var flag6 = true
        var flag7 = true
        var flag8 = true
        var flag9 = true
        var flag10 = true
        var flag11 = true
        var flag12 = true
        var flag13 = true
        var flag14 = true
        var flag15 = true
        var flag16 = true


        button1.setOnClickListener {
            if (button1.text == "タプロス®点眼液0.0015%")
                button1.setText("タフルプロスト")
            else {
                button1.setText("タプロス®点眼液0.0015%")
            }
        }

        button2.setOnClickListener {
            if (button2.text == "")
                button2.setText("")
            else {
                button2.setText("")
            }
        }
        button3.setOnClickListener {
            if (button3.text == "")
                button3.setText("")
            else {
                button3.setText("")
            }
        }
        button4.setOnClickListener {
            if (button4.text == "")
                button4.setText("")
            else {
                button4.setText("")
            }
        }
        button5.setOnClickListener {
            if (button5.text == "")
                button5.setText("")
            else {
                button5.setText("")
            }
        }
        button6.setOnClickListener {
            if (button6.text == "")
                button6.setText("")
            else {
                button6.setText("")
            }
        }
        button7.setOnClickListener {
            if (button7.text == "")
                button7.setText("")
            else {
                button7.setText("")
            }
        }
        button8.setOnClickListener {
            if (button8.text == "")
                button8.setText("")
            else {
                button8.setText("")
            }
        }


        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener {
            if (flag1 == true) {
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK6401", flag1)
                editor.commit()
            } else {
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK6401", flag1)
                editor.commit()
            }
        }

        if (preferences.getBoolean("CHECK6401", true) == false) {
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener {
            if (flag2 == true) {
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK6402", flag2)
                editor.commit()
            } else {
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK6402", flag2)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK6402", true) == false) {
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener {
            if (flag3 == true) {
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK6403", flag3)
                editor.commit()

            } else {
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK6403", flag3)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK6403", true) == false) {
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener {
            if (flag4 == true) {
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK6404", flag4)
                editor.commit()
            } else {
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK6404", flag4)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK6404", true) == false) {
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener {
            if (flag5 == true) {
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK6405", flag5)
                editor.commit()
            } else {
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK6405", flag5)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK6405", true) == false) {
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener {
            if (flag6 == true) {
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK6406", flag6)
                editor.commit()
            } else {
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK6406", flag6)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK6406", true) == false) {
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener {
            if (flag7 == true) {
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK6407", flag7)
                editor.commit()
            } else {
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK6407", flag7)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK6407", true) == false) {
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener {
            if (flag8 == true) {
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK6408", flag8)
                editor.commit()
            } else {
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK6408", flag8)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK6408", true) == false) {
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }



        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment6_4_to_Fragment6_3)
        }

    }
}