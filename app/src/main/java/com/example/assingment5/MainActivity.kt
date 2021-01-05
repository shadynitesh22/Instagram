package com.example.assingment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var username:TextView
    private lateinit var password:TextView
    private lateinit var login:TextView
    private lateinit var signup:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username=findViewById(R.id.usernamehint)
        password=findViewById(R.id.passhint)
        login=findViewById(R.id.login)
        signup=findViewById(R.id.signup)



    }

    fun Signup (view: View){
        when(view?.id){
            R.id.signup->{
                val intent = Intent(
                    this@MainActivity,signupActivity::class.java

                )
                startActivity(intent)
            }
        }
    }

}