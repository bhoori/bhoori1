package com.bhoori.android.setup;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SetupActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_setup, menu);
        return true;
    }
}
