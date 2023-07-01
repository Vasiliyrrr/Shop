package com.example.shop5.NADA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.shop5.R;

public class PodActivity extends AppCompatActivity
{
    private String categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pod);

        categoryName = getIntent().getExtras().get("category").toString();

        Toast.makeText(this, "Категория: " + categoryName, Toast.LENGTH_SHORT).show();
    }
}