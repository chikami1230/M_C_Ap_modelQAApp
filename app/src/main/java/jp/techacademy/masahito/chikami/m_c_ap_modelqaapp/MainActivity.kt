package jp.techacademy.masahito.chikami.m_c_ap_modelqaapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle    // ← 追加
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
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.navigation.NavigationView    // ← 追加
import jp.techacademy.masahito.chikami.m_c_ap_modelqaapp.nomal.Fragment1_1

// findViewById()を呼び出さずに該当Viewを取得するために必要となるインポート宣言
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*    // ← 追加

class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener {    // ← 修正

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
            val navView:NavigationView = findViewById(R.id.nav_view)
            val navController = findNavController(R.id.mFragment1_1)


            navView.setupWithNavController(navController)

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

}