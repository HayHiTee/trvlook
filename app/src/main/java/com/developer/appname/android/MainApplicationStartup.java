package com.developer.appname.android;

import android.app.Application;

import com.parse.Parse;
import com.parse.PushService;

public class MainApplicationStartup extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "1EHV1vX8UepQffc7bDLSxJmgUpSVKuwQjCaYOqBa", "TfrhVnJxLhekI5jyAFuUCalLNZrgsx0ahcXo7oe2");
	    
	    PushService.setDefaultPushCallback(this, MainActivity.class);
	}
}
