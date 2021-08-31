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

class Fragment1_9 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_9, container, false)
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
            if(button1.text == "ビソプロロール2.5")
                button1.setText("ビソプロロール")
            else{
                button1.setText("ビソプロロール2.5")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "ビソプロロール5")
                button2.setText("ビソプロロール")
            else{
                button2.setText("ビソプロロール5")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "ピタバスタチン1")
                button3.setText("ピタバスタチン")
            else{
                button3.setText("ピタバスタチン1")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "ピタバスタチンOD2")
                button4.setText("ピタバスタチン")
            else{
                button4.setText("ピタバスタチンOD2")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "ピタバスタチンカルシウム4")
                button5.setText("ピタバスタチン")
            else{
                button5.setText("ピタバスタチンカルシウム4")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "ビタメジンB25")
                button6.setText("ベンフォチアミン,VB6,VB12")
            else{
                button6.setText("ビタメジンB25")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "ビラノア20")
                button7.setText("ビラスチン")
            else{
                button7.setText("ビラノア20")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "輪ゴム中")
                button8.setText("輪ゴム中")
            else{
                button8.setText("輪ゴム中")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ファモチジンD10")
                button9.setText("ファモチジン")
            else{
                button9.setText("ファモチジンD10")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "ファモチジンOD20")
                button10.setText("ファモチジン")
            else{
                button10.setText("ファモチジンOD20")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "フェノフィブラート53.3")
                button11.setText("フェノフィブラート")
            else{
                button11.setText("フェノフィブラート53.3")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "フェノフィブラート100")
                button12.setText("フェノフィブラート")
            else{
                button12.setText("フェノフィブラート100")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "フェロミア50")
                button13.setText("クエン酸第一鉄Na")
            else{
                button13.setText("フェロミア50")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "フェキソフェナジン60")
                button14.setText("フェキソフェナジン")
            else{
                button14.setText("フェキソフェナジン60")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "フェロベリン配合錠")
                button15.setText("ベルベリン・ゲンノショウコ")
            else{
                button15.setText("フェロベリン配合錠")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "輪ゴム大")
                button16.setText("輪ゴム大")
            else{
                button16.setText("輪ゴム大")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK129",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK129",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK129",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK130",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK130",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK130",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK131",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK131",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK131",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK132",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK132",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK132",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK133",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK133",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK133",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK134",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK134",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK134",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK135",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK135",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK135",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK136",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK136",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK136",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK137",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK137",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK137",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK138",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK138",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK138",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK139",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK139",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK139",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK140",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK140",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK140",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK141",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK141",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK141",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK142",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK142",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK142",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK143",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK143",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK143",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK144",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK144",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK144",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_9_to_Fragment1_8)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_9_to_Fragment1_10)
        }
    }
}