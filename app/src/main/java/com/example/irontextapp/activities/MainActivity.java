package com.example.irontextapp.activities;

import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.irontextapp.CustomMediaPlayer;
import com.example.irontextapp.R;

public class MainActivity extends AppCompatActivity {
	VideoView video;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (getSupportActionBar() != null) getSupportActionBar().hide();
//		String path = "android.resource://" + getPackageName() + "/" + R.raw.logo_anim;
//		Uri uri = Uri.parse(path);
//		video= findViewById(R.id.loadingAnimation);
//		video.setVideoURI(uri);
//		video.setOnCompletionListener((mp -> {
//			video.start();
//		}));
//
//		video.start();
//		video.requestFocus();
	}
}