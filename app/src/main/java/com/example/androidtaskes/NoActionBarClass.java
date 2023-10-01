package com.example.androidtaskes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class NoActionBarClass extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }
    }
}
