package kg.geektech.kotlin4


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import kg.geektech.kotlin4.adapter.Adapter
import kg.geektech.kotlin4.ui.Fragment1
import kg.geektech.kotlin4.ui.Fragment2
import kg.geektech.kotlin4.ui.Fragment3

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager: ViewPager2 = findViewById(R.id.pager)

        val fragments: ArrayList<Fragment> = arrayListOf(
            Fragment1(), Fragment2(), Fragment3()
        )

       val adapter = Adapter(fragments,this)
       viewPager.adapter = adapter
    }
}