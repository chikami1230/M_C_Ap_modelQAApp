package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.inhalant

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
class Fragment8_4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment8_4, container, false)
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



        button1.setOnClickListener {
            if (button1.text == "フルティフォーム®125μgエアゾール56吸入用")
                button1.setText(
                    "フルチカゾンプロピオン酸エステル\n" +
                            "ホルモテロールフマル酸塩水和物"
                )
            else {
                button1.setText("フルティフォーム®125μgエアゾール56吸入用")
            }
        }
        button2.setOnClickListener {
            if (button2.text == "フルティフォーム®125μgエアゾール120吸入用")
                button2.setText(
                    "フルチカゾンプロピオン酸エステル\n" +
                            "ホルモテロールフマル酸塩水和物"
                )
            else {
                button2.setText("フルティフォーム®125μgエアゾール120吸入用")
            }
        }
        button3.setOnClickListener {
            if (button3.text == "リレンザ")
                button3.setText("ザナミビル水和物")
            else {
                button3.setText("リレンザ")
            }
        }
        button4.setOnClickListener {
            if (button4.text == "レルベア100エリプタ14吸入用")
                button4.setText(
                    "ビランテロールトリフェニル酢酸塩\n" +
                            "フルチカゾンフランカルボン酸エステル"
                )
            else {
                button4.setText("レルベア100エリプタ14吸入用")
            }
        }
        button5.setOnClickListener {
            if (button5.text == "レルベア100エリプタ30吸入用")
                button5.setText(
                    "ビランテロールトリフェニル酢酸塩\n" +
                            "フルチカゾンフランカルボン酸エステル"
                )
            else {
                button5.setText("レルベア100エリプタ30吸入用")
            }
        }

        button6.setOnClickListener {
            if (button6.text == "レルベア200エリプタ14吸入用")
                button6.setText(
                    "ビランテロールトリフェニル酢酸塩\n" +
                            "フルチカゾンフランカルボン酸エステル"
                )
            else {
                button6.setText("レルベア200エリプタ14吸入用")
            }
        }
        button7.setOnClickListener {
            if (button7.text == "レルベア200エリプタ30吸入用")
                button7.setText(
                    "ビランテロールトリフェニル酢酸塩\n" +
                            "フルチカゾンフランカルボン酸エステル"
                )
            else {
                button7.setText("レルベア200エリプタ30吸入用")
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
                editor.putBoolean("CHECK8301", flag1)
                editor.commit()
            } else {
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK8301", flag1)
                editor.commit()
            }
        }

        if (preferences.getBoolean("CHECK8301", true) == false) {
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener {
            if (flag2 == true) {
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK8302", flag2)
                editor.commit()
            } else {
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK8302", flag2)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK8302", true) == false) {
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener {
            if (flag3 == true) {
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK8303", flag3)
                editor.commit()

            } else {
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK8303", flag3)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK8303", true) == false) {
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener {
            if (flag4 == true) {
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK8304", flag4)
                editor.commit()
            } else {
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK8304", flag4)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK8304", true) == false) {
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener {
            if (flag5 == true) {
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK8305", flag5)
                editor.commit()
            } else {
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK8305", flag5)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK8305", true) == false) {
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener {
            if (flag6 == true) {
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK8306", flag6)
                editor.commit()
            } else {
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK8306", flag6)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK8306", true) == false) {
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener {
            if (flag7 == true) {
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK8307", flag7)
                editor.commit()
            } else {
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK8307", flag7)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK8307", true) == false) {
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener {
            if (flag8 == true) {
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK8308", flag8)
                editor.commit()
            } else {
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK8308", flag8)
                editor.commit()
            }
        }
        if (preferences.getBoolean("CHECK8308", true) == false) {
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }



        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment8_4_to_Fragment8_3)
        }

    }
}