package com.caunk94.slidebarmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        my_toolbar.setTitle(R.string.my_title_main);
        my_toolbar.setSubtitle(R.string.my_subtitle_main);
        my_toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(my_toolbar);
    }
}
