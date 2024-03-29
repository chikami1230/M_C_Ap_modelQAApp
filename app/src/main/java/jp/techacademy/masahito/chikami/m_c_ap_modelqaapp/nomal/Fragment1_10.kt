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

class Fragment1_10 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_10, container, false)
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
            if (button1.text == "フォシーガ®5")
                button1.setText("ダパグリフロジン")
            else {
                button1.setText("フォシーガ®5")
            }
        }

        button2.setOnClickListener {
            if (button2.text == "フェブリク®10")
                button2.setText("フェブキソスタット")
            else {
                button2.setText("フェブリク®10")
            }
        }
        button3.setOnClickListener {
            if (button3.text == "フェブリク®20")
                button3.setText("フェブキソスタット")
            else {
                button3.setText("フェブリク®20")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "プラバスタチン10")
                button4.setText("プラバスタチン")
            else{
                button4.setText("プラバスタチン10")
            }
        }
        button5.setOnClickListener {
            if (button5.text == "フラベリック®20")
                button5.setText("フラベリック")
            else {
                button5.setText("フラベリック®20")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "プランルカスト112.5")
                button6.setText("プランルカスト")
            else{
                button6.setText("プランルカスト112.5")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "フルバスタチン30")
                button7.setText("フルバスタチン")
            else{
                button7.setText("フルバスタチン30")
            }
        }
        button8.setOnClickListener {
            if (button8.text == "プレドニン®5")
                button8.setText("プレドニゾロン")
            else {
                button8.setText("プレドニン®5")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ベザフィブラートSR200")
                button9.setText("ベザフィブラート")
            else{
                button9.setText("ベザフィブラートSR200")
            }
        }
        button10.setOnClickListener {
            if (button10.text == "ベシケア®OD5")
                button10.setText("ソリフェナシン")
            else {
                button10.setText("ベシケア®OD5")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "ベタヒスチン6")
                button11.setText("ベタヒスチン")
            else{
                button11.setText("ベタヒスチン6")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "ベボタスチンベシルOD10")
                button12.setText("ベポタスチン")
            else{
                button12.setText("ベボタスチンベシルOD10")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "ベラパミル40")
                button13.setText("ベラパミル")
            else{
                button13.setText("ベラパミル40")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "ペリンドプリル4")
                button14.setText("ペリンドプリル")
            else{
                button14.setText("ペリンドプリル4")
            }
        }
        button15.setOnClickListener {
            if (button15.text == "ペルジピン®20")
                button15.setText("ニカルジピン")
            else {
                button15.setText("ペルジピン®20")
            }
        }
        button16.setOnClickListener {
            if (button16.text == "ベルソムラ®15")
                button16.setText("スボレキサント")
            else {
                button16.setText("ベルソムラ®15")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK145",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK145",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK145",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK146",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK146",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK146",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK147",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK147",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK147",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK148",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK148",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK148",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK149",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK149",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK149",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK150",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK150",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK150",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK151",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK151",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK151",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK152",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK152",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK152",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK153",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK153",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK153",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK154",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK154",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK154",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK155",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK155",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK155",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK156",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK156",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK156",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK157",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK157",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK157",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK158",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK158",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK158",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK159",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK159",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK159",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK160",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK160",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK160",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_10_to_Fragment1_9)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_10_to_Fragment1_11)
        }
    }
}