package ylimafs1j.android.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	//Values
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

	@Override
	//This is "setup" loop
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Look for what to display
		//Looking in res/layout
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	//When the user clicks the Send Button
	public void sendMessage(View view) {
		//Do Something
		
		//Create a trigger for the DisplayMessageActivity class
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		//define that editText is the string for edit_message
		EditText editText = (EditText) findViewById(R.id.edit_message);
		//set the string message to its text
		String message = editText.getText().toString();
		//add to the intent that package name and string
		intent.putExtra(EXTRA_MESSAGE, message);
		//trigger the intent we created previously
		//see DisplayMessageActivity for next move
		startActivity(intent);
	}
	
	//When the user presses Hello
	public void sayHello(View view) {
		Intent sayHi = new Intent(this, SayHello.class);
		startActivity(sayHi);
	}

}
