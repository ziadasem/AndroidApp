package com.example.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;


public class JavaActivity extends AppCompatActivity {

    Button flutterJavaNavigationButton;
    Button kotlinSendingButton ;

    TextInputLayout textInputLayout ;

    TextView resultTV ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, KotlinActivity.class);
        String value = intent.getStringExtra("value");
        flutterJavaNavigationButton =  findViewById(R.id.flutterJavaNavigationButton);
        kotlinSendingButton =  findViewById(R.id.kotlinSendingButton);
        textInputLayout = findViewById(R.id.inputField);
        resultTV = findViewById(R.id.resultTV);
        resultTV.setText(value == null? "" : value);
        kotlinSendingButton.setOnClickListener(view -> navigateToKotlin());
    }

    void navigateToKotlin(){
        Intent intent = new Intent(this, KotlinActivity.class);
        //
        intent.putExtra("value", textInputLayout.getEditText().getText().toString() );
        startActivity(intent);
    }

}
