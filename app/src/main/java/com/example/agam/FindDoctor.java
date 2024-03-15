package com.example.agam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class FindDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        MaterialButton backButton = findViewById(R.id.cardFDBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to be taken when the button is clicked
                // For example, navigate back to the previous activity
                finish(); // Close the current activity and return to the previous one
            }
        });

        // You can add more functionality here if needed
    }
}
