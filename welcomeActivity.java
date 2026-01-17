package com.example.randomoutfitgenerator;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button continueBtn = findViewById(R.id.continueBtn);

        continueBtn.setOnClickListener(view -> {
            Intent intent = new Intent(WelcomeActivity.this, NameActivity.class);
            startActivity(intent);
        });
    }
}
