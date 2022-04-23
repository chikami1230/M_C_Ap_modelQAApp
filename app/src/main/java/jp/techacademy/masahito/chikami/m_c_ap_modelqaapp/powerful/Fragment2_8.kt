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
class Fragment2_8 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_8, container, false)
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
            if(button1.text == "ベニジピン2mg")
                button1.setText("ベニジピン")
            else{
                button1.setText("ベニジピン2mg")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "ベニジピン4mg")
                button2.setText("ベニジピン")
            else{
                button2.setText("ベニジピン4mg")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "ベタニス25")
                button3.setText("ミラベグロン")
            else{
                button3.setText("ベタニス25")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "ベタニス50")
                button4.setText("ミラベグロン")
            else{
                button4.setText("ベタニス50")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "ベンズブロマロン25")
                button5.setText("ベンズブロマロン")
            else{
                button5.setText("ベンズブロマロン25")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "ベンズブロマロン50")
                button6.setText("ベンズブロマロン")
            else{
                button6.setText("ベンズブロマロン50")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "ボルクレン25")
                button7.setText("ジクロフェナク")
            else{
                button7.setText("ボルクレン25")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "ミカムロ配合錠AP")
                button8.setText("テルミサルタン＋アムロジピン")
            else{
                button8.setText("ミカムロ配合錠AP")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ミカムロ配合錠BP")
                button9.setText("テルミサルタン＋アムロジピン")
            else{
                button9.setText("ミカムロ配合錠BP")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "ミノドロン50")
                button10.setText("ミノドロン酸")
            else{
                button10.setText("ミノドロン50")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "メキシレチンカプセル100")
                button11.setText("メキシレチン")
            else{
                button11.setText("メキシレチンカプセル100")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "メトグルコ250")
                button12.setText("メトホルミン")
            else{
                button12.setText("メトグルコ250")
            }
        }



        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK2801",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK2801",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK2801",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK2802",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK2802",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2802",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK2803",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK2803",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2803",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK2804",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK2804",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2804",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK2805",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK2805",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2805",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK2806",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK2806",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2806",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK2807",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK2807",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2807",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK2808",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK2808",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2808",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK2809",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK2809",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2809",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK2810",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK2810",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2810",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK2811",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK2811",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2811",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK2812",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK2812",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2812",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }


        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_8_to_Fragment2_7)
        }
        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_8_to_Fragment2_9)
        }
    }
}