package com.example.shop5.NADA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shop5.Catedories.BathroomActivity;
import com.example.shop5.Catedories.BedroomActivity;
import com.example.shop5.Catedories.GardenActivity;
import com.example.shop5.Catedories.KichenActivity;
import com.example.shop5.Catedories.LivingroomActivity;
import com.example.shop5.Panel.CartActivity;
import com.example.shop5.Panel.FavoritesActivity;
import com.example.shop5.Panel.HomeActivity;
import com.example.shop5.Panel.ProfileActivity;
import com.example.shop5.R;

public class CategoriesActivity extends AppCompatActivity
{
    private ImageView kitchen, bedroom, garden, bathroom, livingroom;
    private ImageView home, cart, map, favorites, user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        home = (ImageView) findViewById(R.id.home);
        cart = (ImageView) findViewById(R.id.cart);
        favorites = (ImageView) findViewById(R.id.favorites);
        user = (ImageView) findViewById(R.id.user);

        otbor();

        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, KichenActivity.class);
                intent.putExtra("category", "кухня");
                startActivity(intent);
            }
        });

        bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, BedroomActivity.class);
                intent.putExtra("category", "спальня");
                startActivity(intent);
            }
        });

        garden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, GardenActivity.class);
                intent.putExtra("category", "сад");
                startActivity(intent);
            }
        });

        bathroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, BathroomActivity.class);
                intent.putExtra("category", "ванная");
                startActivity(intent);
            }
        });

        livingroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, LivingroomActivity.class);
                intent.putExtra("category", "гостинная");
                startActivity(intent);
            }
        });
    }

    private void otbor(){
        kitchen = findViewById(R.id.kitchen);
        bedroom = findViewById(R.id.bedroom);
        garden = findViewById(R.id.garden);
        bathroom = findViewById(R.id.bathroom);
        livingroom = findViewById(R.id.livingroom);



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(CategoriesActivity.this, HomeActivity.class);
                startActivity(loginIntent);
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(CategoriesActivity.this, CartActivity.class);
                startActivity(loginIntent);
            }
        });

        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(CategoriesActivity.this, FavoritesActivity.class);
                startActivity(loginIntent);
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(CategoriesActivity.this, ProfileActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}