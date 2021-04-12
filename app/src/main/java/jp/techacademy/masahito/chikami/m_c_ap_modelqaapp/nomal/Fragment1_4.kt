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

class Fragment1_4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_4, container, false)
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
            if(button1.text == "カロナール200")
                button1.setText("アセトアミノフェン")
            else{
                button1.setText("カロナール200")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "カロナール300")
                button2.setText("アセトアミノフェン")
            else{
                button2.setText("カロナール300")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "ガンマオリザノール50")
                button3.setText("ガンマオリザノール")
            else{
                button3.setText("ガンマオリザノール50")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "クエン酸第一鉄50")
                button4.setText("クエン酸第一鉄")
            else{
                button4.setText("クエン酸第一鉄50")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "グラクティブ25")
                button5.setText("シタグリプチン")
            else{
                button5.setText("グラクティブ25")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "グラクティブ50")
                button6.setText("シタグリプチン")
            else{
                button6.setText("グラクティブ50")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "クラリスロマイシン200")
                button7.setText("クラリスロマイシン")
            else{
                button7.setText("クラリスロマイシン200")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "輪ゴム小")
                button8.setText("輪ゴム小")
            else{
                button8.setText("輪ゴム小")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "グルベス配合錠")
                button9.setText("ミチグリニド＋ボグリボース")
            else{
                button9.setText("グルベス配合錠")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "クレストール2.5")
                button10.setText("ロスバスタチン")
            else{
                button10.setText("クレストール2.5")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "クロピトグレル75")
                button11.setText("クロピドグレル")
            else{
                button11.setText("クロピトグレル75")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "ケタスカプセル10")
                button12.setText("イブジラスト")
            else{
                button12.setText("ケタスカプセル10")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "ザイザル5")
                button13.setText("レボセチリジン")
            else{
                button13.setText("ザイザル5")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "酸化マグネシウム250")
                button14.setText("酸化マグネシウム")
            else{
                button14.setText("酸化マグネシウム250")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "酸化マグネシウム330")
                button15.setText("酸化マグネシウム")
            else{
                button15.setText("酸化マグネシウム330")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "輪ゴム中")
                button16.setText("輪ゴム中")
            else{
                button16.setText("輪ゴム中")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK49",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK49",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK49",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK50",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK50",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK50",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK51",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK51",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK51",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK52",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK52",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK52",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK53",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK53",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK53",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK54",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK54",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK54",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK55",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK55",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK55",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK56",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK56",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK56",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK57",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK57",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK57",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK58",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK58",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK58",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK59",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK59",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK59",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK60",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK60",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK60",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK61",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK61",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK61",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK62",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK62",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK62",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK63",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK63",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK63",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK64",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK64",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK64",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_4_to_Fragment1_3)
        }

        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_4_to_Fragment1_5)
        }
    }
}