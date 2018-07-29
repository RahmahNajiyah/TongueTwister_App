package com.rahmahnajiyahimtihan.tonguetwister;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listmedium extends AppCompatActivity {

    ListView listmedium;

    String option[] = {
            "Can you can a can:\n Can you can a can as a canner can can a can?",

            "Copyright:\n When you write copy you have the right to copyright the copy you write.",

            "Fuzzy wuzzy:\n Fuzzy Wuzzy was a bear, Fuzzy Wuzzy had no hair, Fuzzy Wuzzy wasn't very fuzzy, was he?",

            "Good cook :\n How many cookies could a good cook cook If a good cook could cook cookies? A good cook could cook as much cookies as a good cook who could cook cookies",

             "How many cans ?:\n How many cans can a cannibal nibble, if a cannibal can nibble cans? As many cans as a cannibal can nibble if a cannibal can nibble cans",

            "I thought of thinking:\n I thought, I thought of thinking of thanking you",

             "one one :\n One-one was a race horse. Two-two was one too. One-one won one race.Two-two won one too.",

            "Peter piper:\n Peter Piper picked a peck of pickled peppers. A peck of pickled peppers Peter Piper picked. If Peter Piper picked a peck of pickled peppers, Where's the peck of pickled peppers Peter Piper picked?",

            "Thirty three thieves:\n The thirty-three thieves thought that they thrilled the throne throughout Thursday.",

            "Two witches, two watches:\n If two witches would watch two watches, which witch would watch which watch?",

            "Understand:\n If you understand, say understand. If you don't understand, say don't understand. But if you understand and say don't understand. how do I understand that you understand?",

            "Whether the weather:\n Whether the weather be fine, or whether the weather be not.Whether the weather be cold, or whether the weather be hot. We'll weather the weather whether we like it or not.",


};

    String arti[] = {
            "Dapatkah Anda bisa sekaleng sebagai canner bisa bisa?",

            "Saat Anda menulis salinan, Anda berhak menyalin salinan yang Anda tulis.",

            "Fuzzy Wuzzy beruang, Fuzzy Wuzzy tidak memiliki rambut, Fuzzy Wuzzy tidak terlalu kabur, kan?",

            "Berapa banyak kue yang bisa dimasak dengan baik. Jika juru masak yang baik bisa memasak kue? Seorang juru masak yang baik bisa memasak kue sebanyak juru masak yang bisa memasak kue",

            "Berapa banyak kaleng yang dapat dimakan canibibal, jika kanibal bisa menggigit kaleng? Seperti kaleng sebanyak kanibal bisa menggigit jika kanibal bisa menggigit kaleng",

            "Saya pikir, saya berpikir untuk berterima kasih kepada Anda",

            "Satu-satu adalah kuda pacuan. Dua dua juga satu. Satu-satu memenangkan satu balapan.Dua dua menang juga.",

            "Peter Piper mengambil secangkir paprika acar. Secercah paprika acar yang dipetik Peter Piper. Jika Peter Piper mengambil secarik paprika acar, di mana kepingan paprika acar yang dipetik Peter Piper?",

            "Tiga puluh tiga pencuri mengira mereka senang menguasai takhta sepanjang hari Kamis.",

            "Jika dua penyihir menonton dua arloji, penyihir mana yang akan menonton jam tangan mana?",

            "Jika Anda mengerti, katakan mengerti . Jika Anda tidak mengerti, katakan tidak mengerti . Tapi jika Anda mengerti dan mengatakan tidak mengerti . bagaimana saya mengerti bahwa anda mengerti?",

            "Apakah cuaca baik-baik saja, atau apakah cuacanya tidak.Apakah cuaca menjadi dingin, atau apakah cuaca panas. Kita akan cuaca baik apakah kita suka atau tidak.",


};
    String posisi[] = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
    };

    int audio[] = {
            R.raw.canyoucan_m, R.raw.copyright_m, R.raw.fuzzywuzzy_m, R.raw.goodcook_m, R.raw.howmanycanscannibalnibble_m, R.raw.ithounghtthankyou_m, R.raw.oneone_m, R.raw.peterpiper_m, R.raw.thirtythreethieves_m, R.raw.twowitches_m, R.raw.understand_m, R.raw.whetherweather_m

    };

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmedium);

        listmedium = (ListView) findViewById(R.id.listmedium);

        mp = new MediaPlayer();


        //adapterlistview
        Adapter AdapterListView = new Adapter (this, option, arti, audio, posisi);
        listmedium.setAdapter(AdapterListView);

        listmedium.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


//                    if (listmedium.getItemAtPosition(position)=="1") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.canyoucan_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="2") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.copyright_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="3") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.fuzzywuzzy_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="4") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.goodcook_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="5") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.howmanycanscannibalnibble_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="6") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.ithounghtthankyou_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="7") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.oneone_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="8") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.peterpiper_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="9") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.thirtythreethieves_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="10") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.twowitches_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="11") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.understand_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }
//                    if (listmedium.getItemAtPosition(position)=="12") {
//                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.whetherweather_m);
//                        mp.start();
//                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            public void onCompletion(MediaPlayer mp) {
//                                mp.release();
//                            }
//                        });
//                    }

            }

        });
    }
    @Override
    public void onBackPressed(){
        Adapter.mp.stop();
        super.onBackPressed();
    }

}