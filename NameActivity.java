package com.example.randomoutfitgenerator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        // Move to MainActivity after 3 seconds
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(NameActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}
