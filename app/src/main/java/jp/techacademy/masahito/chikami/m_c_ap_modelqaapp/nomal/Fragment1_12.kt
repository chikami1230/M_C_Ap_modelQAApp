package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal

import android.os.Bundle
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R
import kotlinx.android.synthetic.main.fragment1_1.*

class Fragment1_12 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_12, container, false)
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
            if(button1.text == "メジコン15")
                button1.setText("デキストロメトルファン")
            else{
                button1.setText("メジコン15")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "メトクロプラミド5")
                button2.setText("メトクロプラミド")
            else{
                button2.setText("メトクロプラミド5")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "モンテルカスト5")
                button3.setText("モンテルカスト")
            else{
                button3.setText("モンテルカスト5")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "モンテルカスト10")
                button4.setText("モンテルカスト")
            else{
                button4.setText("モンテルカスト10")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "モサプリドクエン酸塩5")
                button5.setText("モサプリドクエン酸塩")
            else{
                button5.setText("モサプリドクエン酸塩5")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "なし")
                button6.setText("なし")
            else{
                button6.setText("なし")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "ランソプラゾールOD15")
                button7.setText("ランソプラゾール")
            else{
                button7.setText("ランソプラゾールOD15")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "小物")
                button8.setText("小物")
            else{
                button8.setText("小物")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ラベプラゾール10")
                button9.setText("ラベプラゾール")
            else{
                button9.setText("ラベプラゾール10")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "リオベルHD")
                button10.setText("アログリプチン")
            else{
                button10.setText("リオベルHD")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "リオベルLD")
                button11.setText("アログリプチン")
            else{
                button11.setText("リオベルLD")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "リバロ1")
                button12.setText("ピタバスタチン")
            else{
                button12.setText("リバロ1")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "リバロ2")
                button13.setText("ピタバスタチン")
            else{
                button13.setText("リバロ2")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "リピトール5")
                button14.setText("アトルバスタチン")
            else{
                button14.setText("リピトール5")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "リピトール10")
                button15.setText("アトルバスタチン")
            else{
                button15.setText("リピトール10")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "メモ用紙")
                button16.setText("メモ用紙")
            else{
                button16.setText("メモ用紙")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK177",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK177",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK177",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK178",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK178",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK178",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK179",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK179",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK179",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK180",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK180",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK180",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK181",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK181",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK181",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK182",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK182",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK182",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK183",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK183",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK183",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK184",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK184",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK184",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK185",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK185",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK185",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK186",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK186",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK186",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK187",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK187",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK187",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK188",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK188",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK188",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK189",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK189",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK189",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK190",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK190",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK190",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK191",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK191",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK191",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK192",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK192",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK192",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_12_to_Fragment1_11)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_12_to_Fragment1_13)
        }
    }
}