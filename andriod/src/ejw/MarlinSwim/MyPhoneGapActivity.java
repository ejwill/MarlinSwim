package ejw.MarlinSwim;

<<<<<<< HEAD
=======
import org.apache.cordova.Config;
>>>>>>> dc0b5f0b40ac8e451f78cf01ccd8c2ada2f8ae19
import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class MyPhoneGapActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
<<<<<<< HEAD
=======
		super.setIntegerProperty("splashscreen", R.drawable.spashscreen);
        super.loadUrl(Config.getStartUrl(), 9500);
>>>>>>> dc0b5f0b40ac8e451f78cf01ccd8c2ada2f8ae19
		super.loadUrl("file:///android_asset/www/index.html");
	}
}
