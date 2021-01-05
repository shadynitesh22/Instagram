package com.example.assingment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class signupActivity : AppCompatActivity() {
    private val category = arrayListOf("Batch-25B", "Batch-25C", "Batch-25D","Batch-25A")
    private lateinit var login:Button
    private lateinit var signup:Button
    private lateinit var fname:TextView
    private lateinit var sname:TextView
    private lateinit var username:TextView
    private lateinit var paswword:TextView
    private lateinit var coventryid:TextView
    private lateinit var spinner: Spinner
    private var selectedI =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        spinner = findViewById(R.id.spinner)
        login=findViewById(R.id.login)
        signup=findViewById(R.id.signup)
        fname=findViewById(R.id.fnamehint)
        sname=findViewById(R.id.lnamehint)
        username=findViewById(R.id.userhint)
        paswword=findViewById(R.id.passhint)
        coventryid=findViewById(R.id.covhint)

        val adapter
                = ArrayAdapter(this, android.R.layout.simple_list_item_1, category)
        spinner.adapter=adapter
        spinner.onItemSelectedListener =object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                selectedI = parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@signupActivity,"$selectedI", Toast.LENGTH_SHORT).show()


            }


            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
    fun Login(view: View){
        when(view?.id){
            R.id.signup->{
                var batch= selectedI
                var firname =fname.toString()
                var secname= sname.toString()
                var usrname=username.toString()
                var pass=paswword.toString()
                var id=coventryid.toString()
                Toast.makeText(this, "You have singed up ", Toast.LENGTH_SHORT).show()
                fname.setText("")
                sname.setText("")
                username.setText("")
                paswword.setText("")
                coventryid.setText("")
            }
            R.id.login->{
                val intent = Intent(
                    this@signupActivity,MainActivity::class.java

                )
                startActivity(intent)

            }
        }
    }



}