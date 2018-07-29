package com.rahmahnajiyahimtihan.tonguetwister;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListEasy extends AppCompatActivity {

    ListView listeasy;

    String option[] = {
            "Big black bear :\n A big black bug bit the big black bear, but the big black bear bit the big black bug back!",
            "clam cream can :\nHow can a clam cram in a clean cream",
            "Sandwich sane witch:\n There's a sandwich on the sand which was sent by a sane witch",
            "Spell New York:\n Knife and a fork, bottle and a cork, that is the way you spell New York",
            "I saw Susie:\n I saw Susie sitting in a shoe shine shop"
    };

    String arti[] = {
            "Kutu hitam besar menggigit beruang hitam besar, tapi beruang hitam besar sedikit mengusik bug hitam besar!",
            "Bagaimana kerang kerang dalam krim bersih",
            "Ada sandwich di pasir yang dikirim oleh penyihir waras",
            "Pisau dan garpu, botol dan gabus, begitulah cara Anda mengeja New York",
            "Saya melihat Susie duduk di sebuah toko shine sepatu"
    };
    String posisi[] = {
            "1", "2", "3", "4", "5"
    };

    int audio[] = {
            R.raw.bigblackbearback_easy, R.raw.clamcreamcan_easy, R.raw.sandwichsanewitch_easy, R.raw.spellnewyork_easy, R.raw.isawsussie_easy

    };

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_easy);

        listeasy = (ListView) findViewById(R.id.listeasy);

        mp = new MediaPlayer();


        //adapterlistview
        Adapter AdapterListView = new Adapter (this, option, arti, audio, posisi);
        listeasy.setAdapter(AdapterListView);

        listeasy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                if (listeasy.getItemAtPosition(position)=="1") {
//                    mp = MediaPlayer.create(getApplicationContext(),R.raw.bigblackbearback_easy);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listeasy.getItemAtPosition(position)=="2") {
//                    mp = MediaPlayer.create(getApplicationContext(),R.raw.clamcreamcan_easy);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listeasy.getItemAtPosition(position)=="3") {
//                    mp = MediaPlayer.create(getApplicationContext(),R.raw.sandwichsanewitch_easy);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listeasy.getItemAtPosition(position)=="4") {
//                    mp = MediaPlayer.create(getApplicationContext(),R.raw.spellnewyork_easy);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listeasy.getItemAtPosition(position)=="5") {
//                    mp = MediaPlayer.create(getApplicationContext(),R.raw.isawsussie_easy);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//
//                }



            }
        });
    }

    @Override
    public void onBackPressed() {
        Adapter.mp.stop();
        super.onBackPressed();
    }
}
