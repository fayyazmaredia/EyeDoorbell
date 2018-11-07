package com.example.fayyaz.eyedoorbell;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class pop_images extends Activity {

    private WebView webImg;

    @Override
    protected void onCreate(Bundle savedInstanceStatce) {
        super.onCreate(savedInstanceStatce );

        setContentView(R.layout.pop_images_window);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width), (int)(0.8*height));

        webImg = (WebView) findViewById(R.id.webImage);
        webImg.setWebChromeClient(new WebChromeClient());
        webImg.setWebViewClient(new WebViewClient());
        webImg.getSettings().setJavaScriptEnabled(true);
        webImg.loadUrl("http://192.168.1.2/android/showImages.html");



    }

}
