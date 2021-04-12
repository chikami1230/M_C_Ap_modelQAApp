package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal

import android.os.Bundle
import android.preference.PreferenceManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R
import kotlinx.android.synthetic.main.fragment1_1.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Fragment1_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_3, container, false)
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
            if(button1.text == "エパルレスタット50")
                button1.setText("エパルレスタット")
            else{
                button1.setText("エパルレスタット50")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "エピナスチン10")
                button2.setText("エピナスチン")
            else{
                button2.setText("エピナスチン10")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "エピナスチン20")
                button3.setText("エピナスチン")
            else{
                button3.setText("エピナスチン20")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "エペリゾン50")
                button4.setText("エペリゾン")
            else{
                button4.setText("エペリゾン50")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "オルメサルタンOD10")
                button5.setText("オルメサルタン")
            else{
                button5.setText("オルメサルタンOD10")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "オルメサルタンOD20")
                button6.setText("オルメサルタン")
            else{
                button6.setText("オルメサルタンOD20")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "オルメサルタンOD40")
                button7.setText("オルメサルタン")
            else{
                button7.setText("オルメサルタンOD40")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "オロパタジンOD5")
                button8.setText("オロパタジン")
            else{
                button8.setText("オロパタジンOD5")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "オングリザ5")
                button9.setText("オキサグリプチン")
            else{
                button9.setText("オングリザ5")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "カルベジロール2.5")
                button10.setText("カルベジロール")
            else{
                button10.setText("カルベジロール2.5")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "カルベジロール10")
                button11.setText("カルベジロール")
            else{
                button11.setText("カルベジロール10")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "カルボシステイン500")
                button12.setText("カルボシステイン")
            else{
                button12.setText("カルボシステイン500")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "カンデサルタン2")
                button13.setText("カンデサルタン")
            else{
                button13.setText("カンデサルタン2")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "カンデサルタン4")
                button14.setText("カンデサルタン")
            else{
                button14.setText("カンデサルタン4")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "カンデサルタン8")
                button15.setText("カンデサルタン")
            else{
                button15.setText("カンデサルタン8")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "カンデサルタン12")
                button16.setText("カンデサルタン")
            else{
                button16.setText("カンデサルタン12")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK33",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK33",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK33",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK34",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK34",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK34",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK35",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK35",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK35",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK36",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK36",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK36",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK37",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK37",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK37",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK38",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK38",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK38",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK39",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK39",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK39",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK40",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK40",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK40",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK41",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK41",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK41",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK42",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK42",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK42",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK43",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK43",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK43",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK44",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK44",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK44",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK45",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK45",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK45",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK46",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK46",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK46",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK47",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK47",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK47",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK48",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK48",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK48",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_3_to_Fragment1_2)
        }

        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_3_to_Fragment1_4)
        }
    }
}