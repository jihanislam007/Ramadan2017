package md.mazharul.islam.jihan.ramadan2017;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView lview;
    M_T_CustomAdapter m_t_customAdapter;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /////////////////working for add///////////////////////////////////////////

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1309629775280161/9473255533");
        AdRequest adR = new AdRequest.Builder()

                // Add a test device to show Test Ads
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("8658D8B4C243BA29458FD6F9524161C8") //Random Text
                .build();


        mInterstitialAd.loadAd(adR);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                displayInterstitial();
            }
        });
        /////////////////finish add///////////////////////////////////////////////*/


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton hadis = (ImageButton) findViewById(R.id.imageButtonHadis);
        ImageButton rojavong = (ImageButton) findViewById(R.id.imageButtonrujabong);
        ImageButton dua = (ImageButton) findViewById(R.id.imageButtondua);

        hadis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hadis = new Intent(MainActivity.this , Hadis.class);
                startActivity(hadis);
                finish();
            }
        });

        rojavong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebla = new Intent(MainActivity.this , Ruja_bongo.class);
                startActivity(kebla);
                finish();
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebla = new Intent(MainActivity.this , Ruja_Niot.class);
                startActivity(kebla);
                finish();
            }
        });

        /*/////////////////////////////working for fixed alerm////////////////////////////////////////

        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
       // pendingIntent = PendingIntent.getService(ThisApp.this, 0, myIntent, 0);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 24*60*60*1000 ,null);

        /////////////////////////////working for fixed alerm////////////////////////////////////////*/


        ////////////////////////////working/////////////////////

        SharedPreferences sh = getSharedPreferences("file1" , MODE_PRIVATE);
        String name = sh.getString("value_key","value is emty");

        String district = sh.getString("district","value is emty");
        Toast.makeText(MainActivity.this, district +" জেলার সময়সূচি", Toast.LENGTH_SHORT).show();

//////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////dhaka/////////////////////////////////////////////

        if(name.equals("a")) {


            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};


            final  String number[] = {"3:40AM", "3:40AM","3:40AM","3:39AM","3:39AM","3:39AM","3:39AM","3:39AM",
                    "3:39AM","3:38AM","3:38AM","3:38AM","3:38AM", "3:38AM","3:38AM","3:38AM",
                    "3:37AM","3:38AM","3:38AM","3:38AM","3:38AM","3:38AM","3:38AM","3:38AM",
                    "3:38AM","3:39AM","3:39AM","3:39AM","3:39AM","3:40AM"};

            final String ifter[] = {"6:44PM","6:44PM","6:45PM","6:45PM","6:46PM","6:46PM","6:46PM","6:47PM",
                    "6:47PM","6:47PM","6:48PM","6:48PM","6:49PM","6:49PM","6:50PM",
                    "6:50PM","6:50PM","6:50PM","6:51PM","6:51PM","6:51PM","6:51PM","6:52PM",
                    "6:52PM","6:52PM","6:52PM","6:53PM","6:53PM","6:53PM","6:53PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setSelected(true);
            lview.setAdapter(m_t_customAdapter);


        }
        ///////////////////////////////////////+1//////////////////////////////////////////////////
        else if(name.equals("b")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:42AM", "3:42AM","3:42AM","3:41AM","3:41AM","3:41AM","3:41AM","3:41AM",
                    "3:41AM","3:40AM","3:40AM","3:40AM","3:40AM", "3:40AM","3:40AM","3:40AM",
                    "3:39AM","3:40AM","3:40AM","3:40AM","3:40AM","3:40AM","3:40AM","3:40AM",
                    "3:40AM","3:41AM","3:41AM","3:41AM","3:41AM","3:42AM"};


            final String ifter[] = {"6:46PM","6:46PM","6:47PM","6:47PM","6:48PM","6:48PM","6:48PM","6:49PM",
                    "6:49PM","6:49PM","6:50PM","6:50PM","6:51PM","6:51PM","6:52PM",
                    "6:52PM","6:52PM","6:52PM","6:53PM","6:53PM","6:53PM","6:53PM","6:54PM",
                    "6:54PM","6:54PM","6:54PM","6:55PM","6:55PM","6:55PM","6:55PM"};




            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        /////////////////////////////////////////+2////////////////////////////////////////////////
        else if(name.equals("c")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:44AM", "3:44AM","3:44AM","3:43AM","3:43AM","3:43AM","3:43AM","3:43AM",
                    "3:43AM","3:42AM","3:42AM","3:42AM","3:42AM", "3:42AM","3:42AM","3:42AM",
                    "3:41AM","3:42AM","3:42AM","3:42AM","3:42AM","3:42AM","3:42AM","3:42AM",
                    "3:42AM","3:43AM","3:43AM","3:43AM","3:43AM","3:44AM"};


            final String ifter[] = {"6:48PM","6:48PM","6:49PM","6:49PM","6:50PM","6:50PM","6:50PM","6:51PM",
                    "6:51PM","6:51PM","6:52PM","6:52PM","6:53PM","6:53PM","6:54PM",
                    "6:54PM","6:54PM","6:54PM","6:55PM","6:55PM","6:55PM","6:55PM","6:56PM",
                    "6:56PM","6:56PM","6:56PM","6:57PM","6:57PM","6:57PM","6:57PM"};




            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        //////////////////////////////////////////+3///////////////////////////////////////////////
        else if(name.equals("d")){


            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:43AM", "3:43AM","3:43AM","3:42AM","3:42AM","3:42AM","3:42AM","3:42AM",
                    "3:42AM","3:41AM","3:41AM","3:41AM","3:41AM", "3:41AM","3:41AM","3:41AM",
                    "3:40AM","3:41AM","3:41AM","3:41AM","3:41AM","3:41AM","3:41AM","3:41AM",
                    "3:41AM","3:42AM","3:42AM","3:42AM","3:42AM","3:43AM"};


            final String ifter[] = {"6:47PM","6:47PM","6:48PM","6:48PM","6:49PM","6:49PM","6:49PM","6:50PM",
                    "6:50PM","6:50PM","6:50PM","6:50PM","6:52PM","6:52PM","6:53PM",
                    "6:53PM","6:53PM","6:53PM","6:54PM","6:54PM","6:54PM","6:54PM","6:55PM",
                    "6:55PM","6:55PM","6:55PM","6:56PM","6:56PM","6:56PM","6:56PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        //////////////////////////////////////////+4///////////////////////////////////////////////
        else if(name.equals("e")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:44AM", "3:44AM","3:44AM","3:43AM","3:43AM","3:43AM","3:43AM","3:43AM",
                    "3:43AM","3:42AM","3:42AM","3:42AM","3:42AM", "3:42AM","3:42AM","3:42AM",
                    "3:41AM","3:42AM","3:42AM","3:42AM","3:42AM","3:42AM","3:42AM","3:42AM",
                    "3:42AM","3:43AM","3:43AM","3:43AM","3:43AM","3:44AM"};


            final String ifter[] = {"6:48PM","6:48PM","6:49PM","6:49PM","6:50PM","6:50PM","6:50PM","6:51PM",
                    "6:51PM","6:51PM","6:52PM","6:52PM","6:53PM","6:53PM","6:54PM",
                    "6:54PM","6:54PM","6:54PM","6:55PM","6:55PM","6:55PM","6:55PM","6:56PM",
                    "6:56PM","6:56PM","6:56PM","6:57PM","6:57PM","6:57PM","6:57PM"};




            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        //////////////////////////////////////////+5///////////////////////////////////////////////
        else if(name.equals("f")){




            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:45AM", "3:45AM","3:45AM","3:44AM","3:44AM","3:44AM","3:44AM","3:44AM",
                    "3:44AM","3:43AM","3:43AM","3:43AM","3:43AM", "3:43AM","3:43AM","3:43AM",
                    "3:42AM","3:43AM","3:43AM","3:43AM","3:43AM","3:43AM","3:43AM","3:43AM",
                    "3:43AM","3:44AM","3:44AM","3:44AM","3:44AM","3:45AM"};


            final String ifter[] = {"6:49PM","6:49PM","6:50PM","6:50PM","6:50PM","6:50PM","6:51PM","6:52PM",
                    "6:52PM","6:52PM","6:53PM","6:53PM","6:54PM","6:54PM","6:55PM",
                    "6:55PM","6:55PM","6:55PM","6:56PM","6:56PM","6:56PM","6:56PM","6:57PM",
                    "6:57PM","6:57PM","6:57PM","6:58PM","6:58PM","6:58PM","6:58PM"};




            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }


        /////////////////////////////////////////+6////////////////////////////////////////////////
        else if(name.equals("g")){


            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:46AM", "3:46AM","3:46AM","3:45AM","3:45AM","3:45AM","3:45AM","3:45AM",
                    "3:45AM","3:44AM","3:44AM","3:44AM","3:44AM", "3:44AM","3:44AM","3:44AM",
                    "3:43AM","3:44AM","3:44AM","3:44AM","3:44AM","3:44AM","3:44AM","3:44AM",
                    "3:44AM","3:45AM","3:45AM","3:45AM","3:45AM","3:46AM"};


            final String ifter[] = {"6:50PM","6:50PM","6:51PM","6:51PM","6:51PM","6:51PM","6:52PM","6:53PM",
                    "6:53PM","6:53PM","6:54PM","6:54PM","6:55PM","6:55PM","6:56PM",
                    "6:56PM","6:56PM","6:56PM","6:57PM","6:57PM","6:57PM","6:57PM","6:58PM",
                    "6:58PM","6:58PM","6:58PM","6:59PM","6:59PM","6:59PM","6:59PM"};




            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);
        }


        ///////////////////////////////////////////+7//////////////////////////////////////////////
        else if(name.equals("h")){




            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:47AM", "3:47AM","3:47AM","3:46AM","3:46AM","3:46AM","3:46AM","3:46AM",
                    "3:46AM","3:45AM","3:45AM","3:45AM","3:45AM", "3:45AM","3:45AM","3:45AM",
                    "3:44AM","3:45AM","3:45AM","3:45AM","3:45AM","3:45AM","3:45AM","3:45AM",
                    "3:45AM","3:46AM","3:46AM","3:46AM","3:46AM","3:47AM"};


            final String ifter[] = {"6:51PM","6:51PM","6:52PM","6:52PM","6:53PM","6:53PM","6:53PM","6:53PM",
                    "6:54PM","6:54PM","6:55PM","6:55PM","6:56PM","6:56PM","6:57PM",
                    "6:57PM","6:57PM","6:57PM","6:58PM","6:58PM","6:58PM","6:58PM","6:59PM",
                    "6:59PM","6:59PM","6:59PM","6:60PM","6:60PM","6:60PM","6:60PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        ///////////////////////////////////////////+8//////////////////////////////////////////////
        else if(name.equals("i")){



            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:48AM", "3:48AM","3:48AM","3:47AM","3:47AM","3:47AM","3:47AM","3:47AM",
                    "3:47AM","3:46AM","3:46AM","3:46AM","3:46AM", "3:46AM","3:46AM","3:46AM",
                    "3:45AM","3:46AM","3:46AM","3:46AM","3:46AM","3:46AM","3:46AM","3:46AM",
                    "3:46AM","3:47AM","3:47AM","3:47AM","3:47AM","3:48AM"};


            final String ifter[] = {"6:52PM","6:52PM","6:53PM","6:53PM","6:54PM","6:54PM","6:54PM","6:55PM",
                    "6:55PM","6:55PM","6:56PM","6:56PM","6:57PM","6:57PM","6:58PM",
                    "6:58PM","6:58PM","6:58PM","6:59PM","6:59PM","6:59PM","6:59PM","6:60PM",
                    "6:60PM","6:60PM","6:60PM","6:61PM","6:61PM","6:61PM","6:61PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        //////////////////////////////////////////+9///////////////////////////////////////////////
        else if(name.equals("j")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:49AM", "3:49AM","3:49AM","3:48AM","3:48AM","3:48AM","3:48AM","3:48AM",
                    "3:48AM","3:47AM","3:47AM","3:47AM","3:47AM", "3:47AM","3:47AM","3:47AM",
                    "3:46AM","3:47AM","3:47AM","3:47AM","3:47AM","3:47AM","3:47AM","3:47AM",
                    "3:47AM","3:48AM","3:48AM","3:48AM","3:48AM","3:49AM"};


            final String ifter[] = {"6:53PM","6:53PM","6:54PM","6:54PM","6:55PM","6:55PM","6:55PM","6:56PM",
                    "6:56PM","6:56PM","6:57PM","6:57PM","6:58PM","6:58PM","6:59PM",
                    "6:59PM","6:59PM","6:59PM","6:60PM","6:60PM","6:60PM","6:60PM","6:61PM",
                    "6:61PM","6:61PM","6:61PM","6:62PM","6:62PM","6:62PM","6:62PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }


        ////////////////////////////////////////////-1/////////////////////////////////////////////
        else if(name.equals("k")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:39AM", "3:39AM","3:39AM","3:38AM","3:38AM","3:38AM","3:38AM","3:38AM",
                    "3:38AM","3:37AM","3:37AM","3:37AM","3:37AM", "3:37AM","3:37AM","3:37AM",
                    "3:36AM","3:37AM","3:37AM","3:37AM","3:37AM","3:37AM","3:37AM","3:37AM",
                    "3:37AM","3:38AM","3:38AM","3:38AM","3:38AM","3:39AM"};


            final String ifter[] = {"6:43PM","6:43PM","6:44PM","6:44PM","6:45PM","6:45PM","6:45PM","6:46PM",
                    "6:46PM","6:46PM","6:47PM","6:47PM","6:48PM","6:48PM","6:49PM",
                    "6:49PM","6:49PM","6:49PM","6:50PM","6:50PM","6:50PM","6:50PM","6:51PM",
                    "6:51PM","6:51PM","6:51PM","6:52PM","6:52PM","6:52PM","6:52PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }


        //////////////////////////////////////////-2///////////////////////////////////////////////
        else if(name.equals("l")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:38AM", "3:38AM","3:38AM","3:37AM","3:37AM","3:37AM","3:37AM","3:37AM",
                    "3:37AM","3:36AM","3:36AM","3:36AM","3:36AM", "3:36AM","3:36AM","3:36AM",
                    "3:35AM","3:36AM","3:36AM","3:36AM","3:36AM","3:36AM","3:36AM","3:36AM",
                    "3:36AM","3:37AM","3:37AM","3:37AM","3:37AM","3:38AM"};


            final String ifter[] = {"6:42PM","6:42PM","6:43PM","6:43PM","6:44PM","6:44PM","6:44PM","6:45PM",
                    "6:45PM","6:45PM","6:46PM","6:46PM","6:47PM","6:47PM","6:48PM",
                    "6:48PM","6:48PM","6:48PM","6:49PM","6:49PM","6:49PM","6:49PM","6:50PM",
                    "6:50PM","6:50PM","6:50PM","6:51PM","6:51PM","6:51PM","6:51PM"};




            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }


        /////////////////////////////////////////-3////////////////////////////////////////////////
        else if(name.equals("m")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:37AM", "3:37AM","3:37AM","3:36AM","3:36AM","3:36AM","3:36AM","3:36AM",
                    "3:36AM","3:35AM","3:35AM","3:35AM","3:35AM", "3:35AM","3:35AM","3:35AM",
                    "3:34AM","3:35AM","3:35AM","3:35AM","3:35AM","3:35AM","3:35AM","3:35AM",
                    "3:35AM","3:36AM","3:36AM","3:36AM","3:36AM","3:47AM"};


            final String ifter[] = {"6:41PM","6:41PM","6:42PM","6:42PM","6:43PM","6:43PM","6:43PM","6:44PM",
                    "6:44PM","6:44PM","6:45PM","6:45PM","6:46PM","6:46PM","6:47PM",
                    "6:47PM","6:47PM","6:47PM","6:48PM","6:48PM","6:48PM","6:48PM","6:49PM",
                    "6:49PM","6:49PM","6:49PM","6:50PM","6:50PM","6:50PM","6:50PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        //////////////////////////////////////////-4///////////////////////////////////////////////
        else if(name.equals("n")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:36AM", "3:36AM","3:36AM","3:35AM","3:35AM","3:35AM","3:35AM","3:35AM",
                    "3:35AM","3:34AM","3:34AM","3:34AM","3:34AM", "3:34AM","3:34AM","3:34AM",
                    "3:33AM","3:34AM","3:34AM","3:34AM","3:34AM","3:34AM","3:34AM","3:34AM",
                    "3:34AM","3:35AM","3:35AM","3:35AM","3:35AM","3:36AM"};


            final String ifter[] = {"6:40PM","6:40PM","6:41PM","6:41PM","6:42PM","6:42PM","6:42PM","6:43PM",
                    "6:43PM","6:43PM","6:44PM","6:44PM","6:45PM","6:45PM","6:46PM",
                    "6:46PM","6:46PM","6:46PM","6:47PM","6:47PM","6:47PM","6:47PM","6:48PM",
                    "6:48PM","6:48PM","6:48PM","6:49PM","6:49PM","6:49PM","6:49PM"};




            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        ///////////////////////////////////////////-5//////////////////////////////////////////////
        else if(name.equals("o")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:35AM", "3:35AM","3:35AM","3:34AM","3:34AM","3:34AM","3:34AM","3:34AM",
                    "3:34AM","3:33AM","3:33AM","3:33AM","3:33AM", "3:33AM","3:33AM","3:33AM",
                    "3:32AM","3:33AM","3:33AM","3:33AM","3:33AM","3:33AM","3:33AM","3:33AM",
                    "3:33AM","3:34AM","3:34AM","3:34AM","3:34AM","3:35AM"};


            final String ifter[] = {"6:39PM","6:39PM","6:40PM","6:40PM","6:41PM","6:41PM","6:41PM","6:42PM",
                    "6:42PM","6:42PM","6:43PM","6:43PM","6:44PM","6:44PM","6:45PM",
                    "6:45PM","6:45PM","6:45PM","6:46PM","6:46PM","6:46PM","6:46PM","6:47PM",
                    "6:47PM","6:47PM","6:47PM","6:48PM","6:48PM","6:48PM","6:48PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        ///////////////////////////////////////////-6//////////////////////////////////////////////
        else if(name.equals("p")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:34AM", "3:34AM","3:34AM","3:33AM","3:33AM","3:33AM","3:33AM","3:33AM",
                    "3:33AM","3:32AM","3:32AM","3:32AM","3:32AM", "3:32AM","3:32AM","3:32AM",
                    "3:31AM","3:32AM","3:32AM","3:32AM","3:32AM","3:32AM","3:32AM","3:32AM",
                    "3:32AM","3:33AM","3:33AM","3:33AM","3:33AM","3:34AM"};


            final String ifter[] = {"6:38PM","6:38PM","6:39PM","6:39PM","6:39PM","6:39PM","6:40PM","6:41PM",
                    "6:41PM","6:41PM","6:42PM","6:42PM","6:43PM","6:43PM","6:44PM",
                    "6:44PM","6:44PM","6:44PM","6:45PM","6:45PM","6:45PM","6:45PM","6:46PM",
                    "6:46PM","6:46PM","6:46PM","6:47PM","6:47PM","6:47PM","6:47PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }

        ////////////////////////////////////////////-7/////////////////////////////////////////////
        else if(name.equals("q")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:33AM", "3:33AM","3:33AM","3:32AM","3:32AM","3:32AM","3:32AM","3:32AM",
                    "3:32AM","3:31AM","3:31AM","3:31AM","3:31AM", "3:31AM","3:31AM","3:31AM",
                    "3:30AM","3:31AM","3:31AM","3:31AM","3:31AM","3:31AM","3:31AM","3:31AM",
                    "3:31AM","3:32AM","3:32AM","3:32AM","3:32AM","3:33AM"};


            final String ifter[] = {"6:37PM","6:37PM","6:38PM","6:38PM","6:39PM","6:39PM","6:39PM","6:40PM",
                    "6:40PM","6:40PM","6:41PM","6:41PM","6:42PM","6:42PM","6:43PM",
                    "6:43PM","6:43PM","6:43PM","6:44PM","6:44PM","6:44PM","6:44PM","6:45PM",
                    "6:45PM","6:45PM","6:45PM","6:46PM","6:46PM","6:46PM","6:46PM"};


            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }


        ///////////////////////////////////////////-8//////////////////////////////////////////////
        else if(name.equals("r")){

            final  String month[] = {"28-05-17","29-05-17","30-05-17","31-05-17","01-06-17","02-06-17","03-06-17",
                    "04-06-17","05-06-17","06-06-17","07-06-17","08-06-17","09-06-17","10-06-17",
                    "11-06-17","12-06-17","13-06-17","14-06-17","15-06-17","16-06-17","17-06-17","18-06-17",
                    "19-06-17","20-06-17","21-06-17","22-06-17","23-06-17","24-06-17","25-06-17","26-06-17"};

            final  String number[] = {"3:32AM", "3:32AM","3:32AM","3:31AM","3:31AM","3:31AM","3:31AM","3:31AM",
                    "3:31AM","3:30AM","3:30AM","3:30AM","3:30AM", "3:30AM","3:30AM","3:30AM",
                    "3:29AM","3:30AM","3:30AM","3:30AM","3:30AM","3:30AM","3:30AM","3:30AM",
                    "3:30AM","3:31AM","3:31AM","3:31AM","3:31AM","3:32AM"};


            final String ifter[] = {"6:36PM","6:36PM","6:38PM","6:38PM","6:38PM","6:38PM","6:38PM","6:39PM",
                    "6:39PM","6:39PM","6:40PM","6:40PM","6:41PM","6:41PM","6:42PM",
                    "6:42PM","6:42PM","6:42PM","6:43PM","6:43PM","6:43PM","6:43PM","6:44PM",
                    "6:44PM","6:44PM","6:44PM","6:45PM","6:45PM","6:45PM","6:45PM"};



            lview = (ListView) findViewById(R.id.listViewcustom);
            m_t_customAdapter = new M_T_CustomAdapter(this, month, number,ifter);
            lview.setAdapter(m_t_customAdapter);

        }else{Toast.makeText(MainActivity.this,"আপনার জেলা নির্বাচন করুন", Toast.LENGTH_SHORT).show();
        }
////////////////////////////////////////////custom list view////////////////////




        ////////////////////////////nav bar/////////////////////////
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {

        //  finishapp();
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity").setMessage("Are you sure")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                    // } {
                }).setNegativeButton("No" , null).show();

        //  super.onBackPressed();
        //   }
        ////////////////////////////////////////////////////

       /* DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //   @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            startActivity(new Intent(getApplicationContext(),
                    MainActivity.class));
            finish();
        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(getApplicationContext(),
                    Ruja_Niot.class));
            finish();

        } else if (id == R.id.nav_slideshow) {

            startActivity(new Intent(getApplicationContext(),
                    Ruja_bongo.class));
            finish();
        } else if (id == R.id.nav_manage) {
            startActivity(new Intent(getApplicationContext(),
                    Hadis.class));
            finish();

        } else if (id == R.id.nav_share) {
            startActivity(new Intent(getApplicationContext(),
                    Settings.class));

            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    /////////////////////also working for add//////////////////////////

    public void displayInterstitial(){
        if(mInterstitialAd.isLoaded()){

            mInterstitialAd.show();
        }
    }

    /////////////////////also working for add//////////////////////////

}
