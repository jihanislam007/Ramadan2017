package md.mazharul.islam.jihan.ramadan2017;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class Settings extends AppCompatActivity {
    ListView list ;
    String[] web = new String[] { "ঢাকা", "ফরিদপুর ","টাঙ্গাইল",  "গাজীপুর ", "গোপালগঞ্জ", "কিশোরগঞ্জ","মাদারীপুর", "মানিকগঞ্জ",
            "মুন্সিগঞ্জ ","নারায়ণগঞ্জ ","নরসিংদী  ", "রাজবাড়ী ", "শরিয়তপুর","দিনাজপুর", "গাইবান্ধা", "কুড়িগ্রাম ",
            "লালমনিরহাট","নীলফামারী","পঞ্চগড়", "রংপুর", "ঠাকুরগাঁও","বগুড়া", "পাবনা  ", "রাজশাহী", "জয়পুরহাট ",
            "চাঁপাইনবাবগঞ্জ ","নওগাঁ ","নাটোর","সিরাজগঞ্জ", "হবিগঞ্জ ", "মৌলভীবাজার", "সুনামগঞ্জ  ", "সিলেট",
            "ময়মনসিংহ","শেরপুর", "জামালপুর", "নেত্রকোনা  ", "বরগুনা", "বরিশাল ", "ভোলা", "ঝালকাঠি", "পটুয়াখালী",
            "পিরোজপুর", "বাগেরহাট ", "চুয়াডাঙ্গা", "যশোর","ঝিনাইদহ","খুলনা","কুষ্টিয়া", "মাগুরা",  "মেহেরপুর",
            "নড়াইল", "সাতক্ষীরা  ", "বান্দরবান", "ব্রাহ্মণবাড়িয়া", "চাঁদপুর","চট্টগ্রাম","কুমিল্লা ", "কক্সবাজার",
            "ফেনী ", "খাগড়াছড়ি", "লক্ষ্মীপুর ", "নোয়াখালী", "রাঙামাটি"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

// Get ListView object from xml
        list = (ListView) findViewById(R.id.listViewdistrict);
        CustomAdapter adapter = new CustomAdapter(Settings.this, web);
        list.setAdapter(adapter);


        // ListView Item Click Listener
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                view.setSelected(true);

                SharedPreferences sh = getSharedPreferences("file1" , MODE_PRIVATE);
                SharedPreferences.Editor editor = sh.edit();

                switch (position) {
                    case 0:

                        Intent in0 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"a");
                        editor.putString("district" ,"ঢাকা");
                        editor.commit();
                        startActivity(in0);
                        finish();

                        break;
                    case 1:

                        Intent in1 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"d");
                        editor.putString("district" ,"ফরিদপুর");
                        editor.commit();
                        startActivity(in1);
                        finish();
                        break;
                    case 2:
                        Intent in2 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"c");
                        editor.putString("district" ,"টাঙ্গাইল");
                        editor.commit();
                        startActivity(in2);
                        finish();
                        break;
                    case 3:
                        Intent in3 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"k");
                        editor.putString("district" ,"গাজীপুর ");
                        editor.commit();
                        startActivity(in3);
                        finish();
                        break;
                    case 4:
                        Intent in4 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"d");
                        editor.putString("district" ,"গোপালগঞ্জ");
                        editor.commit();
                        startActivity(in4);
                        finish();
                        break;
                    case 5:
                        Intent in5 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"l");
                        editor.putString("district" ,"কিশোরগঞ্জ");
                        editor.commit();
                        startActivity(in5);
                        finish();
                        break;
                    case 6:
                        Intent in6 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"b");
                        editor.putString("district" ,"মাদারীপুর");
                        editor.commit();
                        startActivity(in6);
                        finish();
                        break;
                    case 7:
                        Intent in7 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"c");
                        editor.putString("district" ,"মানিকগঞ্জ");
                        editor.commit();
                        startActivity(in7);
                        finish();
                        break;
                    case 8:
                        Intent in8 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"k");
                        editor.putString("district" ,"মুন্সিগঞ্জ");
                        editor.commit();
                        startActivity(in8);
                        finish();
                        break;
                    case 9:
                        Intent in9 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"k");
                        editor.putString("district" ,"নারায়ণগঞ্জ");
                        editor.commit();
                        startActivity(in9);
                        finish();
                        break;
                    case 10:
                        Intent in10 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"l");
                        editor.putString("district" ,"নরসিংদী");
                        editor.commit();
                        startActivity(in10);
                        finish();
                        break;
                    case 11:
                        Intent in11 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"c");
                        editor.putString("district" ,"রাজবাড়ী");
                        editor.commit();
                        startActivity(in11);
                        finish();
                        break;
                    case 12:
                        Intent in12 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"k");
                        editor.putString("district" ,"শরিয়তপুর");
                        editor.commit();
                        startActivity(in12);
                        finish();
                        break;
                    case 13:
                        Intent in13 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"h");
                        editor.putString("district" ,"দিনাজপুর");
                        editor.commit();
                        startActivity(in13);
                        finish();
                        break;
                    case 14:
                        Intent in14 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"e");
                        editor.putString("district" ,"গাইবান্ধা");
                        editor.commit();
                        startActivity(in14);
                        finish();
                        break;
                    case 15:
                        Intent in15 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"d");
                        editor.putString("district" ,"কুড়িগ্রাম");
                        editor.commit();
                        startActivity(in15);
                        finish();
                        break;
                    case 16:
                        Intent in16 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"e");
                        editor.putString("district" ,"লালমনিরহাট");
                        editor.commit();
                        startActivity(in16);
                        finish();
                        break;
                    case 17:
                        Intent in17 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"h");
                        editor.putString("district" ,"নীলফামারী");
                        editor.commit();
                        startActivity(in17);
                        finish();
                        break;
                    case 18:
                        Intent in18 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"i");
                        editor.putString("district" ,"পঞ্চগড়");
                        editor.commit();
                        startActivity(in18);
                        finish();
                        break;
                    case 19:
                        Intent in19 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"f");
                        editor.putString("district" ,"রংপুর");
                        editor.commit();
                        startActivity(in19);
                        finish();
                        break;
                    case 20:
                        Intent in20 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"i");
                        editor.putString("district" ,"ঠাকুরগাঁও");
                        editor.commit();
                        startActivity(in20);
                        finish();
                        break;
                    case 21:

                        Intent in21 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"f");
                        editor.putString("district" ,"বগুড়া");
                        editor.commit();
                        startActivity(in21);
                        finish();
                        break;
                    case 22:
                        Intent in22 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"f");
                        editor.putString("district" ,"পাবনা");
                        editor.commit();
                        startActivity(in22);
                        break;
                    case 23:
                        Intent in23 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"h");
                        editor.putString("district" ,"রাজশাহী");
                        editor.commit();
                        startActivity(in23);
                        finish();
                        break;
                    case 24:
                        Intent in24 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"g");
                        editor.putString("district" ,"জয়পুরহাট");
                        editor.commit();
                        startActivity(in24);
                        finish();
                        break;
                    case 25:
                        Intent in25 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"j");
                        editor.putString("district" ,"চাঁপাইনবাবগঞ্জ ");
                        editor.commit();
                        startActivity(in25);
                        finish();
                        break;
                    case 26:
                        Intent in26 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"g");
                        editor.putString("district" ,"নওগাঁ");
                        editor.commit();
                        startActivity(in26);
                        finish();
                        break;
                    case 27:
                        Intent in27 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"g");
                        editor.putString("district" ,"নাটোর");
                        editor.commit();
                        startActivity(in27);
                        finish();
                        break;
                    case 28:
                        Intent in28 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"d");
                        editor.putString("district" ,"সিরাজগঞ্জ");
                        editor.commit();
                        startActivity(in28);
                        finish();
                        break;
                    case 29:
                        Intent in29 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"o");
                        editor.putString("district" ,"হবিগঞ্জ");
                        editor.commit();
                        startActivity(in29);
                        finish();
                        break;
                    case 30:
                        Intent in30 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"p");
                        editor.putString("district" ,"মৌলভীবাজার");
                        editor.commit();
                        startActivity(in30);
                        finish();
                        break;
                    case 31:

                        Intent in31 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"n");
                        editor.putString("district" ,"সুনামগঞ্জ");
                        editor.commit();

                        startActivity(in31);
                        finish();
                        break;
                    case 32:
                        Intent in32 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"p");
                        editor.putString("district" ,"সিলেট");
                        editor.commit();
                        startActivity(in32);
                        finish();
                        break;
                    case 33:
                        Intent in33 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"k");
                        editor.putString("district" ,"ময়মনসিংহ");
                        editor.commit();
                        startActivity(in33);
                        finish();
                        break;
                    case 34:
                        Intent in34 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"c");
                        editor.putString("district" ,"শেরপুর");
                        editor.commit();
                        startActivity(in34);
                        finish();
                        break;
                    case 35:
                        Intent in35 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"c");
                        editor.putString("district" ,"জামালপুর");
                        editor.commit();
                        startActivity(in35);
                        finish();
                        break;
                    case 36:
                        Intent in36 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"l");
                        editor.putString("district" ,"নেত্রকোনা");
                        editor.commit();
                        startActivity(in36);
                        finish();
                        break;
                    case 37:
                        Intent in37 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"c");
                        editor.putString("district" ,"বরগুনা");
                        editor.commit();
                        startActivity(in37);
                        finish();
                        break;
                    case 38:
                        Intent in38 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"k");
                        editor.putString("district" ,"বরিশাল");
                        editor.commit();
                        startActivity(in38);
                        finish();
                        break;
                    case 39:
                        Intent in39 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"l");
                        editor.putString("district" ,"ভোলা");
                        editor.commit();
                        startActivity(in39);
                        finish();
                        break;
                    case 40:
                        Intent in40 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"b");
                        editor.putString("district" ,"ঝালকাঠি");
                        editor.commit();
                        startActivity(in40);
                        finish();
                        break;
                    case 41:

                        Intent in41 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"b");
                        editor.putString("district" ,"পটুয়াখালী");
                        editor.commit();
                        startActivity(in41);
                        finish();
                        break;
                    case 42:
                        Intent in42 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"c");
                        editor.putString("district" ,"পিরোজপুর");
                        editor.commit();
                        startActivity(in42);
                        finish();
                        break;
                    case 43:
                        Intent in43 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"d");
                        editor.putString("district" ,"বাগেরহাট");
                        editor.commit();
                        startActivity(in43);
                        finish();
                        break;
                    case 44:
                        Intent in44 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"h");
                        editor.putString("district" ,"চুয়াডাঙ্গা");
                        editor.commit();
                        startActivity(in44);
                        finish();
                        break;
                    case 45:
                        Intent in45 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"f");
                        editor.putString("district" ,"যশোর");
                        editor.commit();
                        startActivity(in45);
                        finish();
                        break;
                    case 46:
                        Intent in46 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"f");
                        editor.putString("district" ,"ঝিনাইদহ");
                        editor.commit();
                        startActivity(in46);
                        finish();
                        break;
                    case 47:
                        Intent in47 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"e");
                        editor.putString("district" ,"খুলনা");
                        editor.commit();
                        startActivity(in47);
                        finish();
                        break;
                    case 48:
                        Intent in48 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"f");
                        editor.putString("district" ,"কুষ্টিয়া");
                        editor.commit();
                        startActivity(in48);
                        finish();
                        break;
                    case 49:
                        Intent in49 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"e");
                        editor.putString("district" ,"মাগুরা");
                        editor.commit();
                        startActivity(in49);
                        finish();
                        break;
                    case 50:
                        Intent in50 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"i");
                        editor.putString("district" ,"মেহেরপুর");
                        editor.commit();
                        startActivity(in50);
                        finish();
                        break;
                    case 51:

                        Intent in51 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"e");
                        editor.putString("district" ,"নড়াইল");
                        editor.commit();
                        startActivity(in51);
                        finish();
                        break;
                    case 52:
                        Intent in52 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"g");
                        editor.putString("district" ,"সাতক্ষীরা ");
                        editor.commit();
                        startActivity(in52);
                        finish();
                        break;
                    case 53:
                        Intent in53 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"r");
                        editor.putString("district" ,"বান্দরবান");
                        editor.commit();
                        startActivity(in53);
                        finish();
                        break;
                    case 54:
                        Intent in54 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"m");
                        editor.putString("district" ,"ব্রাহ্মণবাড়িয়া");
                        editor.commit();
                        startActivity(in54);
                        finish();
                        break;
                    case 55:
                        Intent in55 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"l");
                        editor.putString("district" ,"চাঁদপুর");
                        editor.commit();
                        startActivity(in55);
                        finish();
                        break;
                    case 56:
                        Intent in56 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"p");
                        editor.putString("district" ,"চট্টগ্রাম");
                        editor.commit();
                        startActivity(in56);
                        finish();
                        break;
                    case 57:
                        Intent in57 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"n");
                        editor.putString("district" ,"কুমিল্লা");
                        editor.commit();
                        startActivity(in57);
                        finish();
                        break;
                    case 58:
                        Intent in58 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"q");
                        editor.putString("district" ,"কক্সবাজার");
                        editor.commit();
                        startActivity(in58);
                        finish();
                        break;
                    case 59:
                        Intent in59 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"o");
                        editor.putString("district" ,"ফেনী ");
                        editor.commit();
                        startActivity(in59);
                        finish();
                        break;
                    case 60:
                        Intent in60 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"q");
                        editor.putString("district" ,"খাগড়াছড়ি");
                        editor.commit();
                        startActivity(in60);
                        finish();
                        break;
                    case 61:

                        Intent in61 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"l");
                        editor.putString("district" ,"লক্ষ্মীপুর");
                        editor.commit();

                        startActivity(in61);
                        finish();
                        break;

                    case 62:
                        Intent in63 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"m");
                        editor.putString("district" ,"নোয়াখালী");
                        editor.commit();
                        startActivity(in63);
                        finish();
                        break;
                    case 63:
                        Intent in64 = new Intent(Settings.this , MainActivity.class);
                        editor.putString("value_key" ,"r");
                        editor.putString("district" ,"রাঙামাটি");
                        editor.commit();
                        startActivity(in64);
                        finish();
                        break;


                    default:
                        break;
                }

            }

        });

        ImageView back = (ImageView) findViewById(R.id.backHadis);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Settings.this , MainActivity.class);
                startActivity(back);
                finish();
            }
        });


    }

}
