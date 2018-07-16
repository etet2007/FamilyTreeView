package com.cxb.familytree;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Created by lenovo on 17/5/6.
 */

public class MyApplication extends Application {

  private static MyApplication sInstance;

  public MyApplication() {
    sInstance = this;
  }

  public static MyApplication getInstance() {
    if (sInstance == null) {
      synchronized (MyApplication.class) {
        if (sInstance == null) {
          sInstance = new MyApplication();
        }
      }
    }
    return sInstance;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Logger.addLogAdapter(new AndroidLogAdapter());
  }
}
