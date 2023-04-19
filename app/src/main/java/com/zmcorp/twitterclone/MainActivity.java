package com.zmcorp.twitterclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button buttonz = findViewById(R.id.b_create_account);
        buttonz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity();
            }
        });
    }

    void openDetailActivity(){
        Intent intentz = new Intent(this, PhotoActivity.class);
        startActivity(intentz);
    }
}
