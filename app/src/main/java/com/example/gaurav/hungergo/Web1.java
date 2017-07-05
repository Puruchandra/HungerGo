package com.example.gaurav.hungergo;

import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web1 extends AppCompatActivity {
    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);
        init();

    }

    private void init() {

        web1= (WebView) findViewById(R.id.webtwitter);
        web1.setWebViewClient(new MyBrowser());
        web1.getSettings().setJavaScriptEnabled(true);
        web1.loadUrl("http://www.facebook.com");

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
