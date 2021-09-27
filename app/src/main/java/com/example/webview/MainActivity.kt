package com.example.webview

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup(){
        val webView = findViewById<WebView>(R.id.wb_webView)

        webView.webViewClient = WebViewClient()

        webView.apply {
            loadUrl("https://coneill65fa21.mccdgm.net/web105/final-project/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }

    override fun onBackPressed() {
        val webView = findViewById<WebView>(R.id.wb_webView)
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}