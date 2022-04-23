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
class Fragment2_4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_4, container, false)
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
            if(button1.text == "グリメピリド0.5")
                button1.setText("グリメピリド")
            else{
                button1.setText("グリメピリド0.5")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "グリメピリド1")
                button2.setText("グリメピリド")
            else{
                button2.setText("グリメピリド1")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "グリメピリド3")
                button3.setText("グリメピリド")
            else{
                button3.setText("グリメピリド3")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "グリクラジド20")
                button4.setText("グリメピリド")
            else{
                button4.setText("グリクラジド20")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "コニール2")
                button5.setText("ベニジピン")
            else{
                button5.setText("コニール2")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "コルヒチン0.5")
                button6.setText("コルヒチン")
            else{
                button6.setText("コルヒチン0.5")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "サインバルタカプセル20")
                button7.setText("デュロキセチン")
            else{
                button7.setText("サインバルタカプセル20")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "ザグラスHD")
                button8.setText("アジルサルタン＋アムロジピン")
            else{
                button8.setText("ザグラスHD")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ザグラスLD")
                button9.setText("アジルサルタン＋アムロジピン")
            else{
                button9.setText("ザグラスLD")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "サンリズムカプセル50")
                button10.setText("ピルシカイニド")
            else{
                button10.setText("サンリズムカプセル50")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "ジゴキシンKY0.25")
                button11.setText("ジゴキシン")
            else{
                button11.setText("ジゴキシンKY0.25")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "シベンゾリンコハク100")
                button12.setText("シベンゾリン")
            else{
                button12.setText("シベンゾリンコハク100")
            }
        }



        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK2401",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK2401",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK2401",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK2402",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK2402",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2402",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK2403",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK2403",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2403",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK2404",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK2404",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2404",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK2405",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK2405",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2405",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK2406",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK2406",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2406",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK2407",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK2407",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2407",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK2408",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK2408",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2408",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK2409",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK2409",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2409",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK2410",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK2410",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2410",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK2411",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK2411",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2411",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK2412",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK2412",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2412",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }


        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_4_to_Fragment2_3)
        }
        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment2_4_to_Fragment2_5)
        }
    }
}