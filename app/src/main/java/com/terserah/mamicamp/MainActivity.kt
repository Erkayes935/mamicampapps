package com.terserah.mamicamp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_main_activity_constraint.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_activity_constraint)
        Log.e("onCreate","onCreate")

        TextView1.text = "Nama"
        TextView2.text = "Kelas"
        TextView3.text = "Hobi"
        TextView4.text = "Laki atau Perempuan"

        //Button.text = "Iki Button"

        /*Button.setOnClickListener {
            Toast.makeText(MainActivity@this, TextView1.text.toString(), Toast.LENGTH_SHORT).show()
            TextView4.text = "Mantaaab"
        }*/

    }

    override fun onStart() {
        Log.e("onStart","onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.e("onPause","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("onStop","onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.e("onResume","onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.e("onRestart","onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("onDestroy","onDestroy")
        super.onDestroy()
    }
}
