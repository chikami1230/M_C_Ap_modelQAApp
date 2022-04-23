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
class Fragment2_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_3, container, false)
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
            if(button1.text == "イニシンク配合錠")
                button1.setText("アログリプチン＋メトホルミン")
            else{
                button1.setText("イニシンク配合錠")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "イルアミクスHD")
                button2.setText("イルベサルタン＋アムロジピン")
            else{
                button2.setText("イルアミクスHD")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "イルアミクスLD")
                button3.setText("イルベサルタン＋アムロジピン")
            else{
                button3.setText("イルアミクスLD")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "エックスフォージ配合錠")
                button4.setText("バルサルタン＋アムロジピン")
            else{
                button4.setText("エックスフォージ配合錠")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "エディロールカプセル0.75")
                button5.setText("エディロール")
            else{
                button5.setText("エディロールカプセル0.75")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "エクメットHD")
                button6.setText("ビルダグリプチン＋メトホルミン")
            else{
                button6.setText("エクメットHD")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "エクメットLD")
                button7.setText("ビルダグリプチン＋メトホルミン")
            else{
                button7.setText("エクメットLD")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "エトドラク200")
                button8.setText("エトドラク")
            else{
                button8.setText("エトドラク200")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "カムシア配合錠HD")
                button9.setText("カンデサルタン＋アムロジピン")
            else{
                button9.setText("カムシア配合錠HD")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "カムシア配合錠LD")
                button10.setText("カンデサルタン＋アムロジピン")
            else{
                button10.setText("カムシア配合錠LD")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "カルフィーナ1.0mg")
                button11.setText("アルファカルシドール")
            else{
                button11.setText("カルフィーナ1.0mg")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "カロナール錠500")
                button12.setText("アセトアミノフェン")
            else{
                button12.setText("カロナール錠500")
            }
        }



        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK2301",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK2301",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK2301",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK2302",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK2302",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2302",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK2303",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK2303",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2303",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK2304",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK2304",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2304",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK2305",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK2305",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2305",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK2306",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK2306",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2306",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK2307",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK2307",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2307",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK2308",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK2308",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2308",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK2309",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK2309",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2309",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK2310",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK2310",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2310",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK2311",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK2311",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2311",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK2312",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK2312",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2312",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }


        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_3_to_Fragment2_2)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_3_to_Fragment2_4)
        }
    }
}