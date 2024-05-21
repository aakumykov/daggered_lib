package com.github.aakumykov.app

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.aakumykov.daggered_lib.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val user1 = User("Андрей и Лилечка, OkHttp")

        findViewById<TextView>(R.id.textView1).text = App.appComponent.getQwertyFactoryCreator()
            .createQwertyFactory(StorageType.REMOTE)
            ?.create(user1)
            ?.getUser()
            ?.name
    }
}