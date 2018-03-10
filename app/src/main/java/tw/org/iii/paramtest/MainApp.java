package tw.org.iii.paramtest;

import android.app.Application;
import android.util.Log;

/**
 * Created by Administrator on 2018/3/10.
 */

public class MainApp extends Application {
    public int myrand;


    @Override
    public void onCreate() {
        super.onCreate();
        Log.v("brad", "app:onCreate");
    }
}
