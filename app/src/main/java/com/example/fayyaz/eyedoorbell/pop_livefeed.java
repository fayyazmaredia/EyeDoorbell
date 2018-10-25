package com.example.fayyaz.eyedoorbell;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class pop_livefeed extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceStatce) {
        super.onCreate(savedInstanceStatce );

        setContentView(R.layout.pop_livefeed_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width), (int)(height));

    }

}
