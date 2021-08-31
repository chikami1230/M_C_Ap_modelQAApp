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

class Fragment1_11 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_11, container, false)
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
            if(button1.text == "ベルソムラ20")
                button1.setText("スボレキサント")
            else{
                button1.setText("ベルソムラ20")
            }
        }

        button2.setOnClickListener {
            if(button2.text == "ペルサンチン25")
                button2.setText("ジピリダモール")
            else{
                button2.setText("ペルサンチン25")
            }
        }
        button3.setOnClickListener {
            if(button3.text == "ボグリボースOD0.3")
                button3.setText("ボグリボース")
            else{
                button3.setText("ボグリボースOD0.3")
            }
        }
        button4.setOnClickListener {
            if(button4.text == "ホクナリン錠1mg")
                button4.setText("ツロブテロール")
            else{
                button4.setText("ホクナリン錠1mg")
            }
        }
        button5.setOnClickListener {
            if(button5.text == "ポドレント配合錠")
                button5.setText("クエン酸K,クエン酸Na")
            else{
                button5.setText("ポドレント配合錠")
            }
        }
        button6.setOnClickListener {
            if(button6.text == "マグミッド500")
                button6.setText("酸化マグネシウム")
            else{
                button6.setText("マグミッド500")
            }
        }
        button7.setOnClickListener {
            if(button7.text == "マックダーゼ配合錠")
                button7.setText("消化酵素製剤")
            else{
                button7.setText("マックダーゼ配合錠")
            }
        }
        button8.setOnClickListener {
            if(button8.text == "ミグリトールOD50")
                button8.setText("ミグリトール")
            else{
                button8.setText("ミグリトールOD50")
            }
        }
        button9.setOnClickListener {
            if(button9.text == "ミグリトールOD75")
                button9.setText("ミグリトール")
            else{
                button9.setText("ミグリトールOD75")
            }
        }
        button10.setOnClickListener {
            if(button10.text == "なし")
                button10.setText("なし")
            else{
                button10.setText("なし")
            }
        }
        button11.setOnClickListener {
            if(button11.text == "ミコンビBP")
                button11.setText("テルミサルタン＋ヒドロクロロチアジド")
            else{
                button11.setText("ミコンビBP")
            }
        }
        button12.setOnClickListener {
            if(button12.text == "ミヤBM錠")
                button12.setText("酪酸菌製剤")
            else{
                button12.setText("ミヤBM錠")
            }
        }
        button13.setOnClickListener {
            if(button13.text == "ムコスタ100")
                button13.setText("レバミピド")
            else{
                button13.setText("ムコスタ100")
            }
        }
        button14.setOnClickListener {
            if(button14.text == "ムコソルバン15")
                button14.setText("アンブロキソール")
            else{
                button14.setText("ムコソルバン15")
            }
        }
        button15.setOnClickListener {
            if(button15.text == "ムコダイン500")
                button15.setText("カルボシステイン")
            else{
                button15.setText("ムコダイン500")
            }
        }
        button16.setOnClickListener {
            if(button16.text == "メチコバール500")
                button16.setText("メコバラミン")
            else{
                button16.setText("メチコバール500")
            }
        }

        val preferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = preferences.edit()

        checkbox_blank1.setOnClickListener{
            if(flag1 == true){
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
                flag1 = false
                editor.putBoolean("CHECK161",flag1)
                editor.commit()
            }else{
                checkbox_blank1.setImageResource(R.drawable.ic_checkbox_blank)
                flag1 = true
                editor.putBoolean("CHECK161",flag1)
                editor.commit()
            }
        }

        if(preferences.getBoolean("CHECK161",true) == false ){
            checkbox_blank1.setImageResource(R.drawable.ic_checkbox_check)
            flag1 = false
        }


        checkbox_blank2.setOnClickListener{
            if(flag2 == true){
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
                flag2 = false
                editor.putBoolean("CHECK162",flag2)
                editor.commit()
            }else{
                checkbox_blank2.setImageResource(R.drawable.ic_checkbox_blank)
                flag2 = true
                editor.putBoolean("CHECK162",flag2)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK162",true) == false ){
            checkbox_blank2.setImageResource(R.drawable.ic_checkbox_check)
            flag2 = false
        }


        checkbox_blank3.setOnClickListener{
            if(flag3 == true){
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
                flag3 = false
                editor.putBoolean("CHECK163",flag3)
                editor.commit()

            }else{
                checkbox_blank3.setImageResource(R.drawable.ic_checkbox_blank)
                flag3 = true
                editor.putBoolean("CHECK163",flag3)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK163",true) == false ){
            checkbox_blank3.setImageResource(R.drawable.ic_checkbox_check)
            flag3 = false
        }

        checkbox_blank4.setOnClickListener{
            if(flag4 == true){
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
                flag4 = false
                editor.putBoolean("CHECK164",flag4)
                editor.commit()
            }else{
                checkbox_blank4.setImageResource(R.drawable.ic_checkbox_blank)
                flag4 = true
                editor.putBoolean("CHECK164",flag4)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK164",true) == false ){
            checkbox_blank4.setImageResource(R.drawable.ic_checkbox_check)
            flag4 = false
        }

        checkbox_blank5.setOnClickListener{
            if(flag5 == true){
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
                flag5 = false
                editor.putBoolean("CHECK165",flag5)
                editor.commit()
            }else{
                checkbox_blank5.setImageResource(R.drawable.ic_checkbox_blank)
                flag5 = true
                editor.putBoolean("CHECK165",flag5)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK165",true) == false ){
            checkbox_blank5.setImageResource(R.drawable.ic_checkbox_check)
            flag5 = false
        }

        checkbox_blank6.setOnClickListener{
            if(flag6== true){
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
                flag6 = false
                editor.putBoolean("CHECK166",flag6)
                editor.commit()
            }else{
                checkbox_blank6.setImageResource(R.drawable.ic_checkbox_blank)
                flag6 = true
                editor.putBoolean("CHECK166",flag6)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK166",true) == false ){
            checkbox_blank6.setImageResource(R.drawable.ic_checkbox_check)
            flag6 = false
        }

        checkbox_blank7.setOnClickListener{
            if(flag7 == true){
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
                flag7 = false
                editor.putBoolean("CHECK167",flag7)
                editor.commit()
            }else{
                checkbox_blank7.setImageResource(R.drawable.ic_checkbox_blank)
                flag7 = true
                editor.putBoolean("CHECK167",flag7)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK167",true) == false ){
            checkbox_blank7.setImageResource(R.drawable.ic_checkbox_check)
            flag7 = false
        }

        checkbox_blank8.setOnClickListener{
            if(flag8 == true){
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
                flag8 = false
                editor.putBoolean("CHECK168",flag8)
                editor.commit()
            }else{
                checkbox_blank8.setImageResource(R.drawable.ic_checkbox_blank)
                flag8 = true
                editor.putBoolean("CHECK168",flag8)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK168",true) == false ){
            checkbox_blank8.setImageResource(R.drawable.ic_checkbox_check)
            flag8 = false
        }

        checkbox_blank9.setOnClickListener{
            if(flag9 == true){
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
                flag9 = false
                editor.putBoolean("CHECK169",flag9)
                editor.commit()
            }else{
                checkbox_blank9.setImageResource(R.drawable.ic_checkbox_blank)
                flag9 = true
                editor.putBoolean("CHECK169",flag9)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK169",true) == false ){
            checkbox_blank9.setImageResource(R.drawable.ic_checkbox_check)
            flag9 = false
        }

        checkbox_blank10.setOnClickListener{
            if(flag10 == true){
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
                flag10 = false
                editor.putBoolean("CHECK170",flag10)
                editor.commit()
            }else{
                checkbox_blank10.setImageResource(R.drawable.ic_checkbox_blank)
                flag10 = true
                editor.putBoolean("CHECK170",flag10)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK170",true) == false ){
            checkbox_blank10.setImageResource(R.drawable.ic_checkbox_check)
            flag10 = false
        }

        checkbox_blank11.setOnClickListener{
            if(flag11 == true){
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
                flag11 = false
                editor.putBoolean("CHECK171",flag11)
                editor.commit()
            }else{
                checkbox_blank11.setImageResource(R.drawable.ic_checkbox_blank)
                flag11 = true
                editor.putBoolean("CHECK171",flag11)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK171",true) == false ){
            checkbox_blank11.setImageResource(R.drawable.ic_checkbox_check)
            flag11 = false
        }

        checkbox_blank12.setOnClickListener{
            if(flag12 == true){
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
                flag12 = false
                editor.putBoolean("CHECK172",flag12)
                editor.commit()
            }else{
                checkbox_blank12.setImageResource(R.drawable.ic_checkbox_blank)
                flag12 = true
                editor.putBoolean("CHECK172",flag12)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK172",true) == false ){
            checkbox_blank12.setImageResource(R.drawable.ic_checkbox_check)
            flag12 = false
        }

        checkbox_blank13.setOnClickListener{
            if(flag13 == true){
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
                flag13= false
                editor.putBoolean("CHECK173",flag13)
                editor.commit()
            }else{
                checkbox_blank13.setImageResource(R.drawable.ic_checkbox_blank)
                flag13= true
                editor.putBoolean("CHECK173",flag13)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK173",true) == false ){
            checkbox_blank13.setImageResource(R.drawable.ic_checkbox_check)
            flag13 = false
        }

        checkbox_blank14.setOnClickListener{
            if(flag14 == true){
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
                flag14 = false
                editor.putBoolean("CHECK174",flag14)
                editor.commit()
            }else{
                checkbox_blank14.setImageResource(R.drawable.ic_checkbox_blank)
                flag14 = true
                editor.putBoolean("CHECK174",flag14)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK174",true) == false ){
            checkbox_blank14.setImageResource(R.drawable.ic_checkbox_check)
            flag14 = false
        }

        checkbox_blank15.setOnClickListener{
            if(flag15 == true){
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
                flag15 = false
                editor.putBoolean("CHECK175",flag15)
                editor.commit()
            }else{
                checkbox_blank15.setImageResource(R.drawable.ic_checkbox_blank)
                flag15 = true
                editor.putBoolean("CHECK175",flag15)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK175",true) == false ){
            checkbox_blank15.setImageResource(R.drawable.ic_checkbox_check)
            flag15 = false
        }

        checkbox_blank16.setOnClickListener{
            if(flag16 == true){
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
                flag16 = false
                editor.putBoolean("CHECK176",flag16)
                editor.commit()
            }else{
                checkbox_blank16.setImageResource(R.drawable.ic_checkbox_blank)
                flag16 = true
                editor.putBoolean("CHECK176",flag16)
                editor.commit()
            }
        }
        if(preferences.getBoolean("CHECK176",true) == false ){
            checkbox_blank16.setImageResource(R.drawable.ic_checkbox_check)
            flag16 = false
        }

        view.findViewById<ImageView>(R.id.button_back).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_11_to_Fragment1_10)
        }

        view.findViewById<ImageView>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_Fragment1_11_to_Fragment1_12)
        }
    }
}