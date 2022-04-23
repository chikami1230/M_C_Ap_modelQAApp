package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.powerful

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
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Fragment2_6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_6, container, false)
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
            if(button1.text == "チラーヂンS25")
                button1.setText("レボチロキシン")
            else{
                button1.setText("チラーヂンS25")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "チラーヂンS50")
                button2.setText("レボチロキシン")
            else{
                button2.setText("チラーヂンS50")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "ディレグラ配合錠200")
                button3.setText("フェキソフェナジン＋エフェドリン")
            else{
                button3.setText("ディレグラ配合錠200")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "テオフィリン徐放錠200")
                button4.setText("テオフィリン")
            else{
                button4.setText("テオフィリン徐放錠200")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "テオロング200")
                button5.setText("テオフィリン")
            else{
                button5.setText("テオロング200")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "デジレル")
                button6.setText("トラゾドン")
            else{
                button6.setText("デジレル")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "テラムロ配合錠AP")
                button7.setText("テルミサルタン＋アムロジピン")
            else{
                button7.setText("テラムロ配合錠AP")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "ドネペジルOD5")
                button8.setText("ドネペジル")
            else{
                button8.setText("ドネペジルOD5")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ドネペジルOD10")
                button9.setText("ドネペジル")
            else{
                button9.setText("ドネペジルOD10")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "トラムセット配合錠")
                button10.setText("トラマドール＋アセトアミノフェン")
            else{
                button10.setText("トラムセット配合錠")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "ナイキサン100")
                button11.setText("ナプロキセン")
            else{
                button11.setText("ナイキサン100")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "ニトロペン舌下錠")
                button12.setText("ニトログリセリン")
            else{
                button12.setText("ニトロペン舌下錠")
            }
        }



        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK2601",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK2601",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK2601",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK2602",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK2602",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2602",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK2603",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK2603",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2603",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK2604",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK2604",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2604",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK2605",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK2605",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2605",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK2606",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK2606",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2606",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK2607",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK2607",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2607",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK2608",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK2608",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2608",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK2609",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK2609",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2609",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK2610",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK2610",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2610",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK2611",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK2611",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2611",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK2612",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK2612",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2612",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }


        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_6_to_Fragment2_5)
        }
        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_6_to_Fragment2_7)
        }
    }
}