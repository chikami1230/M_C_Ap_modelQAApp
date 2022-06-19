package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle    // ← 追加
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat    // ← 追加
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.navigation.NavigationView    // ← 追加
import com.google.android.material.tabs.TabLayoutMediator
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal.Fragment1_1

// findViewById()を呼び出さずに該当Viewを取得するために必要となるインポート宣言
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*    // ← 追加

class MainActivity() : AppCompatActivity(){

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var drawerLayout: DrawerLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // ナビゲーションドロワーへセット
        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)

        // アプリバーを設定
        // setOfに登録した場合、toolbarに←ボタンが表示されなくなる
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_nomal, R.id.Fragment1_2, R.id.Fragment1_3,R.id.Fragment1_4,R.id.Fragment1_5,
                R.id.Fragment1_6, R.id.Fragment1_7,R.id.Fragment1_8, R.id.Fragment1_9,R.id.Fragment1_10,
                R.id.Fragment1_11,R.id.Fragment1_12,R.id.Fragment1_13,R.id.Fragment1_14,
                R.id.nav_power,R.id.Fragment2_2, R.id.Fragment2_3,R.id.Fragment2_4,R.id.Fragment2_5,
                R.id.Fragment2_6, R.id.Fragment2_7,R.id.Fragment2_8,R.id.Fragment2_9,R.id.Fragment2_10,
                R.id.Fragment2_11,R.id.Fragment2_12,R.id.Fragment2_13,R.id.Fragment2_14,
                R.id.nav_poisonal,R.id.Fragment3_1,
                R.id.nav_psychotropic,R.id.Fragment4_1,R.id.Fragment4_2,R.id.Fragment4_3,
                R.id.nav_gaiyou,R.id.Fragment5_1,R.id.Fragment5_2,R.id.Fragment5_3,R.id.Fragment5_4,
                R.id.Fragment5_5,R.id.Fragment5_6,
                R.id.nav_megusuri,R.id.Fragment6_1,R.id.Fragment6_2,R.id.Fragment6_3,R.id.Fragment6_4,
                R.id.nav_powder,R.id.Fragment7_1,R.id.Fragment7_2,R.id.Fragment7_3,R.id.Fragment7_4,
                R.id.nav_kyuunyuu,R.id.Fragment8_1,R.id.Fragment8_2,R.id.Fragment8_3,R.id.Fragment8_4,
                R.id.nav_about_this_app


            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}


    /*

    , NavigationView.OnNavigationItemSelectedListener {    // ← 修正

    private var mGenre = 0    // ← 追加
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // idがtoolbarがインポート宣言により取得されているので
        // id名でActionBarのサポートを依頼
        setSupportActionBar(toolbar)

        // ～～ ここから
        // ナビゲーションドロワーの設定
        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.app_name, R.string.app_name)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        // ～～ ここまで


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    // ～～ ここから
    override fun onNavigationItemSelected(item: MenuItem): Boolean {  //表示名だけ変わる
        val id = item.itemId

        drawerLayout = findViewById(R.id.drawer_layout)



        if (id == R.id.nav_nomal) {
            toolbar.title = getString(R.string.menu_normal_label)
            mGenre = 1
            //findNavController().navigate(R.id.action_move_Fragment1_1)
            //val navController = findNavController(R.id.action_move_Fragment1_1)
            //return navController.navigateUp() || super.onSupportNavigateUp()
            //val navView:NavigationView = findViewById(Fragment1_1)
            //val navController = findNavController(R.id.mFragment1_1)

            //navView.setupWithNavController(navController)

        } else if (id == R.id.nav_power) {
            toolbar.title = getString(R.string.menu_powerful_drug_label)
            mGenre = 2
          //  val navView:NavigationView = findViewById(R.id.nav_view)
          //  val navController = findNavController(R.layout.fragment2_1)
           // navView.setupWithNavController(navController)

        } else if (id == R.id.nav_poisonal) {
            toolbar.title = getString(R.string.menu_poisonal_drug_label)

            mGenre = 3
        } else if (id == R.id.nav_psychiatric) {
            toolbar.title = getString(R.string.menu_psychiatric_drug_label)

            mGenre = 4
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}

*/