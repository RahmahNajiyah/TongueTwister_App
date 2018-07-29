package com.rahmahnajiyahimtihan.tonguetwister;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by User on 2/22/2018.
 */

public class Adapter extends ArrayAdapter {

    private final Activity context;
    private final String option[];
    private final String arti[];
    private final String posisi[];
    private final int audio[];//ini namanya construct klo ini gk dibuat nanti publicnya jd red (ublic=yg dibawah ini)

    Button play;
    static MediaPlayer mp;


    public Adapter(Activity context, String[] option, String[] arti, int[] audio, String[] posisi) {
        super(context, R.layout.listitem, option);
        this.context = context;
        this.option = option;
        this.arti = arti;
        this.posisi = posisi;
        this.audio = audio;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.listitem, null, true);
        TextView textview = (TextView) v.findViewById(R.id.txtoption);
        TextView text2 = (TextView) v.findViewById(R.id.txtarti);
        play = (Button) v.findViewById(R.id.btnplay);


        textview.setText(option[position]);
        text2.setText(arti[position]);
        mp = MediaPlayer.create(context, audio[position]);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()){
                    mp.stop();
                    mp = MediaPlayer.create(context, audio[position]);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(context, audio[position]);
                    mp.start();
                }

//                if (play.getText().toString().equals("Pause") && mp.isPlaying()){
//                    mp.pause();
//                    play.setText("Resume");
//                }else if (play.getText().toString().equals("Resume")) {
//                    mp.start();
//                    play.setText("Pause");
//                }

            }
        });


        //PERCOBAAN

//        stop.setEnabled(false);

//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();
//                mediaPlayer = MediaPlayer.create(getContext(), audio[position]);
//                mediaPlayer.start();
//                if (play.getText().toString().equals("Pause") && mediaPlayer.isPlaying()){
//                    mediaPlayer.pause();
//                    play.setText("Resume");
//                }else if (play.getText().toString().equals("Resume")){
//                    mediaPlayer.start();
//                    play.setText("Pause");
//                } else {
//                    mediaPlayer = new MediaPlayer();
//                    // URI = uniform resource idetifier
//                   // Uri uri = Uri.parse("android.resource://"+ "com.rahmahnajiyahimtihan.tonguetwister.ListEasy" + "/" + audio[position]);
//                    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//
//                    try {
//                        mediaPlayer = MediaPlayer.create(getContext(), audio[position]);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    try {
//                        mediaPlayer.prepare();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    mediaPlayer.start();
//                    stop.setEnabled(true);
//                    play.setText("Pause");
//                }
//
//            }
//        });
//
//        stop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mediaPlayer != null && mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                    stop.setEnabled(false);
//                    play.setEnabled(true);
//                    play.setText("Play");
//                }
//            }

        return v;
    }


}

