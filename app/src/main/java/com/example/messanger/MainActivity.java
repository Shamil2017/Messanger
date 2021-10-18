package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void onClickSendMessage(View view) {
        String msg = editTextMessage.getText().toString();
       /* Intent intent = new Intent(this, RecieveMessageActivity.class);
        intent.putExtra("msg", msg);
        startActivity(intent);*/
       Intent intent = new Intent(Intent.ACTION_SEND);
       intent.setType("text/plain");
       intent.putExtra(Intent.EXTRA_TEXT, msg);
       Intent chosenIntent = Intent.createChooser(intent, "Как вы хотите отправить сообщение?");
       startActivity(chosenIntent);

    }
}