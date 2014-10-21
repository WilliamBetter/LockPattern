package com.iwilliam;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import com.iwilliam.lockpattern.R;
import com.iwilliam.view.LockPattern;
import com.iwilliam.view.LockPattern.OnCompleteListener;

public class MainActivity extends Activity
{
	private LockPattern mLockPattern;
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		sp = getSharedPreferences("config", MODE_PRIVATE);
		mLockPattern = (LockPattern) findViewById(R.id.lockPattern9);
		// 根据用户设置是否显示滑屏轨迹
		// mLockPattern.hideLocus();
		mLockPattern.setOnCompleteListener(new OnCompleteListener()
		{
			@Override
			public void onPwdShortOrLong(int pwdLength)
			{
				Toast.makeText(MainActivity.this, "密码太短啦", Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onComplete(String password)
			{
				// 请根据需求使用加密工具
				// password = MD5Utils.encode(password);
				if (sp.getString("pwd", "").equals(password))
				{
				} else
				{
					Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
					// 密码错误时调用
					mLockPattern.passwordError();
				}
			}
		});
	}
}
