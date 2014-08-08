package oo;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public PendingIntent createPendingResult(int requestCode, Intent data, int flags) {
		// TODO Auto-generated method stub
		return super.createPendingResult(requestCode, data, flags);
	}

}
