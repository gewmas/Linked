package com.yuhumai.life;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseUser;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.initialize(this, "kGcB1GjFAh49f0m8Ql3u0WXB8DeYrvkFGiIykRI9", "hpboyAR6eZZnthG9hGgvGDZ6tPUVns38qDkiwdgE");
    }

    @Override
    protected void onResume() {
        super.onResume();

        ParseUser currentUser = ParseUser.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(this, TabBarActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Signed In", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }
}
