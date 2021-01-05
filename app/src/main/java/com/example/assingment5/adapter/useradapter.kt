package com.example.assingment5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.assingment5.R
import com.example.assingment5.user.Users
import de.hdodenhof.circleimageview.CircleImageView

class UserAdapter(
val lstuserr:ArrayList<Users>,
val context: Context
)
    :RecyclerView.Adapter<UserAdapter.userViewHolder>(){
    class userViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imgprofile:CircleImageView
        val Usernames:TextView
        val fullname:TextView
        val batchno:TextView
        val coventryid:TextView
init {
    imgprofile=view.findViewById(R.id.imgProfile)
    Usernames=view.findViewById(R.id.tvusername)
    fullname=view.findViewById(R.id.fullname)
    batchno=view.findViewById(R.id.batch)
    coventryid=view.findViewById(R.id.coventryid)
}

    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyledesign,parent,false)
            return userViewHolder(view)
        }

        override fun getItemCount(): Int {
           return lstuserr.size
        }

        override fun onBindViewHolder(holder: userViewHolder, position: Int) {
            val user:Users=lstuserr[position]

            holder.Usernames.text=user.UserName
            holder.fullname.text=user.firname
            holder.coventryid.text=user.coventryId
            holder.batchno.text=user.batch
            Glide.with(context)
                .load(user.Imageurl)
                .into(holder.imgprofile)
        }

    }


