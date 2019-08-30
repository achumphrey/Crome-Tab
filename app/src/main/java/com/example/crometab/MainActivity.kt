package com.example.crometab

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.browser.customtabs.CustomTabsIntent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://bbc.co.uk"
        tv_click_me.setOnClickListener {

            val builder = CustomTabsIntent.Builder()

            val customTabsIntent: CustomTabsIntent = builder.build()
            customTabsIntent.launchUrl(this@MainActivity, Uri.parse(url))

            // used when you are in a fragment as it is not an activity
       //     customTabsIntent.launchUrl(activity, Uri.parse(url))
        }
    }
}
