package com.example.ted.capital;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
         protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);




        Button button = (Button)findViewById(R.id.videobutton);
        getWindow().setFormat(PixelFormat.UNKNOWN);

        VideoView mVideoView2 = (VideoView)findViewById(R.id.dublinvideo);

        String uriPath2 = "android.resource://com.example.toyo.playvideo/"+R.raw.movie;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();


        button.setOnClickListener(new Button.OnClickListener() {

                                               @Override
                                           public void onClick(View v) {
                                                   VideoView mVideoView2 = (VideoView) findViewById(R.id.dublinvideo);

                                                   String uriPath = "android.resource://com.example.toyo.playvideo/" + R.raw.movie;
                                                   Uri uri2 = Uri.parse(uriPath);
                                                   mVideoView2.setVideoURI(uri2);
                                                   mVideoView2.requestFocus();
                                                   mVideoView2.start();
                                               }

                                            });





        Button button1 = (Button)findViewById(R.id.family);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Family.class);
                startActivity(intent);
            }

        });


        Button button2 = (Button)findViewById(R.id.nightlife);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), nightlife.class);
                startActivity(intent);
            }

        });



        Button button3 = (Button)findViewById(R.id.tours);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), tours.class);
                startActivity(intent);
            }

        });


        Button button4 = (Button)findViewById(R.id.shops);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Shop.class);
                startActivity(intent);
            }

        });






        Button button5 = (Button)findViewById(R.id.historic);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivity(intent);
            }

        });



        Button button6 = (Button)findViewById(R.id.bed);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), accommodation.class);
                startActivity(intent);
            }

        });

        Button button7 = (Button)findViewById(R.id.food);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), food.class);
                startActivity(intent);
            }

        });






    }
}