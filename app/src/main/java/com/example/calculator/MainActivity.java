package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultField; // текстовое поле для вывода результата
    EditText numberField;   // поле для ввода числа
    TextView operationField; // текстовое поле для вывода знака операции


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // все поля по id из activity_main.xml

        resultField =(TextView) findViewById(R.id. resultField);
        numberField=(EditText) findViewById(R.id.numberField);
        operationField= (TextView) findViewById(R.id.operationField);
    }

    // обработка нажатия на число
    public void onNumberClick(View view) {

        Button button = (Button)view;
        numberField.append(button.getText());


    }
}
