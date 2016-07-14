package com.example.service01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestActivity extends Activity{
	private Button startServiceButton = null;
	private Button stopServiceButton = null;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_service);
		startServiceButton=(Button)findViewById(R.id.startService);
		startServiceButton.setOnClickListener(new startServiceListener());
		stopServiceButton=(Button)findViewById(R.id.stopService);
		stopServiceButton.setOnClickListener(new stopServiceListener());
		System.out.print("activity onCreate");
	}
	class startServiceListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(TestActivity.this, FirstService.class);
			startService(intent);
		}
		
	}
	class stopServiceListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(TestActivity.this, FirstService.class);
			stopService(intent);
		}
		
	}
}
