package com.example.profileinstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.profileinstagram.databinding.ActivityDashboardBinding

class dashboard : AppCompatActivity() {

    private lateinit var bindingDashboard: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDashboard = ActivityDashboardBinding.inflate(layoutInflater)
        val viewbinding = bindingDashboard.root
        setContentView(viewbinding)

        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.scrollPost.userImage)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.scrollPost.userImageDua)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.scrollPost.userImageTiga)
//        Glide.with(this).load(R.drawable.ic_baseline_account_circle_24).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.scrollPost.imageUserComment)

        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storySatu)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storyDua)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storyTiga)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storyEmpat)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storyLima)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storyEnam)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storyTujuh)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storyDelapan)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storySembilan)
        Glide.with(this).load(R.drawable.instagram).apply(RequestOptions.circleCropTransform()).into(bindingDashboard.handelLayoutScreen.handelStoryIg.storySepuluh)
    }
}