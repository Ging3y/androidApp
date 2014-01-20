package ylimafs1j.android.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SayHello extends Activity {
	
	public final static String greeting = "Why hello there!";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView message = new TextView(this);
		message.setText(greeting);
		setContentView(message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.say_hello, menu);
		return true;
	}

}
