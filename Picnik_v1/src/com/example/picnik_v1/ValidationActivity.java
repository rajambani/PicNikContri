package com.example.picnik_v1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ValidationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_validation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_validation, menu);
		return true;
	}

}
