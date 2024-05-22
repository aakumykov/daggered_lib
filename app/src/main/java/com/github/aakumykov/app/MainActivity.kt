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

        val user = User("Андрей и Лилечка, библиотека без Dagger-а")

        val text =
            App.appComponent.getQwertyCreatorFactory()
                .createQwertyCreator(StorageType.REMOTE)
                ?.createQwerty(user)
                ?.getUser()
                ?.name

        findViewById<TextView>(R.id.textView1).text = text
    }
}