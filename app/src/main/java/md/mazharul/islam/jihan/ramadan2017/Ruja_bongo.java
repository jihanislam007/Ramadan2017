package md.mazharul.islam.jihan.ramadan2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Ruja_bongo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruja_bongo);

        ImageButton kebla = (ImageButton) findViewById(R.id.imageButtonkebla1);
        ImageButton hadis = (ImageButton) findViewById(R.id.imageButtonhome);
        ImageButton dua = (ImageButton) findViewById(R.id.imageButtondua);

        /////////////////working for add///////////////////////////////////////////
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Request for Ads
        AdRequest adRequest1 = new AdRequest.Builder()

                // Add a test device to show Test Ads
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("8658D8B4C243BA29458FD6F9524161C8") //Random Text
                .build();
		 /*	// Load ads into Banner Ads
			mAdView.loadAd(adRequest1);*/
        mAdView.loadAd(adRequest1);
        /////////////////finish add///////////////////////////////////////////////

        ImageView back = (ImageView) findViewById(R.id.backHadis);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Ruja_bongo.this , MainActivity.class);
                startActivity(back);
                finish();
            }
        });

        kebla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebla = new Intent(Ruja_bongo.this , MainActivity.class);
                startActivity(kebla);
                finish();
            }
        });

        hadis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebla = new Intent(Ruja_bongo.this , Hadis.class);
                startActivity(kebla);
                finish();
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebla = new Intent(Ruja_bongo.this , Ruja_Niot.class);
                startActivity(kebla);
                finish();
            }
        });
    }
}
