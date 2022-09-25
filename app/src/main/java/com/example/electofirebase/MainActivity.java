package com.example.electofirebase;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddFood, bShowImages, bShowFoods2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAddFood = (Button) findViewById(R.id.bAddFood);
        bAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddFood();
            }
        });


        bShowImages = (Button) findViewById(R.id.bShowFoods);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFoods();
            }
        });

    }

    private void showAddFood(){
        Intent intent = new Intent(MainActivity.this, AddFood.class);
        MainActivity.this.startActivity(intent);
    }

    private void showFoods(){
        Intent intent = new Intent(MainActivity.this, ShowFoods.class);
        MainActivity.this.startActivity(intent);
    }

}