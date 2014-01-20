package ylimafs1j.android.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//get the trigger or "call" from the MainActivity
		Intent intent = getIntent();
		//Get the two strings from the intent
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		//Create TextLine
		TextView textView = new TextView(this);
		//set size
		textView.setTextSize(40);
		//set the text
		textView.setText(message);
		//display the text
		setContentView(textView);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_message, menu);
		return true;
	}

}
