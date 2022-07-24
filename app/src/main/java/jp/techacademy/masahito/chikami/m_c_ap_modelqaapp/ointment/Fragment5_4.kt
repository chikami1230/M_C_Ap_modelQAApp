package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.ointment

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
class Fragment5_4 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment5_4, container, false)
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
            if (button1.text == "マイザー®軟膏")
                button1.setText("ジフルプレドナート")
            else {
                button1.setText("マイザー®軟膏")
            }
        }
        button2.setOnClickListener {
            if( button2.text == "ラノコナゾールクリーム1%")
                button2.setText("ラノコナゾール")
            else{
                button2.setText("ラノコナゾールクリーム1%")
            }
        }
        button3.setOnClickListener {
            if (button3.text == "リンデロン®VG軟膏")
                button3.setText("ベタメタゾン吉草酸エステル+ゲンタマイシン")
            else {
                button3.setText("リンデロン®VG軟膏")
            }
        }
        button4.setOnClickListener {
            if (button4.text == "リンデロン®VGクリーム")
                button4.setText("ベタメタゾン吉草酸エステル＋ゲンタマイシン")
            else {
                button4.setText("リンデロン®VGクリーム")
            }
        }
        button5.setOnClickListener {
            if( button5.text == "リドメックスローション")
                button5.setText("プレドニゾロン")
            else{
                button5.setText("リドメックスローション")
            }
        }

        button6.setOnClickListener {
            if (button6.text == "ロコイド®軟膏")
                button6.setText("ヒドロコルチゾン")
            else {
                button6.setText("ロコイド®軟膏")
            }
        }
        button7.setOnClickListener {
            if (button7.text == "ロコイド®クリーム")
                button7.setText("ヒドロコルチゾン")
            else {
                button7.setText("ロコイド®クリーム")
            }
        }
        button8.setOnClickListener {
            if( button8.text == "")
                button8.setText("")
            else{
                button8.setText("")
            }
        }



        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK5401",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK5401",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK5401",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK5402",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK5402",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5402",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK5403",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK5403",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5403",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK5404",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK5404",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5404",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK5405",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK5405",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5405",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK5406",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK5406",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5406",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK5407",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK5407",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5407",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK5408",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK5408",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5408",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }



        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment5_4_to_Fragment5_3)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment5_4_to_Fragment5_5)
        }

    }
}