package com.example.gaurav.hungergo;

import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web3 extends AppCompatActivity {
    WebView web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);
        init();

    }

    private void init() {

        web3= (WebView) findViewById(R.id.webgoogle_plus);
        web3.setWebViewClient(new MyBrowser());
        web3.getSettings().setJavaScriptEnabled(true);
        web3.loadUrl("http://plus.google.com ");

    }
    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return  true;
        }
    }
}
