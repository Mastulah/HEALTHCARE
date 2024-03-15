package com.example.agam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.agam.FindDoctor;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Find the CardView by its id
        CardView cardFindDoctor = findViewById(R.id.cardFindDoctor);

        // Set OnClickListener for the CardView
        cardFindDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event, navigate to FindDoctor activity
                Intent intent = new Intent(HomePage.this, FindDoctor.class);
                startActivity(intent);
            }
        });
    }
}
