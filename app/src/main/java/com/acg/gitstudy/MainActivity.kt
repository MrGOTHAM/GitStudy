package com.acg.gitstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"这里是main分支！！",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"这是main分支的第四次提交！！",Toast.LENGTH_SHORT).show()
    }
}