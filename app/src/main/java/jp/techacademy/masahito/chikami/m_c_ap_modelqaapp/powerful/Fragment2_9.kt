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
class Fragment2_9 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_9, container, false)
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
            if(button1.text == "メトホルミン500")
                button1.setText("メトホルミン")
            else{
                button1.setText("メトホルミン500")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "メタクト配合錠LD")
                button2.setText("ピオグリタゾン＋メトホルミン")
            else{
                button2.setText("メタクト配合錠LD")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "メマリーOD5")
                button3.setText("メマンチン")
            else{
                button3.setText("メマリーOD5")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "メマリーOD10")
                button4.setText("メマンチン")
            else{
                button4.setText("メマリーOD10")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "メマリーOD20")
                button5.setText("メマンチン")
            else{
                button5.setText("メマリーOD20")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "メトアナ配合錠LD")
                button6.setText("アナグリプチン＋メトホルミン")
            else{
                button6.setText("メトアナ配合錠LD")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "ラベタロール100")
                button7.setText("ラベタロール")
            else{
                button7.setText("ラベタロール100")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "ラニラピッド0.05")
                button8.setText("メチルジゴキシン")
            else{
                button8.setText("ラニラピッド0.05")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "リスモダン100")
                button9.setText("ジソピラミド")
            else{
                button9.setText("リスモダン100")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "ユニシア配合錠HD")
                button10.setText("カンデサルタン＋アムロジピン")
            else{
                button10.setText("ユニシア配合錠HD")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "レキサルティ2mg")
                button11.setText("ブレクスピラゾール")
            else{
                button11.setText("レキサルティ2mg")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "ワンアルファ1mg")
                button12.setText("アルファカルシフドール")
            else{
                button12.setText("ワンアルファ1mg")
            }
        }



        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK2901",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK2901",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK2901",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK2902",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK2902",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2902",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK2903",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK2903",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2903",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK2904",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK2904",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2904",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK2905",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK2905",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2905",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK2906",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK2906",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2906",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK2907",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK2907",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2907",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK2908",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK2908",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2908",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK2909",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK2909",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2909",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK2910",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK2910",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2910",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK2911",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK2911",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2911",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK2912",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK2912",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2912",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }


        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_9_to_Fragment2_8)
        }
    }
}