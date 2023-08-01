package com.example.tmsandroid;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private EditText editText;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonID) {
            Toast.makeText(this,"Btn clicked", Toast.LENGTH_SHORT).show();
            textView.setText("Hello " + editText.getText().toString());
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHello = findViewById(R.id.buttonID);
        btnHello.setOnClickListener(this);
        editText = findViewById(R.id.textNameID);
        textView = findViewById(R.id.textViewID);
    }
}
