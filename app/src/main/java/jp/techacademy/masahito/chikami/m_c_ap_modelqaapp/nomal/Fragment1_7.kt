package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal

import android.os.Bundle
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R
import kotlinx.android.synthetic.main.fragment1_1.*

class Fragment1_7 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_7, container, false)
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
            if(button1.text == "テルミサルタン20")
                button1.setText("テルミサルタン")
            else{
                button1.setText("テルミサルタン20")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "テルミサルタン40")
                button2.setText("テルミサルタン")
            else{
                button2.setText("テルミサルタン40")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "d-クロルフェニラミン6")
                button3.setText("d-クロルフェニラミン")
            else{
                button3.setText("d-クロルフェニラミン6")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "デルギンG１")
                button4.setText("クレマスチン")
            else{
                button4.setText("デルギンG１")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "ドキサゾシン1")
                button5.setText("ドキサゾシン")
            else{
                button5.setText("ドキサゾシン1")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "ドキサゾシン2")
                button6.setText("ドキサゾシン")
            else{
                button6.setText("ドキサゾシン2")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "ドグマチール50")
                button7.setText("スルピリド")
            else{
                button7.setText("ドグマチール50")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "ナトリックス1")
                button8.setText("インダパミド")
            else{
                button8.setText("ナトリックス1")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "トラニラスト100")
                button9.setText("トラニラスト")
            else{
                button9.setText("トラニラスト100")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "トラゼンタ5")
                button10.setText("リナグリプチン")
            else{
                button10.setText("トラゼンタ5")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "トラディアンスAP")
                button11.setText("エンパグリフロジン＋リナグリプチン")
            else{
                button11.setText("トラディアンスAP")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "トラネキサム酸250")
                button12.setText("トラネキサム酸")
            else{
                button12.setText("トラネキサム酸250")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "トリメブチン100")
                button13.setText("トリメブチン")
            else{
                button13.setText("トリメブチン100")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "トランサミン250")
                button14.setText("トラネキサム酸")
            else{
                button14.setText("トランサミン250")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "ドンペリドン10")
                button15.setText("ドンペリドン")
            else{
                button15.setText("ドンペリドン10")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "ナトリックス1")
                button16.setText("インダパミド")
            else{
                button16.setText("ナトリックス1")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK97",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK97",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK97",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK98",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK98",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK98",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK99",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK99",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK99",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK100",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK100",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK100",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK101",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK101",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK101",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK102",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK102",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK102",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK103",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK103",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK103",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK104",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK104",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK104",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK105",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK105",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK105",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK106",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK106",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK106",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK107",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK107",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK107",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK108",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK108",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK108",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK109",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK109",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK109",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK110",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK110",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK110",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK111",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK111",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK111",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK112",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK112",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK112",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_7_to_Fragment1_6)
        }

        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_7_to_Fragment1_8)
        }
    }
}