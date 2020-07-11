package com.sabithpkcmnr.onesignal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello, this is a Toast message", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Hello, this is second Toast", Toast.LENGTH_SHORT).show();

    }
}