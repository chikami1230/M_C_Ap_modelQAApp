package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal

import android.os.Bundle
import android.preference.PreferenceManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R
import kotlinx.android.synthetic.main.fragment1_1.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Fragment1_1 : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment1_1, container, false)
        return root
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
            if(button1.text == "アジルバ10")
                button1.setText("アジルサルタン")
            else{
                button1.setText("アジルバ10")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "アジルバ20")
                button2.setText("アジルサルタン")
            else{
                button2.setText("アジルバ20")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "アジルバ40")
                button3.setText("アジルサルタン")
            else{
                button3.setText("アジルバ40")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "アスベリン20")
                button4.setText("アスベリン")
            else{
                button4.setText("アスベリン20")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "アゼルニジピン8")
                button5.setText("アゼルニジピン")
            else{
                button5.setText("アゼルニジピン8")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "アゼルニジピン16")
                button6.setText("アゼルニジピン")
            else{
                button6.setText("アゼルニジピン16")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "アモキシシリン250")
                button7.setText("アモキシシリン")
            else{
                button7.setText("アモキシシリン250")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "なし")
                button8.setText("薬入ってない所")
            else{
                button8.setText("なし")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "アテノロール25")
                button9.setText("アテノロール")
            else{
                button9.setText("アテノロール25")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "アテノロール50")
                button10.setText("アテノロール")
            else{
                button10.setText("アテノロール50")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "アトーゼットLD")
                button11.setText("エゼチミブ10mg,アトルバスタチン10mg")
            else{
                button11.setText("アトーゼットLD")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "アトーゼットHD")
                button12.setText("エゼチミブ10mg,アトルバスタチン20mg")
            else{
                button12.setText("アトーゼットHD")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "アトルバスタチン5")
                button13.setText("アトルバスタチン")
            else{
                button13.setText("アトルバスタチン5")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "アトルバスタチン10")
                button14.setText("アトルバスタチン")
            else{
                button14.setText("アトルバスタチン10")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "アリナミンF25")
                button15.setText("フルスルチアミン錠(VB1,VB1誘導体)")
            else{
                button15.setText("アリナミンF25")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "なし")
                button16.setText("薬入ってない所")
            else{
                button16.setText("なし")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()



        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK1",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK1",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK1",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK2",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK2",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK2",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK3",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK3",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK3",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK4",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK4",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK4",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK5",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK5",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK5",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK6",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK6",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK6",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK7",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK7",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK7",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK8",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK8",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK8",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK9",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK9",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK9",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK10",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK10",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK10",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK11",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK11",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK11",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK12",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK12",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK12",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK13",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK13",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK13",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK14",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK14",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK14",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK15",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK15",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK15",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK16",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK16",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK16",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }


        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_1_to_Fragment1_2)
        }
    }
}