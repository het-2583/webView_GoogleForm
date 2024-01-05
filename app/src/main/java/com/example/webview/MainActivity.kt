package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        webView=findViewById(R.id.webview)
        //handle client
        webView.webViewClient= WebViewClient()
        //load url
        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeueNG5mPe4BE1S0fS3D1Q97qivpAcRS61mT3BlyS3OV23QeA/viewform?usp=sf_link")
        //javascript enable
        webView.settings.javaScriptEnabled = true
        //if you wnat to enble zoom feature
        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        //if your webview can go back it will go back
        if(webView.canGoBack())
            webView.goBack()
        //if your webview cannot go back
        //it will exit the application
        else
            super.onBackPressed()
    }
}