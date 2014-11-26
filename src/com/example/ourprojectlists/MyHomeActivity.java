package com.example.ourprojectlists;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyHomeActivity extends Activity {
	String myName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myName = getIntent().getStringExtra("tag");
		setContentView(R.layout.activity_my_home);
	}
	
	public void onClick1(View view) {

			 Intent intent = new Intent(MyHomeActivity.this, MyProfileActivity.class);
			    startActivity(intent);
		}
	public void onClick2(View view) {

		 Intent intent2 = new Intent(MyHomeActivity.this, WorkshopActivity.class);
		    startActivity(intent2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_profile, menu);
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
}
