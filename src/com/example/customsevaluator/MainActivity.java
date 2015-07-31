package com.example.customsevaluator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.customsevaluator.R;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity {
	
	private Spinner spinner;
    private static final String[] countries = {"EN", "UA", "GE", "BG", "PL","RO", "HG", "BL"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,countries);
        
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
        		new OnItemSelectedListener() {
        	        @Override
        	        public void onItemSelected(AdapterView<?> parent, View view,
        	                int position, long id) {
        	            Log.v("item", (String) parent.getItemAtPosition(position));
        	        }

        	        @Override
        	        public void onNothingSelected(AdapterView<?> parent) {
        	            // TODO Auto-generated method stub
        	        }
        	       }
        		);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	 public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

	        switch (position) {
	            case 0:
	                // Whatever you want to happen when the first item gets selected
	                break;
	            case 1:
	                // Whatever you want to happen when the second item gets selected
	                break;
	            case 2:
	                // Whatever you want to happen when the thrid item gets selected
	                break;

	        }
	    }
}
