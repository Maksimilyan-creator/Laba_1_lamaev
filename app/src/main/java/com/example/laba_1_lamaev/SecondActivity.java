package com.example.laba_1_lamaev;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Получение данных из Intent
        String jsonUser = getIntent().getStringExtra("user");

        //Десериализация JSON строки в объект User

        User user = new Gson().fromJson(jsonUser, User.class);

        // Отображение данных в TextView
        TextView tvUserData = findViewById(R.id.tvUserData);
        tvUserData.setText("Name: " + user.getFirstName() + " " + user.getLastName() +
                "\nAge: " + user.getAge() +
                "\nSalary: " + user.getSalary());

    }
}
