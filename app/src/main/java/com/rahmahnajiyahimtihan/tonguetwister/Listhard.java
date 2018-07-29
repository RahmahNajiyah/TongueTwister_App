package com.rahmahnajiyahimtihan.tonguetwister;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listhard extends AppCompatActivity {

    ListView listhard;

    String option[] = {
            "Betty butter:\n Betty bought some butter, but the butter Betty bought was bitter,so Betty bought some better butter, and the better butter Betty bought was better than the bitter butter Betty bought before!",

            "Biscuit mixer:\n I bought a bit of baking powder and baked a batch of biscuits. I brought a big basket of biscuits back to the bakery and baked a basket of big biscuits. Then I took the big basket of biscuits and the basket of big biscuits and mixed the big biscuits with the basket of biscuits that was next to the big basket and put a bunch of biscuits from the basket into a biscuit mixer and brought the basket of biscuits and the box of mixed biscuits and the biscuit mixer to the bakery and opened a tin of sardines.",

            "Doctor doctoring:\n When a doctor doctors a doctor, does the doctor doing the doctoring doctor as the doctor being doctored wants to be doctored or does the doctor doing the doctoring doctor as he wants to doctor?",

            "Mary Mac:\n Mary Mac's mother's making Mary Mac marry me. My mother's making me marry Mary Mac. Will I always be so Merry when Mary's taking care of me? Will I always be so merry when I marry Mary Mac?",

            "Nature watcher:\n Out in the pasture the nature watcher watches the catcher. While the catcher watches the pitcher who pitches the balls. Whether the temperature's up or whether the temperature's down, the nature watcher, the catcher and the pitcher are always around. The pitcher pitches, the catcher catches and the watcher watches. So whether the temperature's rises or whether the temperature falls the nature watcher just watches the catcher who's watching the pitcher who's watching the balls.",

            "Wish to wish:\n I wish to wish the wish you wish to wish, but if you wish the wish the witch wishes, I won't wish the wish you wish to wish."


};

    String arti[] = {
            "Betty membeli beberapa mentega, tapi mentega Betty yang dibeli itu pahit, Jadi Betty membeli mentega yang lebih baik, dan mentega yang lebih baik yang dibeli Betty lebih baik daripada roti Betty yang pahit sebelumnya!",

            "Saya membeli sedikit roti bakar dan memanggang sejumlah biskuit. Aku membawa sekotak besar biskuit kembali ke toko roti dan memanggang sekeranjang biskuit besar. Lalu aku mengambil sekeranjang besar biskuit dan sekeranjang biskuit besar dan mencampur biskuit besar itu dengan keranjang biskuit yang berada di samping keranjang besar dan menaruh sekotak biskuit dari keranjang ke dalam mixer biskuit dan membawa sekotak biskuit. dan kotak biskuit campuran dan mixer biskuit ke toko roti dan membuka kaleng sarden.",

            "Ketika dokter dokter dokter, apakah dokter melakukan doktor dokter karena dokter sedang diobati ingin diobati atau apakah dokter melakukan doktor sesuai keinginan dokter?",

            "Ibu Mary Mac membuat Mary Mac menikah denganku. Ibuku membuatku menikah dengan Mary Mac. Akankah saya selalu begitu Merry saat Mary merawat saya? Akankah saya selalu bersukacita saat menikah dengan Mary Mac?",

            "Di padang rumput pengamat alam mengamati penangkap. Sementara penangkap melihat teko yang melempar bola. Apakah suhu naik atau apakah suhu turun, pengamat alam, penangkap dan teko selalu ada. Pitcher pitcher, catcher catches dan watcher watches. Jadi, apakah suhu naik atau apakah suhu turun pengamat alam hanya melihat penangkap yang sedang melihat pitcher yang sedang menonton bola.",

            "Saya ingin mengharapkan keinginan yang Anda inginkan, tapi jika Anda menginginkan keinginan sang penyihir, saya tidak akan menginginkan keinginan yang Anda inginkan."

};
    String posisi[] = {
            "1", "2", "3", "4", "5", "6"
    };

    int audio[] = {
            R.raw.bettybutter_h, R.raw.biscuitmixer_h, R.raw.doctordoctoring_h, R.raw.maryacmarry_h, R.raw.naturewatcher_h, R.raw.wishtowish_h

    };

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listhard);

        listhard = (ListView) findViewById(R.id.listhard);

        mp = new MediaPlayer();
        //adapterlistview
        Adapter AdapterListView = new Adapter (this, option, arti, audio, posisi);
        listhard.setAdapter(AdapterListView);

        listhard.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                if (listhard.getItemAtPosition(position)=="1") {
//                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.bettybutter_h);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listhard.getItemAtPosition(position)=="2") {
//                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.biscuitmixer_h);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listhard.getItemAtPosition(position)=="3") {
//                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.doctordoctoring_h);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listhard.getItemAtPosition(position)=="4") {
//                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.maryacmarry_h);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//
//                if (listhard.getItemAtPosition(position)=="5") {
//                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.naturewatcher_h);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
//                }
//                if (listhard.getItemAtPosition(position)=="6") {
//                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.wishtowish_h);
//                    mp.start();
//                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        public void onCompletion(MediaPlayer mp) {
//                            mp.release();
//                        }
//                    });
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
