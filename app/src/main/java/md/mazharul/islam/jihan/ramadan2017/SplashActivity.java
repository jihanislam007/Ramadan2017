package md.mazharul.islam.jihan.ramadan2017;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

import java.util.Random;


/*public class SplashActivity extends AppCompatActivity {

    private static String prefString;
    private static SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    sleep(1000);

                    /////////////////////////////////////////////////

                    pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor  editor = pref.edit();


                    prefString = pref.getString("KEY_DIS","");

                    if (prefString.equals("")) {

                        editor.putString("KEY_DIS", "abc");
                        editor.commit();
                        startActivity(new Intent(getApplicationContext(),
                                Settings.class));
                    }else{
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                    }

                    /////////////////////////////////////////////


                   /*  startActivity(new Intent(getApplicationContext(),
                            Settings.class));*/
         /*           finish();
                            } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            }

                            }
                            };
                            thread.start();
                            }
                            }*/

//extends AwesomeSplash!
public class SplashActivity extends AwesomeSplash {

    //DO NOT OVERRIDE onCreate()!
    //if you need to start some services do it in initSplash()!
    private static String prefString;
    private static SharedPreferences pref;


    @Override
    public void initSplash(ConfigSplash configSplash) {

			/* you don't have to override every property */

        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.colorPrimary); //any color you want form colors.xml

        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

        //Customize Logo
        //   configSplash.setLogoSplash(R.mipmap.ic_launcher); //or any other drawable
        configSplash.setLogoSplash(R.drawable.icon); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)


          /*  //Customize Path
            configSplash.setPathSplash(Constants.DROID_LOGO); //set path String
            configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
            configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
            configSplash.setAnimPathStrokeDrawingDuration(3000);
            configSplash.setPathSplashStrokeSize(3); //I advise value be <5
            configSplash.setPathSplashStrokeColor(R.color.accent); //any color you want form colors.xml
            configSplash.setAnimPathFillingDuration(3000);
            configSplash.setPathSplashFillColor(R.color.Wheat); //path object filling color
*/

        //Customize Title
        configSplash.setTitleSplash("মাহে রমজান ২০১৮");
        configSplash.setTitleTextColor(R.color.colorWhite);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(2000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
        configSplash.setTitleFont("fonts/Roboto-Light.ttf"); //provide string to your font located in assets/fonts/

    }

    @Override
    public void animationsFinished() {

        //transit to another activity here
        //or do whatever you want
        /////////////////////////////////////////////////

        pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor  editor = pref.edit();


        prefString = pref.getString("KEY_DIS","");

        if (prefString.equals("")) {

            editor.putString("KEY_DIS", "abc");
            editor.commit();
            startActivity(new Intent(getApplicationContext(),
                    Settings.class));
        }else{
            startActivity(new Intent(getApplicationContext(),
                    MainActivity.class));
        }

        /////////////////////////////////////////////
        finish();

    }
}