package com.example.cvpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name2 = findViewById(R.id.textView3);
        TextView age2 = findViewById(R.id.textView4);
        TextView job2 = findViewById(R.id.textView5);
        TextView number2 = findViewById(R.id.textView7);
        TextView email2 = findViewById(R.id.textView8);

        Bundle bundle = getIntent().getExtras();

        String name3 = bundle.getString("name");
        String age3 = bundle.getString("age");
        String job3 = bundle.getString("job");
        String number3 = bundle.getString("number");
        String email3 = bundle.getString("email");

        name2.setText(name3);
        age2.setText(age3);
        job2.setText(job3);
        number2.setText(number3);
        email2.setText(email3);


    }
}