package com.example.tommyhard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_screen);
    }
    public void onLoginButtonClick(View v)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void onFriendsButtonClick(View v)
    {
        Intent intent = new Intent(this, FriendsActivity.class);
        startActivity(intent);
    }
    public void onPlaylistButtonClick(View v)
    {
        Intent intent = new Intent(this, PlaylistActivity.class);
        startActivity(intent);
    }
    public void onSettingsButtonClick(View v)
    {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}