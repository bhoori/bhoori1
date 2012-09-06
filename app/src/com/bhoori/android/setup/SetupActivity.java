package com.bhoori.android.setup;

import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SetupActivity extends Activity {

	    // Initializing variables
	    EditText inputName;
	    EditText inputEmail;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Just for now add from the xml file */ 
        setContentView(R.layout.activity_setup);
        
        Button next = (Button) findViewById(R.id.button_next);
        
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
               // Intent myIntent = new Intent(view.getContext(), Feedback.class);
                
                Intent nextScreen = new Intent(getApplicationContext(), Feedback.class);
                
                inputName  = (EditText)  findViewById(R.id.Name);
                //Sending data to another Activity
                nextScreen.putExtra("name", inputName.getText().toString());
     
                
                startActivityForResult(nextScreen, 0);
            }
        });
        
        
    }
    /*mbhoori: adding extra comments to just check */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	 
        getMenuInflater().inflate(R.menu.activity_setup, menu);
        return true;
        
        
        
        
        
    }
    
    
    
    
}
