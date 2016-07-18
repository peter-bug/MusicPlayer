package com.example.activity02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity{
    private TextView myTextView=null;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		Intent intent=getIntent();
		/*Bundle bundle=intent.getExtras();
		String str=bundle.getString("data");*/
		String value = intent.getStringExtra("data");
		TextView myTextView=(TextView)findViewById(R.id.myTextView);
		myTextView.setText(value);
	}
	

}
