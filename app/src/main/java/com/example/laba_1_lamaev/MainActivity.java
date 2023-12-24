package com.example.laba_1_lamaev;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_main);

        // Находим кнопку по ее идентификатору в разметке
        Button btnNext = findViewById(R.id.btnNext);

        // Устанавливам обработчик клика по кнопке
         btnNext.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 // Вызываем метод для перехода на вторую активити
                 goToSecondActivity();
             }
         });

    }

    private void goToSecondActivity()
    {
        // Получаем данные из полей ввода
        String firstName = ((EditText) findViewById(R.id.etFirstName)).getText().toString();
        String lastName = ((EditText) findViewById(R.id.etLastName)).getText().toString();
        int age = Integer.parseInt(((EditText) findViewById(R.id.etAge)).getText().toString());
        float salary = Float.parseFloat(((EditText) findViewById(R.id.etSalary)).getText().toString());

        // Создание объекта User и установка данных
        User user = new User (firstName, lastName, age, salary);

        // Передача данных во вторую активити

        Intent intent = new Intent(this, SecondActivity.class);
        // преобразуем объект User в JSON строку
        intent.putExtra("user", user.toJsonString());
        startActivity(intent);

    }

}
