package com.example.smd_ass_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddRestaurantActivity extends AppCompatActivity {

    EditText restaurantNameEditText, phoneNumberEditText, locationEditText, descriptionEditText, ratingEditText;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_restuarant_activity);
        restaurantNameEditText = findViewById(R.id.restaurantNameEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        locationEditText = findViewById(R.id.locationEditText);
        descriptionEditText = findViewById(R.id.descriptionEditText);
        ratingEditText = findViewById(R.id.ratingEditText);
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve text from EditText fields
                String name = restaurantNameEditText.getText().toString();
                String phone = phoneNumberEditText.getText().toString();
                String location = locationEditText.getText().toString();
                String description = descriptionEditText.getText().toString();
                String rating = ratingEditText.getText().toString();

                // Create a new Restaurant object
                Restuarant restaurant = new Restuarant(name, location, phone, description, rating);
                // Pass the Restaurant object back to MainActivity
                Intent resultIntent = new Intent();
                resultIntent.putExtra("restaurant", restaurant);
                setResult(RESULT_OK, resultIntent);
                finish(); // Close the AddRestaurantActivity
            }
        });
    }
}
