package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal

import android.os.Bundle
import android.preference.PreferenceManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R
import kotlinx.android.synthetic.main.fragment1_1.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Fragment1_2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_2, container, false)
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
            if(button1.text == "アレジオン10")
                button1.setText("エピナスチン")
            else{
                button1.setText("アレジオン10")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "アレジオン20")
                button2.setText("エピナスチン")
            else{
                button2.setText("アレジオン20")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "アロプリノール100")
                button3.setText("アロプリノール")
            else{
                button3.setText("アロプリノール100")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "アンブロキソール15")
                button4.setText("アンブロキソール")
            else{
                button4.setText("アンブロキソール15")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "イグザレルト10")
                button5.setText("リバーロキサバン")
            else{
                button5.setText("イグザレルト10")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "イグザレルト15")
                button6.setText("リバーロキサバン")
            else{
                button6.setText("イグザレルト15")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "イトプリド50")
                button7.setText("イトプリド")
            else{
                button7.setText("イトプリド50")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "なし")
                button8.setText("なし")
            else{
                button8.setText("なし")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "イフェンプロジル20")
                button9.setText("イフェンプロジル")
            else{
                button9.setText("イフェンプロジル20")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "イルソグラジン2")
                button10.setText("イルソグラジン")
            else{
                button10.setText("イルソグラジン2")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "イルベサルタン100")
                button11.setText("イルベサルタン")
            else{
                button11.setText("イルベサルタン100")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "イルベサルタン200")
                button12.setText("イルベサルタン")
            else{
                button12.setText("イルベサルタン200")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "ウリアデック40")
                button13.setText("トピロキソスタット")
            else{
                button13.setText("ウリアデック40")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "ウルソ100")
                button14.setText("ウルソデオキシコール酸")
            else{
                button14.setText("ウルソ100")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "ウルソデオキシコール")
                button15.setText("ウルソデオキシコール酸")
            else{
                button15.setText("ウルソデオキシコール")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "エクア")
                button16.setText("ビルダグリプチン")
            else{
                button16.setText("エクア")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK17",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK17",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK17",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK18",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK18",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK18",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK19",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK19",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK19",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK20",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK20",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK20",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK21",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK21",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK21",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK22",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK22",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK22",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK23",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK23",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK23",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK24",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK24",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK24",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK25",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK25",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK25",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK26",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK26",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK26",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK27",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK27",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK27",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK28",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK28",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK28",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK29",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK29",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK29",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK30",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK30",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK30",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK31",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK31",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK31",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK32",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK32",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK32",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_2_to_Fragment1_1)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_2_to_Fragment1_3)
        }
    }
}