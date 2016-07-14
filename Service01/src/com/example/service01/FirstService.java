package com.example.service01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FirstService extends Service {

	/* (non-Javadoc)
	 * @see android.app.Service#onCreate()
	 */
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		System.out.print("Service onCreate");
		super.onCreate();
		
	}

	/* (non-Javadoc)
	 * @see android.app.Service#onDestroy()
	 */
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		System.out.print("Service onDestroy");
		super.onDestroy();
	}

	/* (non-Javadoc)
	 * @see android.app.Service#onStartCommand(android.content.Intent, int, int)
	 */
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		System.out.print("flags--->"+flags);
		System.out.print("startId--->"+startId);
		System.out.print("Service onStartCommand");
		return START_NOT_STICKY;
	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		System.out.print("Service onBlind");
		return null;
	}
	
	 
}
