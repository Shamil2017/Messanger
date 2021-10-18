package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {
    TextView txtViewReceiveMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        txtViewReceiveMessage = findViewById(R.id.txtViewReceiveMessage);
        txtViewReceiveMessage.setText(msg);

    }
}