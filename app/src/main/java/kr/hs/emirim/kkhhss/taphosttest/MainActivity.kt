package kr.hs.emirim.kkhhss.taphosttest

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Suppress("deprecation")
class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec1 = tabHost.newTabSpec("spec1").setIndicator("아이브")
        tabSpec1.setContent(R.id.img1)
        tabHost.addTab(tabSpec1)

        var tabSpec2 = tabHost.newTabSpec("spec2").setIndicator("뉴진스")
        tabSpec2.setContent(R.id.img2)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("spec3").setIndicator("트와이스")
        tabSpec3.setContent(R.id.img3)
        tabHost.addTab(tabSpec3)

        var tabSpec4 = tabHost.newTabSpec("spec4").setIndicator("아이들")
        tabSpec4.setContent(R.id.img4)
        tabHost.addTab(tabSpec4)

        tabHost.currentTab = 1
    }
}