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

class Fragment1_5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_5, container, false)
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
            if(button1.text == "ジルチアゼムR100")
                button1.setText("ジルチアゼム")
            else{
                button1.setText("ジルチアゼムR100")
            }
        }

        button2.setOnClickListener {
            if (button2.text == "シダキュア®5000")
                button2.setText("(スギ花粉の減感)")
            else {
                button2.setText("シダキュア®5000")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "ジメチコン40")
                button3.setText("ジメチコン")
            else{
                button3.setText("ジメチコン40")
            }
        }
        button4.setOnClickListener {
            if (button4.text == "ジャディアンス®10")
                button4.setText("エンパグリフロジン")
            else {
                button4.setText("ジャディアンス®10")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "シルニジピン5")
                button5.setText("シルニジピン")
            else{
                button5.setText("シルニジピン5")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "シルニジピン10")
                button6.setText("シルニジピン")
            else{
                button6.setText("シルニジピン10")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "シルニジピン20")
                button7.setText("シルニジピン")
            else{
                button7.setText("シルニジピン20")
            }
        }
        button8.setOnClickListener {
            if (button8.text == "")
                button8.setText("")
            else {
                button8.setText("")
            }
        }
        button9.setOnClickListener {
            if (button9.text == "シングレア®10")
                button9.setText("モンテルカスト")
            else {
                button9.setText("シングレア®10")
            }
        }
        button10.setOnClickListener {
            if (button10.text == "スイニー®100")
                button10.setText("アナグリプチン")
            else {
                button10.setText("スイニー®100")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "スピロノラクトン25")
                button11.setText("スピロノラクトン")
            else{
                button11.setText("スピロノラクトン25")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "スプラタスト100")
                button12.setText("スプラタスト")
            else{
                button12.setText("スプラタスト100")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "スルピリド50")
                button13.setText("スルピリド")
            else{
                button13.setText("スルピリド50")
            }
        }
        button14.setOnClickListener {
            if (button14.text == "セイブル®50")
                button14.setText("ミグリトール")
            else {
                button14.setText("セイブル®50")
            }
        }
        button15.setOnClickListener {
            if (button15.text == "ゼチーア®10")
                button15.setText("エゼチミブ")
            else {
                button15.setText("ゼチーア®10")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "セフジトレンピボキシル100")
                button16.setText("セフジトレンピボキシル")
            else{
                button16.setText("セフジトレンピボキシル100")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK65",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK65",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK65",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK66",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK66",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK66",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK67",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK67",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK67",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK68",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK68",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK68",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK69",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK69",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK69",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK70",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK70",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK70",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK71",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK71",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK71",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK72",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK72",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK72",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK73",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK73",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK73",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK74",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK74",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK74",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK75",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK75",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK75",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK76",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK76",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK76",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK77",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK77",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK77",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK78",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK78",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK78",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK79",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK79",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK79",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK80",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK80",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK80",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_5_to_Fragment1_4)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_5_to_Fragment1_6)
        }
    }
}