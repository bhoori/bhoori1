package com.bhoori.android.setup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class Feedback extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        
        
        
        TextView txtName = (TextView) findViewById(R.id.textView1);
        
    
        Intent i = getIntent();
        // Receiving the Data
        String name = i.getStringExtra("name");
 
        System.out.println(" Name "+name);
       
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_feedback, menu);
        return true;
    }
}
