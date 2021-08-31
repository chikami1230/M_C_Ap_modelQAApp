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

class Fragment1_6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_6, container, false)
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
            if(button1.text == "セルベックス50")
                button1.setText("テプレノン")
            else{
                button1.setText("セルベックス50")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "セレキノン100")
                button2.setText("トリメブチン")
            else{
                button2.setText("セレキノン100")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "センノシド12")
                button3.setText("センノシド")
            else{
                button3.setText("センノシド12")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "ソランタール100")
                button4.setText("チアラミド")
            else{
                button4.setText("ソランタール100")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "タケキャブ10")
                button5.setText("ボノプラザン")
            else{
                button5.setText("タケキャブ10")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "タケキャブ20")
                button6.setText("ボノプラザン")
            else{
                button6.setText("タケキャブ20")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "タケルダ配合錠")
                button7.setText("アスピリン＋ランソプラゾール")
            else{
                button7.setText("タケルダ配合錠")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "タケプロンOD15")
                button8.setText("ランソプラゾール")
            else{
                button8.setText("タケプロンOD15")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "タベジール1")
                button9.setText("クレマスチン")
            else{
                button9.setText("タベジール1")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "チクロピジン100")
                button10.setText("チクロピジン")
            else{
                button10.setText("チクロピジン100")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "ディオバン40")
                button11.setText("バルサルタン")
            else{
                button11.setText("ディオバン40")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "テオフィリン徐放錠100")
                button12.setText("テオフィリン")
            else{
                button12.setText("テオフィリン徐放錠100")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "デキストロメトルファン15")
                button13.setText("デキストロメトルファン")
            else{
                button13.setText("デキストロメトルファン15")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "テネリア20")
                button14.setText("テネリグリプチン")
            else{
                button14.setText("テネリア20")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "テプレノン50")
                button15.setText("テプレノン")
            else{
                button15.setText("テプレノン50")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "デベルザ20")
                button16.setText("トホグリフロジン")
            else{
                button16.setText("デベルザ20")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK81",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK81",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK81",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK82",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK82",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK82",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK83",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK83",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK83",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK84",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK84",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK84",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK85",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK85",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK85",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK86",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK86",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK86",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK87",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK87",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK87",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK88",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK88",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK88",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK89",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK889",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK89",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK90",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK90",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK90",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK91",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK91",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK91",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK92",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK92",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK92",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK93",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK93",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK93",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK94",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK94",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK94",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK95",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK95",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK95",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK96",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK96",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK96",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_6_to_Fragment1_5)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_6_to_Fragment1_7)
        }
    }
}