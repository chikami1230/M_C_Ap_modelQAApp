package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.psychotropic

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
class Fragment4_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment4_1, container, false)
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
            if (button1.text == "マイスリー5mg")
                button1.setText("ゾルピデム")
            else {
                button1.setText("マイスリー5mg")
            }
        }

        button2.setOnClickListener {
            if (button2.text == "マイスリー10mg")
                button2.setText("ゾルピデム")
            else {
                button2.setText("マイスリー10mg")
            }
        }
        button3.setOnClickListener {
            if (button3.text == "ゾルピデム5mg")
                button3.setText("ゾルピデム")
            else {
                button3.setText("ゾルピデム5mg")
            }
        }
        button4.setOnClickListener {
            if (button4.text == "ゾルピデム10mg")
                button4.setText("ゾルピデム")
            else {
                button4.setText("ゾルピデム10mg")
            }
        }
        button5.setOnClickListener {
            if (button5.text == "ゾピクロン7.5mg")
                button5.setText("ゾピクロン")
            else {
                button5.setText("ゾピクロン7.5mg")
            }
        }
        button6.setOnClickListener {
            if (button6.text == "ハルシオン0.25mg")
                button6.setText("トリアゾラム")
            else {
                button6.setText("ハルシオン0.25mg")
            }
        }
        button7.setOnClickListener {
            if (button7.text == "デパス0.5mg")
                button7.setText("エチゾラム")
            else {
                button7.setText("デパス0.5mg")
            }
        }

        button8.setOnClickListener {
            if (button8.text == "デパス0.5mg")
                button8.setText("エチゾラム")
            else {
                button8.setText("デパス0.5mg")
            }
        }
        button9.setOnClickListener {
            if (button9.text == "エチゾラム0.25mg")
                button9.setText("エチゾラム")
            else {
                button9.setText("エチゾラム0.25mg")
            }
        }
        button10.setOnClickListener {
            if (button10.text == "エチゾラム0.5mg")
                button10.setText("エチゾラム")
            else {
                button10.setText("エチゾラム0.5mg")
            }
        }
        button11.setOnClickListener {
            if (button11.text == "ブロチゾラム0.25mg")
                button11.setText("ブロチゾラム")
            else {
                button11.setText("ブロチゾラム0.25mg")
            }
        }

        button12.setOnClickListener {
            if (button12.text == "レンドルミンD錠")
                button12.setText("ブロチゾラム")
            else {
                button12.setText("レンドルミンD錠")
            }
        }

        button13.setOnClickListener {
            if (button13.text == "リーゼ5mg")
                button13.setText("クロチアゼパム")
            else {
                button13.setText("リーゼ5mg")
            }
        }
        button14.setOnClickListener {
            if (button14.text == "クロチアゼパム5mg")
                button14.setText("クロチアゼパム")
            else {
                button14.setText("クロチアゼパム5mg")
            }
        }
        button15.setOnClickListener {
            if (button15.text == "フルニトラゼパム1mg")
                button15.setText("フルニトラゼパム")
            else {
                button15.setText("フルニトラゼパム1mg")
            }
        }
        button16.setOnClickListener {
            if (button16.text == "ニトラゼパム10mg")
                button16.setText("ニトラゼパム")
            else {
                button16.setText("ニトラゼパム10mg")
            }
        }


        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener {
            if (flag1 == true) {
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK4101", flag1)
                editor.commit()
            } else {
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK4101", flag1)
                editor.commit()
            }
        }

        if (preferences.getBoolean("CHECK4101", true) == false) {
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener {
            if (flag2 == true) {
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK4102", flag2)
                editor.commit()
            } else {
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK4102", flag2)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4102", true) == false) {
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener {
            if (flag3 == true) {
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK4103", flag3)
                editor.commit()

            } else {
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK4103", flag3)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4103", true) == false) {
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener {
            if (flag4 == true) {
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK4104", flag4)
                editor.commit()
            } else {
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK4104", flag4)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4104", true) == false) {
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener {
            if (flag5 == true) {
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK4105", flag5)
                editor.commit()
            } else {
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK4105", flag5)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4105", true) == false) {
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener {
            if (flag6 == true) {
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK4106", flag6)
                editor.commit()
            } else {
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK4106", flag6)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4106", true) == false) {
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener {
            if (flag7 == true) {
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK4107", flag7)
                editor.commit()
            } else {
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK4107", flag7)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4107", true) == false) {
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener {
            if (flag8 == true) {
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK4108", flag8)
                editor.commit()
            } else {
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK4108", flag8)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4108", true) == false) {
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener {
            if (flag9 == true) {
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK4109", flag9)
                editor.commit()
            } else {
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK4109", flag9)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4109", true) == false) {
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener {
            if (flag10 == true) {
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK4110", flag10)
                editor.commit()
            } else {
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK4110", flag10)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4110", true) == false) {
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener {
            if (flag11 == true) {
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK4111", flag11)
                editor.commit()
            } else {
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK4111", flag11)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4111", true) == false) {
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener {
            if (flag12 == true) {
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK4112", flag12)
                editor.commit()
            } else {
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK4112", flag12)
                editor.commit()
            }
        }

        if (preferences.getBoolean("CHECK4112", true) == false) {
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }








        checkbox_blank13.setOnClickListener {
            if (flag13 == true) {
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13 = false
                editor.putBoolean("CHECK4113", flag13)
                editor.commit()
            } else {
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13 = true
                editor.putBoolean("CHECK4113", flag13)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4113", true) == false) {
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener {
            if (flag14 == true) {
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK4114", flag14)
                editor.commit()
            } else {
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK4114", flag14)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4114", true) == false) {
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener {
            if (flag15 == true) {
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK4115", flag15)
                editor.commit()
            } else {
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK4115", flag15)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4115", true) == false) {
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }
        checkbox_blank16.setOnClickListener {
            if (flag16 == true) {
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK4116", flag16)
                editor.commit()
            } else {
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK4116", flag16)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK4116", true) == false) {
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment4_1_to_Fragment4_2)
        }

    }
}