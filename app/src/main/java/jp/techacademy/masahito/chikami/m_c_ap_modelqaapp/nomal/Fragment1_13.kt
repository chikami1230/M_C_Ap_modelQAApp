package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal

import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.R
import kotlinx.android.synthetic.main.fragment1_1.*

class Fragment1_13 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_13, container, false)
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
            if(button1.text == "リポバス5")
                button1.setText("シンバスタチン")
            else{
                button1.setText("リポバス5")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "リマプロストアルファデクス5")
                button2.setText("リマプロストアルファデクス")
            else{
                button2.setText("リマプロストアルファデクス5")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "リリカOD錠25")
                button3.setText("プレガバリン")
            else{
                button3.setText("リリカOD錠25")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "リリカカプセル75")
                button4.setText("プレガバリン")
            else{
                button4.setText("リリカカプセル75")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "レザルタスHD")
                button5.setText("オルメサルタン＋アゼルニジピン")
            else{
                button5.setText("レザルタスHD")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "レバミピド100")
                button6.setText("レバミピド")
            else{
                button6.setText("レバミピド100")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "レボフロキサシン500")
                button7.setText("レボフロキサシン")
            else{
                button7.setText("レボフロキサシン500")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "なし")
                button8.setText("なし")
            else{
                button8.setText("なし")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ロキソニン60")
                button9.setText("ロキソプロフェン")
            else{
                button9.setText("ロキソニン60")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "ロゼレム8")
                button10.setText("ラメルテオン")
            else{
                button10.setText("ロゼレム8")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "ロキソプロフェン60")
                button11.setText("ロキソプロフェン")
            else{
                button11.setText("ロキソプロフェン60")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "ロスバスタチン2.5")
                button12.setText("ロスバスタチン")
            else{
                button12.setText("ロスバスタチン2.5")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "ロスバスタチン5")
                button13.setText("ロスバスタチン")
            else{
                button13.setText("ロスバスタチン5")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "ロペラミド1")
                button14.setText("ロペラミド")
            else{
                button14.setText("ロペラミド1")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "なし")
                button15.setText("なし")
            else{
                button15.setText("なし")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "なし")
                button16.setText("なし")
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
                editor.putBoolean("CHECK193",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK193",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK193",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK194",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK194",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK194",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK195",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK195",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK195",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK196",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK196",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK196",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK197",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK197",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK197",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK198",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK198",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK198",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK199",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK199",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK199",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK200",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK200",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK200",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK201",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK201",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK201",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK202",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK202",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK202",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK203",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK203",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK203",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK204",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK204",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK204",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK205",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK205",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK205",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK206",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK206",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK206",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK207",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK207",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK207",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK208",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK208",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK208",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_13_to_Fragment1_12)
        }

        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_13_to_Fragment1_14)
            Log.d("test","test")
        }
    }
}