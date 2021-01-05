package com.example.assingment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assingment5.adapter.UserAdapter
import com.example.assingment5.user.Users

class DashboardActivity : AppCompatActivity() {
    private var lstusers= ArrayList<Users>()
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        recyclerView=findViewById(R.id.recylerview)
        loadUsers()
        val adapter=UserAdapter(lstusers,this@DashboardActivity)
        recyclerView.layoutManager= LinearLayoutManager(this@DashboardActivity)
        recyclerView.adapter=adapter
    }

    private fun loadUsers() {
        TODO("Not yet implemented")
    }
}