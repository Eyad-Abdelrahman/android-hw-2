package com.example.cvpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.editTextTextPersonName2);
        EditText age = findViewById(R.id.editTextTextPersonName3);
        EditText job = findViewById(R.id.editTextTextPersonName4);
        EditText number = findViewById(R.id.editTextTextPersonName5);
        EditText email = findViewById(R.id.editTextTextPersonName6);
        Button next = findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty() || age.getText().toString().isEmpty() || job.getText().toString().isEmpty() || number.getText().toString().isEmpty() || email.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"You forgot to write", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    String name1 = name.getText().toString();
                    String age1 = age.getText().toString();
                    String job1 = job.getText().toString();
                    String number1 = number.getText().toString();
                    String email1 = email.getText().toString();
                    i.putExtra("name", name1);
                    i.putExtra("age", age1);
                    i.putExtra("job", job1);
                    i.putExtra("number", number1);
                    i.putExtra("email", email1);
                    startActivity(i);
                }
            }
        });
    }
}