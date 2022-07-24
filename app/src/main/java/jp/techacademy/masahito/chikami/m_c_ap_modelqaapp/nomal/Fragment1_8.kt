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

class Fragment1_8 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_8, container, false)
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
            if(button1.text == "ニコランジル5")
                button1.setText("ニコランジル")
            else{
                button1.setText("ニコランジル5")
            }
        }

        button2.setOnClickListener {
            if (button2.text == "ネキシウム®10")
                button2.setText("エソメプラゾール")
            else {
                button2.setText("ネキシウム®10")
            }
        }
        button3.setOnClickListener {
            if (button3.text == "ネキシウム®20")
                button3.setText("エソメプラゾール")
            else {
                button3.setText("ネキシウム®20")
            }
        }
        button4.setOnClickListener {
            if (button4.text == "ネシーナ®12.5")
                button4.setText("アログリプチン")
            else {
                button4.setText("ネシーナ®12.5")
            }
        }
        button5.setOnClickListener {
            if (button5.text == "ネシーナ®25")
                button5.setText("アログリプチン")
            else {
                button5.setText("ネシーナ®25")
            }
        }
        button6.setOnClickListener {
            if (button6.text == "バイアスピリン®")
                button6.setText("アスピリン")
            else {
                button6.setText("バイアスピリン®")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "バルサルタン20")
                button7.setText("バルサルタン")
            else{
                button7.setText("バルサルタン20")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "バルサルタン40")
                button8.setText("バルサルタン")
            else{
                button8.setText("バルサルタン40")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "バルサルタン80")
                button9.setText("バルサルタン")
            else{
                button9.setText("バルサルタン80")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "バルサルタン160")
                button10.setText("バルサルタン")
            else{
                button10.setText("バルサルタン160")
            }
        }
        button11.setOnClickListener {
            if (button11.text == "ビオスリー®配合")
                button11.setText("ラクトミン(乳酸菌)")
            else {
                button11.setText("ビオスリー®配合")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "ピオグリタゾン15")
                button12.setText("ピオグリタゾン")
            else{
                button12.setText("ピオグリタゾン15")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "ピオグリタゾン30")
                button13.setText("ピオグリタゾン")
            else{
                button13.setText("ピオグリタゾン30")
            }
        }
        button14.setOnClickListener {
            if (button14.text == "ビオフェルミン®錠剤")
                button14.setText("ビフィズス菌")
            else {
                button14.setText("ビオフェルミン®錠剤")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "ビソプロロール0.625")
                button15.setText("ビソプロロール")
            else{
                button15.setText("ビソプロロール0.625")
            }
        }
        button16.setOnClickListener {
            if (button16.text == "")
                button16.setText("")
            else {
                button16.setText("")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK113",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK113",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK113",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK114",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK114",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK114",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK115",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK115",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK115",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK116",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK116",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK116",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK117",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK117",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK117",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK118",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK118",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK118",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK119",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK119",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK119",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK120",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK120",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK120",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK121",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK121",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK121",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK122",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK122",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK122",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK123",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK123",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK123",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK124",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK124",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK124",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK125",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK125",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK125",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK126",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK126",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK126",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK127",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK127",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK127",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK128",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK128",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK128",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_8_to_Fragment1_7)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_8_to_Fragment1_9)
        }
    }
}