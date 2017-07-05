package com.example.gaurav.hungergo;

import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web2 extends AppCompatActivity {
    WebView web2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        init();

    }

    private void init() {

        web2= (WebView) findViewById(R.id.webfacebook);
        web2.setWebViewClient(new MyBrowser());
        web2.getSettings().setJavaScriptEnabled(true);
        web2.loadUrl("http://www.twitter.com");

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
