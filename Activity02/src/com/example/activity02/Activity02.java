package com.example.activity02;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity02 extends Activity{
    private Button myButton = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		myButton=(Button)findViewById(R.id.myButton);
		myButton.setOnClickListener(new myButtonOnClickListener());
	}
	class myButtonOnClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.putExtra("data", "success!i am very happy!");
			intent.setClass(Activity02.this, OtherActivity.class);
			Activity02.this.startActivity(intent);
			/*Uri uri=Uri.parse("smsto://10086");
			Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
			intent.putExtra("sms_body", "°²×¿¶ÌÐÅ²âÊÔhttp://www.android-study.net");
			Activity02.this.startActivity(intent);*/
		}
		
	}
	 
	 
}
