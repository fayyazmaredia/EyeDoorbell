package com.example.fayyaz.eyedoorbell;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pop_messages extends Activity {

    private WebView webMsg;

    @Override
    protected void onCreate(Bundle savedInstanceStatce) {
        super.onCreate(savedInstanceStatce );

        setContentView(R.layout.pop_messages_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width), (int)(.8*height));

        webMsg = (WebView) findViewById(R.id.webMessage);
        webMsg.setWebChromeClient(new WebChromeClient());
        webMsg.setWebViewClient(new WebViewClient());
        webMsg.getSettings().setJavaScriptEnabled(true);
        webMsg.loadUrl("http://192.168.1.2/android/showMessages.html");

    }

}
