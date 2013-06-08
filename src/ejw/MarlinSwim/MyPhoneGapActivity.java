package ejw.MarlinSwim;

import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class MyPhoneGapActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setIntegerProperty("splashscreen", R.drawable.spashscreen);
        super.loadUrl(Config.getStartUrl(), 9500);
		super.loadUrl("file:///android_asset/www/index.html");
	}
}
