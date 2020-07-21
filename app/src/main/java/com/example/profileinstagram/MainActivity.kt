package com.example.profileinstagram

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.example.profileinstagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        Glide.with(this).load(R.drawable.instagram).circleCrop().into(binding.userImageProfile)

        val menus: Menu = binding.bottomNav.menu
        val itemMenus = menus.findItem(R.id.profile_menu)
        Glide.with(applicationContext)
            .asBitmap()
            .load(R.drawable.instagram)
            .apply(RequestOptions.circleCropTransform())
            .into(object : CustomTarget<Bitmap> (){
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    val imageList : Drawable = BitmapDrawable(resources, resource)
                    itemMenus.icon = imageList
                }
                override fun onLoadCleared(placeholder: Drawable?) {
                }
            })
    }
}